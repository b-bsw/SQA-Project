package org.apache.commons.codec.language;

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
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHH" + "'", str1, "AHH");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!H hi!\000");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!hi!hi!H hi!ahi!H hi!", "A");
        boolean boolean20 = caverphone0.isCaverphoneEqual("hi!HIH", "HHa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "HH");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = 1;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        java.lang.String str26 = doubleMetaphone9.encode("");
        java.lang.Object obj27 = metaphone0.encode((java.lang.Object) "");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "##a", "HH");
        int int31 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (int) (byte) 1, 0, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHHH", (int) (byte) -1, 49, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.encode("hi!A111111111HHI");
        boolean boolean20 = metaphone0.isMetaphoneEqual("hi!hi!a", "HHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("HHa");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("HIHIHIHHIAHIHHI", false);
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("HHHH", "AHHIH", false);
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "#hi!H\000#", " ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        boolean boolean14 = caverphone0.isCaverphoneEqual("a", "4");
        java.lang.String str16 = caverphone0.encode("AHI");
        boolean boolean19 = caverphone0.isCaverphoneEqual("Hhi!HH AHHHHHH", "hi!hi!aAA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("4");
        java.lang.String str15 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str17 = caverphone0.caverphone("hi!H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int33 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("ahi!H hi!");
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "HIHAHIHIHAHIHH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AH" + "'", str37, "AH");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "##a");
        doubleMetaphone0.maxCodeLen = 2;
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H#a", "hi!H4");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "aa1", "hi!A111111111");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', 'H');
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "");
        char char34 = doubleMetaphone0.charAt("hi!Ha", (int) '4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", false);
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int25 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!Hhi!HHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHIHHH" + "'", str1, "HIHHIHHH");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("hi!H hi!");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("a");
        doubleMetaphoneResult15.append('i');
        boolean boolean33 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("\000 ", "HHI");
        java.lang.String str12 = metaphone0.metaphone("hi!4a");
        metaphone0.setMaxCodeLen(65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate('h');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("A", "4hi!Ha");
        boolean boolean6 = metaphone0.isMetaphoneEqual("hi!H", "a");
        java.lang.Class<?> wildcardClass7 = metaphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        boolean boolean31 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate("hi!H hi!\000");
        doubleMetaphoneResult15.append('4');
        boolean boolean36 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate("aa1\000hi!H hi!aA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aHa", "HHhi!HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "hi!HH", false);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("aHHIH", true);
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!A111111111A111111111ahi!H hi!", " #");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("aH", "\000 ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult20.append("A");
        doubleMetaphoneResult20.appendPrimary('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("HHa");
        java.lang.String str20 = caverphone0.caverphone("AA11111111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.encode("HI");
        boolean boolean8 = metaphone0.isMetaphoneEqual("##ahi!", "hi!H ah");
        boolean boolean11 = metaphone0.isMetaphoneEqual("AHI", "HIA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!HHHH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("HHA", " A111111111");
        java.lang.String str18 = caverphone0.caverphone("hi!HHhi!H\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        metaphone0.setMaxCodeLen((int) '1');
        java.lang.String str12 = metaphone0.metaphone("");
        java.lang.String str14 = metaphone0.encode("4hi!HaHIhi!H A111111111hi!HH");
        metaphone0.setMaxCodeLen((int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHH" + "'", str14, "HHHHH");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", false);
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int23 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        java.lang.String str27 = doubleMetaphone0.encode(" HI4AA11111111");
        doubleMetaphone0.maxCodeLen = 49;
        java.lang.String str31 = doubleMetaphone0.encode("hi!4");
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("\000A111111111hi!H ", "hi!hi!#h");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("hi!H ", "HHa");
        java.lang.String str14 = metaphone0.metaphone("aa1");
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.encode("HIA");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("HIH");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!hi!hi!H hi!ahi!H hi!", true);
        int int22 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!Ha");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str31 = doubleMetaphone0.encode("aHIHH");
        doubleMetaphone0.maxCodeLen = '\000';
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "H", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.maxCodeLen;
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H hi!\000", "\000hi!H hi!");
        char char24 = doubleMetaphone0.charAt(" A111111111A111111111", 10);
        int int25 = doubleMetaphone0.getMaxCodeLen();
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '1' + "'", char24 == '1');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        metaphone0.setMaxCodeLen((int) '1');
        boolean boolean13 = metaphone0.isMetaphoneEqual("", "hi!H hi!\000");
        metaphone0.setMaxCodeLen(2);
        metaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "HIH");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H#a", "HIHAHIHHI", false);
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H ah", "#HIHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.getMaxCodeLen();
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("Hhi!");
        java.lang.String str13 = caverphone0.caverphone(" ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.append('\000', '\000');
        java.lang.String str21 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('A', '!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HH", "hi!4a");
        boolean boolean16 = caverphone0.isCaverphoneEqual("H A111111111A111111111", "ahi!H hi!");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa", (int) (byte) 100, (int) 'h', strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("HII", 10, (int) ' ', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000A111111111HII", 49, (int) 'h', strArray22);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000H", (int) (short) 1, 0, strArray22);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!HHHH");
        java.lang.Class<?> wildcardClass14 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendPrimary('4');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!4a" + "'", str27, "hi!4a");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!" + "'", str28, "hi!hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone22.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult37.append("", "hi!");
        doubleMetaphoneResult37.append('H');
        doubleMetaphoneResult37.append("hi!");
        doubleMetaphoneResult37.appendAlternate("");
        doubleMetaphoneResult37.appendAlternate("H");
        java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean53 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult55 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str58 = doubleMetaphone0.doubleMetaphone("hahi!HHHH\000A111111111HII\000H", false);
        java.lang.String str60 = doubleMetaphone0.doubleMetaphone("HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "HH" + "'", str58, "HH");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "H" + "'", str60, "H");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000A111111111hi!H ", " #H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("hi!hi!H hi!", true);
        char char26 = doubleMetaphone0.charAt("AH", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("AA", true);
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000", false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        boolean boolean17 = metaphone0.isMetaphoneEqual("aa", "HI");
        int int18 = metaphone0.getMaxCodeLen();
        boolean boolean21 = metaphone0.isMetaphoneEqual("\000", "hi!A111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        java.lang.String str11 = metaphone0.encode("AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HH", "HIH");
        java.lang.String str15 = metaphone0.encode("hi!4");
        java.lang.String str17 = metaphone0.encode("hi!H ");
        int int18 = metaphone0.getMaxCodeLen();
        java.lang.String str20 = metaphone0.metaphone("\000h");
        int int21 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate('h');
        doubleMetaphoneResult15.appendAlternate("hi!Hhi!HHH");
        doubleMetaphoneResult15.appendAlternate('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "hi!HH", false);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("##a");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "HHHH");
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("hi!H#a");
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("hi!HHHH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        java.lang.String str10 = caverphone0.caverphone("Hhi!");
        java.lang.String str12 = caverphone0.caverphone("HII");
        java.lang.String str14 = caverphone0.caverphone("HHhi!HH");
        java.lang.String str16 = caverphone0.encode(" \000##a");
        java.lang.String str18 = caverphone0.caverphone("H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A111111111" + "'", str18, "A111111111");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        java.lang.String str11 = caverphone0.encode("hi! i");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        char char26 = doubleMetaphone12.charAt("H", (int) (short) 0);
        char char29 = doubleMetaphone12.charAt("H", (int) (byte) -1);
        boolean boolean33 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str35 = doubleMetaphone12.encode("");
        java.lang.String str38 = doubleMetaphone12.doubleMetaphone("hi!H", false);
        java.lang.String str40 = doubleMetaphone12.encode("hi!H");
        int int41 = doubleMetaphone12.maxCodeLen;
        int int44 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone12, "hi!H ", "hi!4");
        java.lang.String str46 = doubleMetaphone12.encode("ahi!H hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = caverphone0.encode((java.lang.Object) doubleMetaphone12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "AH" + "'", str46, "AH");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str11 = metaphone0.encode("#hi!HH4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
        int int30 = doubleMetaphone0.maxCodeLen;
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!Hhi!HH", " #H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4 aH4", "hi!A111111111HHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.encode("HI");
        java.lang.String str12 = caverphone0.caverphone("hi!HHHH");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HIHH", "4");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "a", "hi! i");
        java.lang.String str20 = caverphone0.caverphone("AHI");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (int) ' ', (int) (short) 1, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 100, (int) (byte) 0, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHHII", (int) '1', (int) 'H', strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHa", (int) (short) 1, (int) (short) 100, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("H", false);
        doubleMetaphone0.setMaxCodeLen(49);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        int int28 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult(5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((-1));
        char char25 = doubleMetaphone0.charAt("hi!HHhi!H\000", (int) '!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!", "Hhi!");
        metaphone0.setMaxCodeLen(72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aa1\000hi!H hi!aA", "hi!A111111111HHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        char char25 = doubleMetaphone0.charAt("HIHH", (int) (short) 10);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult28.appendAlternate("hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) '4');
        int int5 = metaphone0.getMaxCodeLen();
        java.lang.String str7 = metaphone0.metaphone("AHII");
        java.lang.String str9 = metaphone0.metaphone("hi!H hi!\000");
        int int10 = metaphone0.getMaxCodeLen();
        int int11 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AH" + "'", str7, "AH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HH" + "'", str9, "HH");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('4', '#');
        doubleMetaphoneResult15.append('h');
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append("4");
        doubleMetaphoneResult15.appendAlternate('a');
        doubleMetaphoneResult15.appendAlternate('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        java.lang.String str14 = metaphone0.metaphone("hi!4");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HIHIAAA", "HIHHII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        boolean boolean14 = caverphone0.isCaverphoneEqual("Hhi!", "hi!H");
        boolean boolean17 = caverphone0.isCaverphoneEqual("4 a", "hi!hi!a");
        java.lang.String str19 = caverphone0.caverphone("ahi!H hi!a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        char char32 = doubleMetaphone0.charAt("hi!HHHH", (int) 'A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!H", "hi!HH");
        java.lang.String str19 = caverphone0.caverphone("HHIHI");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, " HI", "hi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        boolean boolean13 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "AA11111111");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains(" ", 1, 7, strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        java.lang.String str10 = metaphone0.metaphone("");
        java.lang.String str12 = metaphone0.metaphone("HIH");
        int int13 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(104);
        java.lang.String str17 = metaphone0.encode("HIHAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("HIH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        int int22 = doubleMetaphone0.maxCodeLen;
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("ahi!H hi!");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("AHII", "hi!H#h4", false);
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!hi!aAA11111111", "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AH" + "'", str24, "AH");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str16 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!A111111111HHI", "AHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("##a4", " HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("HHHH", true);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Ha", "HHhi!4aH");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!A111111111HHI", "HIH \000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult20.getAlternate();
        java.lang.String str23 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.appendAlternate("\000 ");
        doubleMetaphoneResult20.append('4', 'I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "HIH");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi! i", "AH");
        java.lang.String str22 = caverphone0.caverphone("hi!hi!aAA11111111hi!4hi!H ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("HH");
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = caverphone0.encode(obj11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("H", false);
        int int23 = doubleMetaphone0.maxCodeLen;
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!Ha", "1111111111");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("aa1\000hi!H hi!aA", "HHA", false);
        java.lang.Class<?> wildcardClass31 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "##a");
        doubleMetaphone0.maxCodeLen = 2;
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H#a", "hi!H4");
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "aa1", "hi!A111111111");
        int int34 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH \000", "hi!H ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "##a");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("Hhi!HHhi!A111111111A111111111ahi!H hi!HHa", true);
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("HHIHI");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("hi!H");
        boolean boolean12 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, " A111111111A4hHA111111111", "HIHIAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.encode("HI");
        metaphone0.setMaxCodeLen(8);
        java.lang.String str13 = metaphone0.metaphone("4hi!H hi!\000");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "A111111111", false);
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H", "hi!4", false);
        java.lang.Class<?> wildcardClass30 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("H", "AHI");
        java.lang.String str15 = caverphone0.caverphone(" A1111111111");
        java.lang.String str17 = caverphone0.encode("HIHIHIHHIAHIHHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "HIH");
        doubleMetaphone0.setMaxCodeLen(1);
        java.lang.Class<?> wildcardClass23 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H hi!\000");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("AHHIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append("HI", "hi!");
        doubleMetaphoneResult15.appendAlternate('\000');
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('4', ' ');
        java.lang.String str34 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str35 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!H hi!\000 " + "'", str34, "hi!H hi!\000 ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!H hi!\000 " + "'", str35, "hi!H hi!\000 ");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        java.lang.String str11 = caverphone0.encode("hi!H hi!\000");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "##ahi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.caverphone("hi!H\000");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!A111111111A111111111ahi!H hi!", "4h4");
        java.lang.String str20 = caverphone0.encode("hi!4a");
        java.lang.String str22 = caverphone0.encode("Hhi!hi!4 h ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.append('A');
        doubleMetaphoneResult15.appendPrimary('4');
        doubleMetaphoneResult15.append('i', '1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("HIHHI");
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        java.lang.String str11 = metaphone0.metaphone("hi!4a");
        java.lang.String str13 = metaphone0.encode("HIHIHIHHIAHIHHI");
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.encode("hi!");
        int int17 = metaphone14.getMaxCodeLen();
        metaphone14.setMaxCodeLen((int) (byte) 100);
        boolean boolean22 = metaphone14.isMetaphoneEqual("", "hi!H ");
        java.lang.String str24 = metaphone14.metaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = metaphone0.encode((java.lang.Object) metaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHH" + "'", str13, "HHHH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("A", "Hhi!");
        java.lang.Class<?> wildcardClass14 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('4');
        java.lang.String str25 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append(" A111111111A4hHA111111111", " h ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H4" + "'", str25, "hi!H4");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("hi! i", true);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("\000HHIAA HI", "aH\000", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        java.lang.String str11 = caverphone0.encode("a");
        java.lang.String str13 = caverphone0.caverphone("A111111111");
        java.lang.String str15 = caverphone0.encode("hi!hi!hi!H hi!ahi!H hi!");
        java.lang.String str17 = caverphone0.encode("4");
        java.lang.String str19 = caverphone0.encode("HIHAHIHIHAHIHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "");
        java.lang.String str34 = doubleMetaphone0.doubleMetaphone("hi!4", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult36 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult36.append("AHI", "4H");
        doubleMetaphoneResult36.append('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HHaHIH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.append("A111111111");
        doubleMetaphoneResult15.appendAlternate('a');
        doubleMetaphoneResult15.append("hi!H ");
        doubleMetaphoneResult15.appendAlternate('I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("i#");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "I" + "'", str9, "I");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("##a", "##ahi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("hi!H#a", "H1");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!Hhi!hi!4hi!4hi!Ha", " A111111111hi!hi!aAA11111111");
        org.apache.commons.codec.language.Metaphone metaphone19 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str21 = metaphone19.encode("hi!");
        boolean boolean24 = metaphone19.isMetaphoneEqual("", "A111111111");
        int int25 = metaphone19.getMaxCodeLen();
        java.lang.String str27 = metaphone19.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray36);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray36);
        java.lang.Object obj39 = doubleMetaphone28.encode((java.lang.Object) "hi!");
        doubleMetaphone28.maxCodeLen = (short) 0;
        doubleMetaphone28.maxCodeLen = 0;
        java.lang.String str45 = doubleMetaphone28.encode("");
        java.lang.Object obj46 = metaphone19.encode((java.lang.Object) "");
        java.lang.String str48 = metaphone19.encode("AH");
        boolean boolean51 = metaphone19.isMetaphoneEqual("4H", "ahi!H hi!a");
        java.lang.String str53 = metaphone19.encode("Hhi!hi!4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = caverphone0.encode((java.lang.Object) metaphone19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H" + "'", obj39, "H");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "A" + "'", str48, "A");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "H" + "'", str53, "H");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4", "A111111111");
        java.lang.String str14 = caverphone0.caverphone("hi!Ha");
        java.lang.String str16 = caverphone0.encode("hi!HHAH");
        java.lang.String str18 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!Ha#hi", "hi!hi!aAA11111111");
        java.lang.String str14 = caverphone0.encode("A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        java.lang.String str26 = doubleMetaphone9.encode("");
        java.lang.Object obj27 = metaphone0.encode((java.lang.Object) "");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "##a", "HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone31 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray39);
        boolean boolean41 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray39);
        java.lang.Object obj42 = doubleMetaphone31.encode((java.lang.Object) "hi!");
        doubleMetaphone31.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult46 = doubleMetaphone31.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult46.append("", "hi!");
        doubleMetaphoneResult46.appendAlternate("H");
        java.lang.String str52 = doubleMetaphoneResult46.getAlternate();
        java.lang.String str53 = doubleMetaphoneResult46.getPrimary();
        doubleMetaphoneResult46.appendPrimary("HH");
        doubleMetaphoneResult46.appendPrimary("hi!HH");
        java.lang.String str58 = doubleMetaphoneResult46.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H" + "'", obj42, "H");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!H" + "'", str52, "hi!H");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!H" + "'", str58, "hi!H");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        java.lang.String str17 = metaphone0.metaphone("");
        java.lang.String str19 = metaphone0.metaphone("");
        java.lang.String str21 = metaphone0.encode(" \000##a");
        java.lang.String str23 = metaphone0.encode("hi!H hi!\00041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HH" + "'", str23, "HH");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("HH");
        doubleMetaphoneResult15.appendPrimary("hi!HH");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!HH" + "'", str27, "HHhi!HH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHhi!HH" + "'", str28, "HHhi!HH");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("HHHH", true);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Ha", "HHhi!4aH");
        int int21 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult23.appendAlternate('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult28.appendAlternate('a');
        doubleMetaphoneResult28.append("H", "HIHH");
        doubleMetaphoneResult28.append("AHHIH");
        java.lang.String str36 = doubleMetaphoneResult28.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HAHHIH" + "'", str36, "HAHHIH");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!Ha");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str31 = doubleMetaphone0.encode("aHIHH");
        int int32 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str35 = doubleMetaphone0.doubleMetaphone("hi!H ", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHHIH", (int) '1', (int) 'i', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("Hhi!", (int) (byte) -1, 7, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHHHH", 1, 0, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult24.appendAlternate("HIH");
        boolean boolean27 = doubleMetaphoneResult24.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000", false);
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!Ha");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        int int32 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        int int14 = metaphone0.getMaxCodeLen();
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!H\000#", "#HAH#");
        int int18 = metaphone0.getMaxCodeLen();
        java.lang.Object obj20 = metaphone0.encode((java.lang.Object) "aH\000");
        java.lang.String str22 = metaphone0.metaphone(" h ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "A" + "'", obj20, "A");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4hi!HaHIhi!H A111111111hi!HH", "HIHIAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        boolean boolean17 = metaphone0.isMetaphoneEqual("aa", "HI");
        java.lang.String str19 = metaphone0.metaphone("\000");
        metaphone0.setMaxCodeLen(104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000" + "'", str19, "\000");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ha", "Hhi!ahi!H hi!a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append(" HI", "4 aH4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 1, (int) '#', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) ' ', (int) ' ', strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000H", (int) (short) 10, 97, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("4 a");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "", "4hH");
        java.lang.String str18 = caverphone0.encode("AHHIH");
        java.lang.String str20 = caverphone0.caverphone("##a");
        java.lang.String str22 = caverphone0.encode("\000ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("AH");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!", "hi!HIH");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HHa", " \000");
        doubleMetaphone0.setMaxCodeLen(97);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) 'a');
        int int16 = metaphone0.getMaxCodeLen();
        java.lang.String str18 = metaphone0.metaphone(" \000");
        int int19 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        metaphone0.setMaxCodeLen(4);
        boolean boolean12 = metaphone0.isMetaphoneEqual("", "HII");
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!Hhi!HHH", "");
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode(obj17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append('#', ' ');
        doubleMetaphoneResult20.append('a');
        java.lang.String str30 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.appendAlternate('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "##a" + "'", str30, "##a");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        java.lang.String str24 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate("HH");
        doubleMetaphoneResult15.append("hi!hi!hi!H hi!ahi!H hi!");
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000hi!hi!hi!H hi!ahi!H hi!" + "'", str29, "\000hi!hi!hi!H hi!ahi!H hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append('h', '4');
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        doubleMetaphoneResult5.append('h', '\000');
        java.lang.String str9 = doubleMetaphoneResult5.getAlternate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000" + "'", str9, "\000");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H A111111111A111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HaHI", 49, 2, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.encode("");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("hi!HHHH");
        java.lang.String str24 = doubleMetaphone0.encode("HHHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("aa1");
        java.lang.String str15 = caverphone0.encode("Hhi!");
        java.lang.String str17 = caverphone0.caverphone(" h ");
        java.lang.String str19 = caverphone0.encode("4 ahi!hi!aAA11111111");
        java.lang.String str21 = caverphone0.caverphone("ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        java.lang.String str11 = metaphone0.encode("hi!H hi!");
        boolean boolean14 = metaphone0.isMetaphoneEqual("hi!hi!a", "#hi!HH4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HH", "hi!");
        java.lang.String str17 = caverphone0.encode("Hhi!");
        java.lang.String str19 = caverphone0.caverphone("HIHIAAA");
        boolean boolean22 = caverphone0.isCaverphoneEqual("\000HHIAA HI", "hi!hi!");
        java.lang.String str24 = caverphone0.encode("hi!H\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("A", "4hi!Ha");
        boolean boolean6 = metaphone0.isMetaphoneEqual("hi!H", "a");
        metaphone0.setMaxCodeLen((-1));
        metaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!HIH", "Hhi!");
        boolean boolean19 = caverphone0.isCaverphoneEqual("hi!H hi!\00041", "HAH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        metaphone0.setMaxCodeLen(8);
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "aa" + "'", str29, "aa");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HAHHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HAHHIH" + "'", str1, "HAHHIH");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone20.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult35.append("", "hi!");
        doubleMetaphoneResult35.appendAlternate("A111111111");
        doubleMetaphoneResult35.appendAlternate("A111111111");
        doubleMetaphoneResult35.append('\000', 'a');
        doubleMetaphoneResult35.appendAlternate("HII");
        doubleMetaphoneResult35.appendPrimary("4h4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("4hi!HaHIhi!H A111111111hi!HH");
        boolean boolean13 = caverphone0.isCaverphoneEqual("aH\000", "HAHHIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("4aa ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("HHa");
        java.lang.Object obj19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = caverphone0.encode(obj19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate("");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.append('\000', 'I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!HH" + "'", str29, "Hhi!HH");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        int int22 = doubleMetaphone0.maxCodeLen;
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("ahi!H hi!");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000");
        java.lang.String str29 = doubleMetaphone0.encode("4 a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AH" + "'", str24, "AH");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        doubleMetaphone0.setMaxCodeLen(10);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("4 ahi!hi!aAA11111111", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendPrimary('4');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!4a" + "'", str27, "hi!4a");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append("HI", "hi!");
        doubleMetaphoneResult15.appendAlternate('\000');
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str31 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append(" ");
        doubleMetaphoneResult15.appendPrimary('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " HI" + "'", str31, " HI");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        boolean boolean8 = metaphone0.isMetaphoneEqual("A", "hi!H ");
        java.lang.String str10 = metaphone0.encode("hi!4a");
        int int11 = metaphone0.getMaxCodeLen();
        int int12 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.metaphone("hahi!H hi!h");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("Hhi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray14);
        java.lang.Object obj17 = doubleMetaphone6.encode((java.lang.Object) "hi!");
        char char20 = doubleMetaphone6.charAt("H", (int) (short) 0);
        char char23 = doubleMetaphone6.charAt("H", (int) (byte) -1);
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "HI", "A");
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "HIH", "4");
        doubleMetaphone6.maxCodeLen = 4;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone6.new DoubleMetaphoneResult(65);
        doubleMetaphoneResult33.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'H' + "'", char20 == 'H');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('h');
        boolean boolean31 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append('H', 'h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append('#', ' ');
        doubleMetaphoneResult20.append('a');
        doubleMetaphoneResult20.appendPrimary("hi!");
        java.lang.String str32 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str33 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append("1111111111", "AHH");
        boolean boolean37 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##ahi!" + "'", str32, "##ahi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 a" + "'", str33, "4 a");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi! i", "hi!HHHH");
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone22.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult37.append("", "hi!");
        doubleMetaphoneResult37.append('H');
        doubleMetaphoneResult37.append("hi!");
        doubleMetaphoneResult37.appendAlternate("");
        doubleMetaphoneResult37.appendAlternate("H");
        java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean53 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult55 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult55.appendAlternate("hi!HIH");
        boolean boolean58 = doubleMetaphoneResult55.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        boolean boolean10 = metaphone0.isMetaphoneEqual("\000 ", "HHI");
        java.lang.String str12 = metaphone0.encode(" #H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H a##a", 4, 5, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        doubleMetaphoneResult15.append('1');
        doubleMetaphoneResult15.appendAlternate("aHIHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("#HIHIhi!HHhi!H\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("", " HI");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.encode("hi!");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone13, "A111111111", "hi!H ");
        java.lang.String str20 = metaphone13.encode("hi!Ha");
        boolean boolean23 = metaphone13.isMetaphoneEqual("hi!HH", "a");
        java.lang.String str25 = metaphone13.encode("4hi!Ha");
        java.lang.String str27 = metaphone13.metaphone("hi!HaHI");
        java.lang.Object obj28 = metaphone0.encode((java.lang.Object) "hi!HaHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHH" + "'", str27, "HHH");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "HHH" + "'", obj28, "HHH");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AA11111111");
        char char21 = doubleMetaphone0.charAt("hi!Ha", (int) (short) 100);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("HIHAHIHIHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.encode("hi!H A111111111");
        metaphone0.setMaxCodeLen(0);
        java.lang.String str19 = metaphone0.metaphone("aHIHH");
        boolean boolean22 = metaphone0.isMetaphoneEqual("hi!H hi!\00041", "hi!H hi!\000H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.encode("HH");
        java.lang.String str10 = caverphone0.caverphone("hi!hi!aAA11111111");
        java.lang.String str12 = caverphone0.encode("HIHHI");
        boolean boolean15 = caverphone0.isCaverphoneEqual("4hi!HaHIhi!H A111111111", "hi!HIH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("HIH");
        doubleMetaphoneResult15.append('#', '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.appendAlternate(' ');
        doubleMetaphoneResult15.appendAlternate("hi!HaHI");
        java.lang.String str23 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000" + "'", str23, "\000");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HHa", "4H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4", "A111111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("Hhi!hi!4", "aHIHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.caverphone("hi!H\000");
        java.lang.String str17 = caverphone0.caverphone("hi!Ha#hi");
        java.lang.String str19 = caverphone0.encode("HIHHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str23 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate("HHI");
        java.lang.String str26 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!A111111111" + "'", str23, "hi!A111111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!A111111111HHI" + "'", str26, "hi!A111111111HHI");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("##a");
        java.lang.String str27 = doubleMetaphone0.encode("aH\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A" + "'", str27, "A");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "##a", "1111111111");
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual(" A111111111A111111111", "hi!Ha#hi");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray38);
        java.lang.Object obj41 = doubleMetaphone30.encode((java.lang.Object) "hi!");
        char char44 = doubleMetaphone30.charAt("H", (int) (short) 0);
        char char47 = doubleMetaphone30.charAt("H", (int) (byte) -1);
        boolean boolean51 = doubleMetaphone30.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str53 = doubleMetaphone30.encode("");
        java.lang.String str56 = doubleMetaphone30.doubleMetaphone("hi!H", false);
        java.lang.String str58 = doubleMetaphone30.encode("hi!H");
        int int59 = doubleMetaphone30.maxCodeLen;
        int int62 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone30, "hi!H ", "hi!4");
        java.lang.String str64 = doubleMetaphone30.encode("ahi!H hi!");
        int int65 = doubleMetaphone30.maxCodeLen;
        java.lang.String str67 = doubleMetaphone30.doubleMetaphone("\000h");
        java.lang.Object obj68 = doubleMetaphone0.encode((java.lang.Object) str67);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H" + "'", obj41, "H");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + 'H' + "'", char44 == 'H');
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "H" + "'", str56, "H");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "H" + "'", str58, "H");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "AH" + "'", str64, "AH");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", false);
        int int21 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 49;
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("HHH", "HIHIHHI", true);
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("hi!H", true);
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult6.append("hi!H\000#");
        doubleMetaphoneResult6.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HHHIHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A111111111", true);
        org.apache.commons.codec.language.Metaphone metaphone34 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str36 = metaphone34.encode("hi!");
        int int37 = metaphone34.getMaxCodeLen();
        java.lang.String str39 = metaphone34.metaphone("hi!H");
        java.lang.String str41 = metaphone34.encode("hi!H ");
        int int44 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone34, "A", "hi!H ");
        boolean boolean47 = metaphone34.isMetaphoneEqual("A111111111", "");
        java.lang.String str49 = metaphone34.encode("hi!H A111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = doubleMetaphone0.encode((java.lang.Object) metaphone34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H" + "'", str41, "H");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H" + "'", str49, "H");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!H");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "HH", true);
        doubleMetaphone0.maxCodeLen = (byte) 1;
        int int34 = doubleMetaphone0.maxCodeLen;
        int int35 = doubleMetaphone0.maxCodeLen;
        int int36 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        char char30 = doubleMetaphone0.charAt("hi!hi!aAA11111111hi!4hi!H ", (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (short) 1);
        metaphone0.setMaxCodeLen((int) 'h');
        metaphone0.setMaxCodeLen((int) 'H');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str14 = metaphone0.metaphone("HIHHII");
        java.lang.String str16 = metaphone0.metaphone("HIHIHIHHIAHIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHHH" + "'", str16, "HHHH");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("##a", "##ahi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("hi!H a##a", "aH\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        boolean boolean16 = metaphone0.isMetaphoneEqual("4", "hi!Ha");
        java.lang.String str18 = metaphone0.metaphone("hi!H ");
        int int19 = metaphone0.getMaxCodeLen();
        boolean boolean22 = metaphone0.isMetaphoneEqual("\000 ", "HIAAAHIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HH", "hi!");
        java.lang.String str17 = caverphone0.encode("Hhi!");
        java.lang.String str19 = caverphone0.caverphone("HIHIAAA");
        boolean boolean22 = caverphone0.isCaverphoneEqual("\000HHIAA HI", "hi!hi!");
        java.lang.String str24 = caverphone0.encode("HIHAH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("H", "hi!H hi!\000");
        doubleMetaphoneResult20.append("AH", "hi!H hi!");
        doubleMetaphoneResult20.appendPrimary('#');
        boolean boolean33 = doubleMetaphoneResult20.isComplete();
        java.lang.String str34 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str35 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#HAH#" + "'", str34, "#HAH#");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#HAH#" + "'", str35, "#HAH#");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("##a");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "A111111111");
        java.lang.String str24 = caverphone16.caverphone("hi!");
        boolean boolean27 = caverphone16.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj29 = caverphone16.encode((java.lang.Object) "A111111111");
        java.lang.Object obj30 = metaphone0.encode((java.lang.Object) "A111111111");
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int33 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A111111111" + "'", obj29, "A111111111");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "A" + "'", obj30, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        java.lang.String str24 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('H');
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000H" + "'", str27, "\000H");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        int int26 = doubleMetaphone0.maxCodeLen;
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("AHHIH", "HI");
        java.lang.String str31 = doubleMetaphone0.encode("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H hi!", "AA11111111");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HHhi!HH4hH", "HIHIHHI");
        java.lang.String str17 = caverphone0.caverphone("aH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary('I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("HAHHIH", "HIHH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendPrimary("a");
        doubleMetaphoneResult15.appendPrimary("hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 1;
        java.lang.String str21 = doubleMetaphone0.encode("\000");
        int int22 = doubleMetaphone0.maxCodeLen;
        char char25 = doubleMetaphone0.charAt("hi!4", 65);
        int int26 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate("hi!H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!HHHH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "\000h");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, " \000", "HIAAAHIHHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendPrimary('4');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate("#h");
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!#h" + "'", str27, "hi!hi!#h");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!4" + "'", str28, "hi!4");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!4", "1111111111");
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("hi!", true);
        boolean boolean36 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHAH", "HHhi!HHh", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str13 = metaphone0.encode("hi!HH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "hi!4");
        java.lang.String str18 = metaphone0.encode("hi!H ");
        boolean boolean21 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "aHHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append(' ', 'a');
        doubleMetaphoneResult15.append("hi!hi!aAA11111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("HIH");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('1');
        doubleMetaphoneResult15.append('I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!HIH" + "'", str21, "hi!HIH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendPrimary('H');
        doubleMetaphoneResult15.appendAlternate('\000');
        doubleMetaphoneResult15.append("hi!4", "HIHHIHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        org.apache.commons.codec.language.Metaphone metaphone11 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str13 = metaphone11.encode("hi!");
        int int14 = metaphone11.getMaxCodeLen();
        java.lang.String str16 = metaphone11.metaphone("hi!H");
        java.lang.String str18 = metaphone11.encode("hi!H ");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone11, "A", "hi!H ");
        metaphone11.setMaxCodeLen(3);
        int int24 = metaphone11.getMaxCodeLen();
        java.lang.String str26 = metaphone11.metaphone("##a");
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean30 = caverphone27.isCaverphoneEqual("", "");
        boolean boolean33 = caverphone27.isCaverphoneEqual("", "A111111111");
        java.lang.String str35 = caverphone27.caverphone("hi!");
        boolean boolean38 = caverphone27.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj40 = caverphone27.encode((java.lang.Object) "A111111111");
        java.lang.Object obj41 = metaphone11.encode((java.lang.Object) "A111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = caverphone0.encode((java.lang.Object) metaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AA11111111" + "'", str35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "A111111111" + "'", obj40, "A111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "A" + "'", obj41, "A");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        java.lang.String str11 = metaphone0.metaphone("hi!4a");
        boolean boolean14 = metaphone0.isMetaphoneEqual(" #", "##ahi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        metaphone0.setMaxCodeLen((int) '1');
        java.lang.String str12 = metaphone0.metaphone("");
        java.lang.String str14 = metaphone0.encode("H1");
        java.lang.String str16 = metaphone0.metaphone("HHHH");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "aa1", "hahi!HHHH\000A111111111HII\000H");
        metaphone0.setMaxCodeLen(97);
        java.lang.String str23 = metaphone0.encode("HIA");
        java.lang.String str25 = metaphone0.encode("hi!H\000#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        java.lang.String str10 = metaphone0.metaphone("");
        java.lang.String str12 = metaphone0.metaphone("HIH");
        boolean boolean15 = metaphone0.isMetaphoneEqual("aHa", "#h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!H", "");
        java.lang.String str13 = caverphone0.encode("hi!HIH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("\000h", "HIHA");
        java.lang.String str18 = caverphone0.encode("Hhi!hi!4 h ");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.getMaxCodeLen();
        char char20 = doubleMetaphone0.charAt("hi!Ha", (int) 'a');
        doubleMetaphone0.maxCodeLen = (byte) 0;
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("hi! ", false);
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("hi!hi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('4');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aH", "I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.metaphone("hi!HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        int int30 = doubleMetaphone16.maxCodeLen;
        doubleMetaphone16.setMaxCodeLen((int) (short) 1);
        char char35 = doubleMetaphone16.charAt("A111111111", 100);
        java.lang.Object obj36 = metaphone0.encode((java.lang.Object) "A111111111");
        int int39 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!\000", "hi!H ");
        int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "AA11111111");
        java.lang.Class<?> wildcardClass43 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("aHa", "hi!H hi!", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("HIH");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('1');
        doubleMetaphoneResult15.appendAlternate("aa");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!HIH" + "'", str21, "hi!HIH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.encode(" A111111111");
        java.lang.String str19 = metaphone0.metaphone(" \000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "hi!HH", false);
        doubleMetaphone0.setMaxCodeLen(1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H hi!\000");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("hi!HHHHIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ha", "hahi!HHHH\000A111111111HII\000H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("Hhi!", (int) 'H', 32, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) '1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("HIH");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!hi!hi!H hi!ahi!H hi!", true);
        char char24 = doubleMetaphone0.charAt("A", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'H');
        int int29 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!Ha#hi", "HIHIAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.maxCodeLen = (short) 100;
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "\000", false);
        java.lang.String str34 = doubleMetaphone0.doubleMetaphone("aHIHH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone35 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray43);
        boolean boolean45 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray43);
        java.lang.Object obj46 = doubleMetaphone35.encode((java.lang.Object) "hi!");
        doubleMetaphone35.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult50 = doubleMetaphone35.new DoubleMetaphoneResult(100);
        char char53 = doubleMetaphone35.charAt("A111111111", (int) '#');
        java.lang.String str55 = doubleMetaphone35.doubleMetaphone("a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AH" + "'", str34, "AH");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "H" + "'", obj46, "H");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.append('\000', 'a');
        doubleMetaphoneResult15.append("hi!H hi!");
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('#');
        java.lang.String str32 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!A111111111A111111111ahi!H hi!" + "'", str28, "hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000hi!H hi!" + "'", str29, "\000hi!H hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000hi!H hi!" + "'", str32, "\000hi!H hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.append("");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a" + "'", str30, "\000a");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        java.lang.String str15 = caverphone0.caverphone("AH");
        java.lang.String str17 = caverphone0.encode("hi!HHHH");
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "HH", false);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(2);
        doubleMetaphoneResult7.appendAlternate("hahi!H hi!h");
        java.lang.String str10 = doubleMetaphoneResult7.getAlternate();
        boolean boolean11 = doubleMetaphoneResult7.isComplete();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ha" + "'", str10, "ha");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("hi!H hi!");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append("AH");
        doubleMetaphoneResult15.append("\000 ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("#hi!HH4", "HIHAHIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!hi!aAA11111111", " A111111111A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        char char25 = doubleMetaphone0.charAt("HIHH", (int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult(2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append("HI", "hi!");
        doubleMetaphoneResult15.appendAlternate('\000');
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate(' ');
        doubleMetaphoneResult15.appendPrimary('4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        boolean boolean6 = metaphone0.isMetaphoneEqual("A111111111", "##a");
        boolean boolean9 = metaphone0.isMetaphoneEqual("hi!H hi!", "aa1");
        java.lang.String str11 = metaphone0.encode("4hi!H hi!\000");
        metaphone0.setMaxCodeLen(52);
        java.lang.Class<?> wildcardClass14 = metaphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append('#', ' ');
        doubleMetaphoneResult20.append('a');
        java.lang.String str30 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str31 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append("", "hi!H#h4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "##a" + "'", str30, "##a");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4 a" + "'", str31, "4 a");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.append('\000', 'a');
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('i');
        doubleMetaphoneResult15.appendAlternate('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000" + "'", str26, "\000");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.String str23 = doubleMetaphone0.encode("4");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphoneResult27.appendPrimary(" ");
        doubleMetaphoneResult27.appendPrimary('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("H", "4hH");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!hi!a", "\000!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("hi!4", (int) 'a');
        char char21 = doubleMetaphone0.charAt("hi!HIH", (int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + 'i' + "'", char21 == 'i');
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!H", "");
        java.lang.String str10 = caverphone0.encode("HII");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        java.lang.Object obj22 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        char char25 = doubleMetaphone11.charAt("H", (int) (short) 0);
        int int26 = doubleMetaphone11.getMaxCodeLen();
        java.lang.String str28 = doubleMetaphone11.doubleMetaphone("AH");
        boolean boolean31 = doubleMetaphone11.isDoubleMetaphoneEqual("ahi!H hi!", "hi!HIH");
        boolean boolean34 = doubleMetaphone11.isDoubleMetaphoneEqual("HHa", " \000");
        boolean boolean38 = doubleMetaphone11.isDoubleMetaphoneEqual("AHHIH", "hi!Ha", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone11.new DoubleMetaphoneResult(32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = caverphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H" + "'", obj22, "H");
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'H' + "'", char25 == 'H');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Hhi!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHH" + "'", str1, "HHIHH");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("4hi!Ha");
        java.lang.String str12 = caverphone0.encode("hi! i");
        java.lang.String str14 = caverphone0.caverphone("hi!Ha1\000hi!H hi!");
        java.lang.String str16 = caverphone0.encode("H A111111111A111111111");
        java.lang.String str18 = caverphone0.caverphone("\000 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.append("A111111111");
        doubleMetaphoneResult15.appendAlternate('a');
        java.lang.String str23 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000A111111111a" + "'", str23, "\000A111111111a");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate(" A111111111");
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate('h');
        doubleMetaphoneResult15.appendAlternate("hi!Hhi!HHH");
        doubleMetaphoneResult15.append(" \000##a", "4 a");
        doubleMetaphoneResult15.append('a', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        org.apache.commons.codec.language.Metaphone metaphone12 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str14 = metaphone12.encode("hi!");
        int int15 = metaphone12.getMaxCodeLen();
        java.lang.String str17 = metaphone12.metaphone("hi!H");
        java.lang.String str19 = metaphone12.encode("hi!H ");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone12, "A", "hi!H ");
        boolean boolean25 = metaphone12.isMetaphoneEqual("A111111111", "");
        java.lang.String str27 = metaphone12.metaphone("hi!HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray36);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray36);
        java.lang.Object obj39 = doubleMetaphone28.encode((java.lang.Object) "hi!");
        doubleMetaphone28.maxCodeLen = (short) 0;
        int int42 = doubleMetaphone28.maxCodeLen;
        doubleMetaphone28.setMaxCodeLen((int) (short) 1);
        char char47 = doubleMetaphone28.charAt("A111111111", 100);
        java.lang.Object obj48 = metaphone12.encode((java.lang.Object) "A111111111");
        java.lang.Object obj49 = metaphone0.encode((java.lang.Object) "A111111111");
        metaphone0.setMaxCodeLen(4);
        java.lang.String str53 = metaphone0.encode("\000A111111111a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H" + "'", obj39, "H");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "A" + "'", obj48, "A");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "A" + "'", obj49, "A");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!4a", "AH");
        doubleMetaphoneResult15.append("##a4ihi!Hhi!#i", "\000H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("HIH");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!hi!hi!H hi!ahi!H hi!", true);
        int int22 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult(5);
        int int25 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("#HIHIhi!HH\000A111111111ahi!H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHHAAHIH" + "'", str1, "HIHIHIHHAAHIH");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        java.lang.String str26 = doubleMetaphone9.encode("");
        java.lang.Object obj27 = metaphone0.encode((java.lang.Object) "");
        metaphone0.setMaxCodeLen((int) (short) 0);
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, " HI4AA11111111", "");
        java.lang.String str34 = metaphone0.encode("HIHAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('4');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("AH", "hi!HH");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate("Hhi!1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4AH" + "'", str28, "4AH");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("1111111111");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "hi!H hi!\000");
        char char23 = doubleMetaphone0.charAt("hi! ", (int) (byte) 100);
        java.lang.String str25 = doubleMetaphone0.encode("aHIHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("##a");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "A111111111");
        java.lang.String str24 = caverphone16.caverphone("hi!");
        boolean boolean27 = caverphone16.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj29 = caverphone16.encode((java.lang.Object) "A111111111");
        java.lang.Object obj30 = metaphone0.encode((java.lang.Object) "A111111111");
        metaphone0.setMaxCodeLen((int) (short) -1);
        metaphone0.setMaxCodeLen((int) '1');
        java.lang.String str36 = metaphone0.encode("");
        boolean boolean39 = metaphone0.isMetaphoneEqual("HHIHI", "hi!Ha");
        boolean boolean42 = metaphone0.isMetaphoneEqual("hi!HHaHIH", "HIHHI");
        int int45 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1111111111AA111111111\000", "hi!HIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A111111111" + "'", obj29, "A111111111");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "A" + "'", obj30, "A");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        java.lang.String str15 = caverphone0.encode("HHHIHH");
        java.lang.String str17 = caverphone0.caverphone("hi!hi!hi!H hi!ahi!H hi!");
        java.lang.String str19 = caverphone0.encode("hi!A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult28.appendPrimary(' ');
        doubleMetaphoneResult28.appendAlternate("a#");
        doubleMetaphoneResult28.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("HHa");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!Ha#hi", " h ");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HHH", "");
        boolean boolean27 = caverphone0.isCaverphoneEqual("hi!", "\000HHIAA HI");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H1", " #");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        boolean boolean16 = metaphone0.isMetaphoneEqual("4", "hi!Ha");
        java.lang.String str18 = metaphone0.metaphone("hi!Ha1\000hi!H hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHH" + "'", str18, "HHH");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        doubleMetaphoneResult15.appendPrimary("A111111111");
        doubleMetaphoneResult15.appendPrimary("AHH");
        doubleMetaphoneResult15.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("4");
        java.lang.String str15 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str17 = caverphone0.caverphone("\000!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.metaphone("hi!HHHH");
        int int8 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.String str31 = doubleMetaphone0.encode("Hhi!hi!4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!1", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.encode("hi!H hi!\000");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4h4", "HHa");
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.encode("##a");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!Hhi!hi!4hi!4hi!Ha", "HHhi!4aH");
        java.lang.String str13 = caverphone0.encode("HIHIHIHHIAHIHHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        java.lang.String str26 = doubleMetaphone9.encode("");
        java.lang.Object obj27 = metaphone0.encode((java.lang.Object) "");
        int int28 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(7);
        java.lang.String str32 = metaphone0.metaphone("HHA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        doubleMetaphoneResult15.appendPrimary("A111111111");
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendAlternate('!');
        doubleMetaphoneResult15.appendPrimary("HHHHH");
        doubleMetaphoneResult15.appendPrimary('\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!HHHH" + "'", str29, "hi!HHHH");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.setMaxCodeLen((int) '4');
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone0.new DoubleMetaphoneResult(72);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("#hi!H\000#", 35, 100, strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Hhi!#i", (int) 'a', 35, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi! i", "Ah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("A111111111", (int) '#');
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("a");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        char char21 = doubleMetaphone0.charAt("hi!HHHH", 8);
        org.apache.commons.codec.language.Caverphone caverphone22 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean25 = caverphone22.isCaverphoneEqual("", "");
        java.lang.String str27 = caverphone22.caverphone("H");
        boolean boolean30 = caverphone22.isCaverphoneEqual("hi!H", "A111111111");
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone22, "hi!HH", "##a");
        java.lang.String str35 = caverphone22.caverphone("a");
        java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) str35);
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        java.lang.String str40 = doubleMetaphone0.encode("4hi!Ha");
        java.lang.Class<?> wildcardClass41 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A111111111" + "'", str27, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A111111111" + "'", str35, "A111111111");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append('1');
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.append('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        boolean boolean16 = metaphone0.isMetaphoneEqual("4", "hi!Ha");
        metaphone0.setMaxCodeLen((-1));
        int int19 = metaphone0.getMaxCodeLen();
        java.lang.String str21 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("A111111111", (int) '1', 52, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains(" A1111111111", 49, 0, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("HI", "hi!Ha");
        doubleMetaphoneResult20.append("HI");
        doubleMetaphoneResult20.appendAlternate("hi!H A111111111");
        doubleMetaphoneResult20.append("hi!HH");
        doubleMetaphoneResult20.append("\000A111111111ahi!H ");
        java.lang.String str36 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.appendPrimary('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#HIHIhi!HH\000A111111111ahi!H " + "'", str36, "#HIHIhi!HH\000A111111111ahi!H ");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        boolean boolean12 = metaphone0.isMetaphoneEqual("ha", "hi! ");
        metaphone0.setMaxCodeLen((int) 'i');
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!hi!", "HIHIAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.metaphone("hahi!H hi!h");
        java.lang.String str16 = metaphone0.metaphone("AHIHHIA");
        java.lang.String str18 = metaphone0.encode("##ahi!");
        metaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append(' ', 'a');
        doubleMetaphoneResult15.appendPrimary('h');
        doubleMetaphoneResult15.append("H1");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! hH1" + "'", str28, "hi! hH1");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str27 = doubleMetaphone0.encode("hi!H");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "HH", true);
        doubleMetaphone0.maxCodeLen = (byte) 1;
        int int34 = doubleMetaphone0.maxCodeLen;
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "##a4", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary('H');
        doubleMetaphoneResult15.appendPrimary("4 ahi!hi!aAA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        doubleMetaphoneResult15.append("H");
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.append('\000', '1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendPrimary('4');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate("#h");
        doubleMetaphoneResult15.appendAlternate("HHHIHH");
        doubleMetaphoneResult15.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("A", "Hhi!");
        java.lang.String str15 = metaphone0.metaphone("hi!4a");
        java.lang.String str17 = metaphone0.metaphone("HIHAHIHHI");
        java.lang.Object obj19 = metaphone0.encode((java.lang.Object) "hi!hi!hi!H hi!ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HHH" + "'", str17, "HHH");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "HHHH" + "'", obj19, "HHHH");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.append('\000', 'a');
        doubleMetaphoneResult15.append("hi!H hi!");
        doubleMetaphoneResult15.appendPrimary("hi!Ha");
        doubleMetaphoneResult15.appendAlternate("Hhi!1");
        boolean boolean32 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('H');
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphone0.setMaxCodeLen((-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        int int27 = doubleMetaphone0.getMaxCodeLen();
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "4hi!HaHIhi!H A111111111hi!HH", "hi!Hhi!hi!4hi!4hi!Ha");
        doubleMetaphone0.maxCodeLen = (short) 1;
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str6 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (byte) 10;
        char char11 = doubleMetaphone0.charAt("#4", 72);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append('#', ' ');
        java.lang.String str28 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "##" + "'", str28, "##");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4", "##a");
        doubleMetaphone0.maxCodeLen = 2;
        doubleMetaphone0.maxCodeLen = 'A';
        int int28 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 65 + "'", int28 == 65);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!4", false);
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean26 = doubleMetaphone22.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj27 = caverphone21.encode((java.lang.Object) "a");
        java.lang.String str29 = caverphone21.caverphone("hi!4");
        java.lang.String str31 = caverphone21.encode("HI");
        java.lang.String str33 = caverphone21.caverphone("hi!HHHH");
        boolean boolean36 = caverphone21.isCaverphoneEqual("HIHH", "4");
        boolean boolean39 = caverphone21.isCaverphoneEqual("HHIHI", " A111111111");
        java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) "HHIHI");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int43 = doubleMetaphone0.maxCodeLen;
        boolean boolean46 = doubleMetaphone0.isDoubleMetaphoneEqual("AHII", "hi!HHHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "A111111111" + "'", obj27, "A111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('4');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        boolean boolean12 = metaphone0.isMetaphoneEqual("aa", "HHa");
        metaphone0.setMaxCodeLen((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("4");
        doubleMetaphoneResult15.appendAlternate(' ');
        doubleMetaphoneResult15.append('a');
        java.lang.String str31 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H a" + "'", str31, "hi!H a");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.appendAlternate("A111111111");
        doubleMetaphoneResult15.append('\000', 'a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendPrimary('\000');
        boolean boolean30 = doubleMetaphoneResult15.isComplete();
        java.lang.String str31 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\000" + "'", str31, "\000\000");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        boolean boolean12 = metaphone0.isMetaphoneEqual("hi!HIH", "Hhi!");
        int int13 = metaphone0.getMaxCodeLen();
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "Hhi!HH", "HHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("HI", "hi!Ha");
        doubleMetaphoneResult20.append("HI");
        doubleMetaphoneResult20.appendAlternate("hi!H A111111111");
        doubleMetaphoneResult20.appendAlternate("hi!A111111111A111111111ahi!H hi!");
        doubleMetaphoneResult20.appendAlternate('4');
        doubleMetaphoneResult20.append("hi!HIH", "HIHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHAHIHIHAHIHH", "4hi!Ha");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.encode("");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "##ahi!", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone25 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray33);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray33);
        java.lang.Object obj36 = doubleMetaphone25.encode((java.lang.Object) "hi!");
        doubleMetaphone25.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone25.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult40.append("", "hi!");
        doubleMetaphoneResult40.appendAlternate("H");
        java.lang.String str46 = doubleMetaphoneResult40.getAlternate();
        doubleMetaphoneResult40.append('4', '#');
        doubleMetaphoneResult40.append('h');
        doubleMetaphoneResult40.appendAlternate('4');
        doubleMetaphoneResult40.append("4");
        java.lang.String str56 = doubleMetaphoneResult40.getPrimary();
        doubleMetaphoneResult40.append(" HI4AA11111111");
        boolean boolean59 = doubleMetaphoneResult40.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = doubleMetaphone0.encode((java.lang.Object) boolean59);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H" + "'", obj36, "H");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!H" + "'", str46, "hi!H");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4h4" + "'", str56, "4h4");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.metaphone("hahi!H hi!h");
        java.lang.String str16 = metaphone0.metaphone("AHIHHIA");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "\000A111111111ahi!H ", "HH");
        metaphone0.setMaxCodeLen((int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("hi!H hi!");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendAlternate("HH");
        doubleMetaphoneResult15.appendPrimary('A');
        java.lang.String str35 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ahi!H hi!A" + "'", str35, "ahi!H hi!A");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.encode("HHIHI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        java.lang.String str11 = caverphone0.encode("a");
        java.lang.String str13 = caverphone0.caverphone("A111111111");
        java.lang.String str15 = caverphone0.encode("hi!hi!hi!H hi!ahi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.append("", "hi!");
        doubleMetaphoneResult31.append('H');
        doubleMetaphoneResult31.append("hi!");
        doubleMetaphoneResult31.appendAlternate(" A111111111");
        doubleMetaphoneResult31.append('H', '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = caverphone0.encode((java.lang.Object) 'H');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        doubleMetaphone10.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone10.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult25.append("", "hi!");
        doubleMetaphoneResult25.appendAlternate("H");
        java.lang.String str31 = doubleMetaphoneResult25.getAlternate();
        doubleMetaphoneResult25.appendPrimary('a');
        java.lang.String str34 = doubleMetaphoneResult25.getPrimary();
        doubleMetaphoneResult25.append('a', 'a');
        doubleMetaphoneResult25.append('1');
        doubleMetaphoneResult25.appendPrimary("");
        doubleMetaphoneResult25.appendAlternate('I');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = metaphone0.encode((java.lang.Object) 'I');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H" + "'", str31, "hi!H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "a" + "'", str34, "a");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("HH");
        doubleMetaphoneResult15.appendPrimary("hi!HH");
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate('a');
        doubleMetaphoneResult15.append('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" #H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        java.lang.String str9 = metaphone0.metaphone("");
        java.lang.String str11 = metaphone0.metaphone("HHIHI");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "##ahi!", "hi!hi!aAA11111111i A111111111A111111111");
        metaphone0.setMaxCodeLen((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str25 = doubleMetaphone0.encode(" A111111111");
        doubleMetaphone0.setMaxCodeLen(49);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int20 = doubleMetaphone0.maxCodeLen;
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("AHHIH", "4hi!H hi!\000");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = caverphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        int int26 = doubleMetaphone0.maxCodeLen;
        char char29 = doubleMetaphone0.charAt("hi!H hi!", 65);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        char char34 = doubleMetaphone0.charAt("Hhi!hi!4", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("HI");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!Hhi!HHH", "HHhi!4aH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray25);
        java.lang.Object obj28 = doubleMetaphone17.encode((java.lang.Object) "hi!");
        doubleMetaphone17.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone17.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult32.append("", "hi!");
        doubleMetaphoneResult32.appendAlternate("H");
        java.lang.String str38 = doubleMetaphoneResult32.getAlternate();
        doubleMetaphoneResult32.appendPrimary('\000');
        java.lang.String str41 = doubleMetaphoneResult32.getAlternate();
        doubleMetaphoneResult32.appendAlternate("HH");
        doubleMetaphoneResult32.appendAlternate("HIH");
        java.lang.Object obj46 = caverphone0.encode((java.lang.Object) "HIH");
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = caverphone0.encode(obj47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H" + "'", obj28, "H");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!H" + "'", str38, "hi!H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!H" + "'", str41, "hi!H");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "AA11111111" + "'", obj46, "AA11111111");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.encode("hi!H A111111111");
        java.lang.String str17 = metaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "AHII", "hi!Ha#hi");
        boolean boolean23 = metaphone0.isMetaphoneEqual("AH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str24 = doubleMetaphone0.encode("aHHIH");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Ha#hi", "hi!A111111111A111111111ahi!H hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone29 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray37);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray37);
        java.lang.Object obj40 = doubleMetaphone29.encode((java.lang.Object) "hi!");
        doubleMetaphone29.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult44 = doubleMetaphone29.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult44.append("", "hi!");
        doubleMetaphoneResult44.appendAlternate("H");
        java.lang.String str50 = doubleMetaphoneResult44.getAlternate();
        doubleMetaphoneResult44.appendPrimary('a');
        doubleMetaphoneResult44.appendAlternate('#');
        doubleMetaphoneResult44.append("hi!H hi!");
        java.lang.String str57 = doubleMetaphoneResult44.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "H" + "'", obj40, "H");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!H" + "'", str50, "hi!H");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ahi!H hi!" + "'", str57, "ahi!H hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int33 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str37 = doubleMetaphone0.encode("AA");
        java.lang.String str39 = doubleMetaphone0.doubleMetaphone("HIH");
        java.lang.String str41 = doubleMetaphone0.encode("HHhi!HHh");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("HIHA");
        java.lang.String str15 = caverphone0.encode("HHIHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!4", false);
        org.apache.commons.codec.language.Caverphone caverphone21 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean26 = doubleMetaphone22.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj27 = caverphone21.encode((java.lang.Object) "a");
        java.lang.String str29 = caverphone21.caverphone("hi!4");
        java.lang.String str31 = caverphone21.encode("HI");
        java.lang.String str33 = caverphone21.caverphone("hi!HHHH");
        boolean boolean36 = caverphone21.isCaverphoneEqual("HIHH", "4");
        boolean boolean39 = caverphone21.isCaverphoneEqual("HHIHI", " A111111111");
        java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) "HHIHI");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int43 = doubleMetaphone0.maxCodeLen;
        java.lang.String str45 = doubleMetaphone0.encode("hi!H\000hi!4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "A111111111" + "'", obj27, "A111111111");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "HIH");
        boolean boolean20 = caverphone0.isCaverphoneEqual("A111111111", "");
        java.lang.String str22 = caverphone0.caverphone("HHhi!HH4hH");
        java.lang.String str24 = caverphone0.encode("hi!HHHHIH");
        java.lang.String str26 = caverphone0.encode("hi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray35);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray35);
        java.lang.Object obj38 = doubleMetaphone27.encode((java.lang.Object) "hi!");
        char char41 = doubleMetaphone27.charAt("H", (int) (short) 0);
        char char44 = doubleMetaphone27.charAt("hi!", (int) (byte) 100);
        boolean boolean48 = doubleMetaphone27.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone49 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        boolean boolean58 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray57);
        boolean boolean59 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray57);
        java.lang.Object obj60 = doubleMetaphone49.encode((java.lang.Object) "hi!");
        doubleMetaphone49.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult64 = doubleMetaphone49.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult64.append("", "hi!");
        doubleMetaphoneResult64.append('H');
        doubleMetaphoneResult64.append("hi!");
        doubleMetaphoneResult64.appendAlternate("");
        doubleMetaphoneResult64.appendAlternate("H");
        java.lang.Object obj76 = doubleMetaphone27.encode((java.lang.Object) "H");
        doubleMetaphone27.setMaxCodeLen((int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult80 = doubleMetaphone27.new DoubleMetaphoneResult((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = caverphone0.encode((java.lang.Object) doubleMetaphone27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H" + "'", obj38, "H");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + 'H' + "'", char41 == 'H');
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\000' + "'", char44 == '\000');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "H" + "'", obj60, "H");
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "" + "'", obj76, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        java.lang.String str25 = doubleMetaphoneResult15.getAlternate();
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H " + "'", str25, "hi!H ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (short) 1);
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass10 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.String str23 = doubleMetaphone0.encode("4");
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000 ");
        java.lang.String str27 = doubleMetaphone0.encode("4hH");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 'A';
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.encode("##a");
        java.lang.String str10 = caverphone0.encode("hi!HH");
        org.apache.commons.codec.language.Metaphone metaphone11 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean14 = metaphone11.isMetaphoneEqual("", "");
        java.lang.String str16 = metaphone11.metaphone("A111111111");
        java.lang.String str18 = metaphone11.encode("##a");
        java.lang.String str20 = metaphone11.encode("##a");
        java.lang.String str22 = metaphone11.metaphone("hi!4a");
        boolean boolean25 = metaphone11.isMetaphoneEqual("hi!hi!aAA11111111", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone26 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray34);
        java.lang.Object obj37 = doubleMetaphone26.encode((java.lang.Object) "hi!");
        char char40 = doubleMetaphone26.charAt("H", (int) (short) 0);
        int int41 = doubleMetaphone26.getMaxCodeLen();
        boolean boolean44 = doubleMetaphone26.isDoubleMetaphoneEqual("hi!", "hi!");
        doubleMetaphone26.setMaxCodeLen((int) (byte) 10);
        java.lang.String str49 = doubleMetaphone26.doubleMetaphone("hi!hi!aAA11111111", false);
        java.lang.Object obj50 = metaphone11.encode((java.lang.Object) "hi!hi!aAA11111111");
        java.lang.Object obj51 = caverphone0.encode((java.lang.Object) "hi!hi!aAA11111111");
        java.lang.String str53 = caverphone0.caverphone("a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "H" + "'", obj37, "H");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + 'H' + "'", char40 == 'H');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "H" + "'", str49, "H");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "HH" + "'", obj50, "HH");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "AA11111111" + "'", obj51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "A111111111" + "'", str53, "A111111111");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!H", "hi!HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray26);
        java.lang.Object obj29 = doubleMetaphone18.encode((java.lang.Object) "hi!");
        doubleMetaphone18.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone18.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult33.append("", "hi!");
        doubleMetaphoneResult33.appendAlternate("HIH");
        java.lang.Object obj39 = caverphone0.encode((java.lang.Object) "HIH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H" + "'", obj29, "H");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "AA11111111" + "'", obj39, "AA11111111");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        doubleMetaphoneResult15.append("hi! ");
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("1111111111", "#HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" A111111111hi!hi!aAA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHIHIAAA" + "'", str1, "AHIHIAAA");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        java.lang.String str11 = caverphone0.encode("1111111111");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("A111111111", (int) 'i', (int) (short) 1, strArray28);
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) "A111111111");
        java.lang.String str36 = caverphone0.encode("HIHAHIHHI");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "A111111111" + "'", obj34, "A111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        java.lang.String str26 = doubleMetaphone9.encode("");
        java.lang.Object obj27 = metaphone0.encode((java.lang.Object) "");
        java.lang.String str29 = metaphone0.encode("AH");
        boolean boolean32 = metaphone0.isMetaphoneEqual("4H", "ahi!H hi!a");
        java.lang.String str34 = metaphone0.encode("Hhi!hi!4");
        java.lang.String str36 = metaphone0.encode("HIHHHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "" + "'", obj27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        java.lang.String str4 = metaphone0.encode(" HI");
        int int5 = metaphone0.getMaxCodeLen();
        boolean boolean8 = metaphone0.isMetaphoneEqual("#H", "4hi!HaHIhi!H A111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        boolean boolean9 = metaphone0.isMetaphoneEqual("aa", "hi!hi!aAA11111111");
        java.lang.String str11 = metaphone0.metaphone("Hhi!1");
        int int12 = metaphone0.getMaxCodeLen();
        java.lang.String str14 = metaphone0.encode("hi!H");
        java.lang.String str16 = metaphone0.encode("HHIHI");
        org.apache.commons.codec.language.Caverphone caverphone17 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean20 = caverphone17.isCaverphoneEqual("", "");
        boolean boolean23 = caverphone17.isCaverphoneEqual("HIHHI", " A111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = metaphone0.encode((java.lang.Object) caverphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("Hhi!");
        java.lang.String str7 = caverphone0.encode("4AH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!H ", "H");
        java.lang.String str11 = caverphone0.caverphone("hi!H ");
        java.lang.String str13 = caverphone0.caverphone("hi!H hi!\000 ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.appendAlternate('\000');
        java.lang.String str27 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.append('A', '!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#" + "'", str27, "#");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#" + "'", str28, "#");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.caverphone("hi!H\000");
        java.lang.String str17 = caverphone0.encode("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HAH", "hi!hi!#h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        boolean boolean12 = metaphone0.isMetaphoneEqual("aa", "HHa");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "HHI");
        java.lang.String str17 = metaphone0.encode("#HIHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("##ahi!", 10, (int) ' ', strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("aa");
        boolean boolean17 = caverphone0.isCaverphoneEqual("A", "HH");
        java.lang.String str19 = caverphone0.encode("");
        java.lang.String str21 = caverphone0.caverphone("hi!4");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ahi!H hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendPrimary('4');
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append("HIH", "hi!H hi!");
        doubleMetaphoneResult15.append("hi! i", "ahi!H hi!");
        doubleMetaphoneResult15.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        int int28 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("1111111111AA111111111\000", "\000A111111111hi!H ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str11 = metaphone0.encode("4hi!Ha");
        boolean boolean14 = metaphone0.isMetaphoneEqual("a", "HHHHHH");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!\00041", "hi!H ah");
        boolean boolean20 = metaphone0.isMetaphoneEqual("HIHHII", " #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone0.maxCodeLen = (short) 100;
        int int37 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIHAHIHHI", "hi!H\000#");
        java.lang.String str39 = doubleMetaphone0.encode("hi!H#h4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "1111111111");
        java.lang.String str14 = metaphone0.encode("");
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.encode("#hi!H\000#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        boolean boolean13 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "AA11111111");
        java.lang.String str15 = metaphone0.metaphone("Hhi!");
        boolean boolean18 = metaphone0.isMetaphoneEqual("H1", "Hhi!hi!4");
        metaphone0.setMaxCodeLen(2);
        int int21 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone22.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult37.append("", "hi!");
        doubleMetaphoneResult37.append('H');
        doubleMetaphoneResult37.append("hi!");
        doubleMetaphoneResult37.appendAlternate("");
        doubleMetaphoneResult37.appendAlternate("H");
        java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean53 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A", false);
        int int56 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult58 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        char char20 = doubleMetaphone0.charAt("HI", (-1));
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("HHI", false);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("hi!A111111111HHI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str17 = metaphone0.encode("hi!Hhi!#i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("HI", "hi!Ha");
        doubleMetaphoneResult20.append("HI");
        doubleMetaphoneResult20.appendAlternate("hi!H A111111111");
        doubleMetaphoneResult20.append("hi!HH");
        doubleMetaphoneResult20.append("hi!H\000");
        java.lang.String str36 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.appendAlternate("##ahi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#HIHIhi!HHhi!H\000" + "'", str36, "#HIHIhi!HHhi!H\000");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H hi!\000H", "Hhi!HH AHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        metaphone0.setMaxCodeLen(97);
        int int11 = metaphone0.getMaxCodeLen();
        boolean boolean14 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "a");
        java.lang.String str16 = metaphone0.encode("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("1111111111", " A111111111");
        java.lang.String str14 = metaphone0.encode("HIH");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HHA", "#hi!H\000#");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIHAHIHIHA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHAHIHIHA" + "'", str1, "HIHAHIHIHA");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary('h');
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append(" A111111111", "");
        doubleMetaphoneResult15.appendAlternate('a');
        java.lang.String str34 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("HIH \000", "AA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!H#a" + "'", str34, "hi!H#a");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        java.lang.String str16 = metaphone0.encode("A111111111");
        java.lang.String str18 = metaphone0.metaphone(" A1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.encode("hi!H hi!\000");
        java.lang.String str16 = metaphone0.metaphone("\000A111111111HII");
        boolean boolean19 = metaphone0.isMetaphoneEqual("hi! ", "##ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H hi!\000");
        boolean boolean10 = metaphone0.isMetaphoneEqual("AHI", "");
        metaphone0.setMaxCodeLen((int) 'a');
        java.lang.String str14 = metaphone0.metaphone("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHHHH" + "'", str14, "HHHHH");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!4", "1111111111");
        doubleMetaphone0.maxCodeLen = 5;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("hi!4", (int) 'a');
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Hhi!HH", "#hi!HH4");
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        metaphone0.setMaxCodeLen(0);
        int int12 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("1111111111");
        boolean boolean15 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "HII");
        java.lang.String str17 = metaphone0.encode("hi!HHHHa");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        boolean boolean22 = metaphone0.isMetaphoneEqual("hi!", "##ahi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray31);
        java.lang.Object obj34 = doubleMetaphone23.encode((java.lang.Object) "hi!");
        char char37 = doubleMetaphone23.charAt("H", (int) (short) 0);
        char char40 = doubleMetaphone23.charAt("H", (int) (byte) -1);
        int int41 = doubleMetaphone23.getMaxCodeLen();
        doubleMetaphone23.setMaxCodeLen(4);
        doubleMetaphone23.setMaxCodeLen((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult47 = doubleMetaphone23.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult47.appendAlternate("\000h");
        java.lang.Object obj50 = metaphone0.encode((java.lang.Object) "\000h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H" + "'", obj34, "H");
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + 'H' + "'", char37 == 'H');
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary('h');
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append(" A111111111", "");
        doubleMetaphoneResult15.appendAlternate('a');
        doubleMetaphoneResult15.append("a");
        java.lang.String str36 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000h A111111111a" + "'", str36, "\000h A111111111a");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        doubleMetaphoneResult15.appendPrimary("A111111111");
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("HHhi!HH4hH");
        doubleMetaphoneResult15.appendAlternate("HIHIAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!HHHH" + "'", str29, "hi!HHHH");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, " #", " \000##a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        char char26 = doubleMetaphone12.charAt("H", (int) (short) 0);
        char char29 = doubleMetaphone12.charAt("H", (int) (byte) -1);
        boolean boolean33 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str35 = doubleMetaphone12.encode("");
        java.lang.String str37 = doubleMetaphone12.doubleMetaphone("");
        java.lang.String str39 = doubleMetaphone12.encode("hi!H");
        boolean boolean43 = doubleMetaphone12.isDoubleMetaphoneEqual("1111111111", "HH", true);
        int int44 = doubleMetaphone12.maxCodeLen;
        doubleMetaphone12.setMaxCodeLen((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult48 = doubleMetaphone12.new DoubleMetaphoneResult(65);
        int int49 = doubleMetaphone12.getMaxCodeLen();
        java.lang.String str51 = doubleMetaphone12.encode(" A111111111A4hHA111111111");
        boolean boolean54 = doubleMetaphone12.isDoubleMetaphoneEqual(" A1111111111", "hi!H hi!\00041");
        java.lang.Object obj55 = caverphone0.encode((java.lang.Object) "hi!H hi!\00041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone56 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        boolean boolean65 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray64);
        boolean boolean66 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray64);
        java.lang.Object obj67 = doubleMetaphone56.encode((java.lang.Object) "hi!");
        char char70 = doubleMetaphone56.charAt("H", (int) (short) 0);
        doubleMetaphone56.maxCodeLen = (short) 1;
        int int73 = doubleMetaphone56.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult75 = doubleMetaphone56.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult77 = doubleMetaphone56.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str79 = doubleMetaphone56.encode("HIAA");
        boolean boolean83 = doubleMetaphone56.isDoubleMetaphoneEqual("HIHHHH", "\000 ", false);
        java.lang.Object obj84 = caverphone0.encode((java.lang.Object) "HIHHHH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 104 + "'", int49 == 104);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "A" + "'", str51, "A");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "AA11111111" + "'", obj55, "AA11111111");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "H" + "'", obj67, "H");
        org.junit.Assert.assertTrue("'" + char70 + "' != '" + 'H' + "'", char70 == 'H');
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "H" + "'", str79, "H");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + "AA11111111" + "'", obj84, "AA11111111");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        org.apache.commons.codec.language.Caverphone caverphone1 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone2 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean6 = doubleMetaphone2.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj7 = caverphone1.encode((java.lang.Object) "a");
        boolean boolean10 = caverphone1.isCaverphoneEqual("A", "hi!H ");
        boolean boolean13 = caverphone1.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str15 = caverphone1.encode("4");
        java.lang.String str17 = caverphone1.encode("hi!H ");
        java.lang.String str19 = caverphone1.caverphone("HHa");
        boolean boolean22 = caverphone1.isCaverphoneEqual("AA11111111", "HHa");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "HHa");
        boolean boolean26 = metaphone0.isMetaphoneEqual(" \000", "HIHHHH");
        int int27 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "A111111111" + "'", obj7, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append("HI", "hi!");
        doubleMetaphoneResult15.appendAlternate('\000');
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate(' ');
        boolean boolean33 = doubleMetaphoneResult15.isComplete();
        java.lang.String str34 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!H hi!\000 " + "'", str34, "hi!H hi!\000 ");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.String str23 = doubleMetaphoneResult22.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone(" HI4AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        boolean boolean16 = metaphone0.isMetaphoneEqual("##ahi!", "hi!HH");
        int int17 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate("HIHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!HHHH" + "'", str28, "hi!HHHH");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("aa1");
        boolean boolean16 = caverphone0.isCaverphoneEqual("aa1\000hi!H hi!aA", "\000AA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HIH", "\000 ");
        int int34 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("a");
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate("#h");
        doubleMetaphoneResult15.append('i', 'i');
        doubleMetaphoneResult15.appendAlternate('\000');
        doubleMetaphoneResult15.appendPrimary(" h");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "HIH");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 104;
        java.lang.String str25 = doubleMetaphone0.encode("\000h A111111111a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        char char19 = doubleMetaphone0.charAt("hi!HH", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 97;
        char char24 = doubleMetaphone0.charAt("HIHAHIHIHAHIHH", 8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "hi!H");
        java.lang.String str15 = metaphone0.metaphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "#h", "#H##a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        int int29 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        int int32 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        boolean boolean12 = metaphone0.isMetaphoneEqual("aa", "HHa");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!", "HHI");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H ah", "ahi!H hi!A");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HIHHII", "1111111111AA111111111\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        doubleMetaphoneResult30.append('H', '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        int int15 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(52);
        boolean boolean20 = metaphone0.isMetaphoneEqual("HIHIAAA", "\000A111111111a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        int int7 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(100);
        java.lang.String str11 = metaphone0.encode("##a4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        java.lang.String str26 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary("AHII");
        doubleMetaphoneResult15.append('\000');
        boolean boolean31 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!H" + "'", str26, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.metaphone("##a");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean17 = doubleMetaphone13.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj18 = caverphone12.encode((java.lang.Object) "a");
        java.lang.String str20 = caverphone12.caverphone("hi!4");
        java.lang.String str22 = caverphone12.caverphone("4hi!Ha");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "4hi!Ha");
        java.lang.String str25 = metaphone0.encode("hi!Ha1\000hi!H hi!");
        java.lang.String str27 = metaphone0.metaphone("H1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "A111111111" + "'", obj18, "A111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "HH" + "'", obj23, "HH");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HHHH" + "'", str25, "HHHH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        java.lang.String str9 = metaphone0.metaphone("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HIHHHH", "HIHHHHIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int33 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("ahi!H hi!");
        int int38 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.maxCodeLen = '!';
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "AH" + "'", str37, "AH");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("hi!H");
        boolean boolean12 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        java.lang.String str14 = metaphone0.encode("HIH");
        java.lang.String str16 = metaphone0.metaphone(" HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str11 = metaphone0.encode("4hi!Ha");
        java.lang.String str13 = metaphone0.metaphone("HHHIHH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!#i", "HHa");
        int int17 = metaphone0.getMaxCodeLen();
        java.lang.String str19 = metaphone0.encode(" ");
        int int20 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("##a");
        java.lang.String str12 = metaphone0.encode("hi!HH");
        boolean boolean15 = metaphone0.isMetaphoneEqual("", "HAH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.append("", "hi!");
        doubleMetaphoneResult31.appendAlternate("H");
        java.lang.String str37 = doubleMetaphoneResult31.getAlternate();
        doubleMetaphoneResult31.append(' ', ' ');
        doubleMetaphoneResult31.append("HI", "hi!");
        doubleMetaphoneResult31.appendPrimary("4");
        doubleMetaphoneResult31.append("AH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!H" + "'", str37, "hi!H");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.encode("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        doubleMetaphone9.maxCodeLen = 0;
        boolean boolean28 = doubleMetaphone9.isDoubleMetaphoneEqual("H", "", false);
        int int29 = doubleMetaphone9.getMaxCodeLen();
        boolean boolean33 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!hi!aAA11111111", "hi!H hi!\00041", true);
        int int34 = doubleMetaphone9.getMaxCodeLen();
        boolean boolean37 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!hi!H hi!", "hi!A111111111A111111111ahi!H hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = caverphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        boolean boolean8 = metaphone0.isMetaphoneEqual("HIHH", "hi!4");
        java.lang.String str10 = metaphone0.encode(" ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HIH", "HIHIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str16 = metaphone0.metaphone("hi!H ");
        boolean boolean19 = metaphone0.isMetaphoneEqual("i#", "1111111111AA111111111\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!Ha");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHA" + "'", str1, "HIHA");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "hi!H#h4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        java.lang.String str15 = caverphone0.caverphone("AH");
        java.lang.String str17 = caverphone0.encode("hi!HHHH");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!4", "HHHH");
        java.lang.String str22 = caverphone0.caverphone("aHIHH");
        java.lang.String str24 = caverphone0.encode("hi!H\000i");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("AH", true);
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        int int29 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str33 = doubleMetaphone0.encode("hi!H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult35.append('A', '1');
        doubleMetaphoneResult35.appendPrimary('i');
        java.lang.String str41 = doubleMetaphoneResult35.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "HI");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "", true);
        int int34 = doubleMetaphone0.maxCodeLen;
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("aa", "#h");
        doubleMetaphone0.setMaxCodeLen((int) '1');
        doubleMetaphone0.setMaxCodeLen(2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append(' ', 'a');
        doubleMetaphoneResult15.appendAlternate("AA11111111");
        doubleMetaphoneResult15.append('i', 'i');
        doubleMetaphoneResult15.append(" A111111111A111111111");
        doubleMetaphoneResult15.append('4');
        java.lang.String str33 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!aAA11111111i A111111111A1111111114" + "'", str33, "hi!hi!aAA11111111i A111111111A1111111114");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('a', 'a');
        doubleMetaphoneResult15.appendPrimary("HIH");
        doubleMetaphoneResult15.appendAlternate("HIH");
        boolean boolean35 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("HI", 0, (int) (byte) 1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HH", (int) (short) 1, (int) '4', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 65, (int) 'H', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        java.lang.String str21 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone22.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult37.append("", "hi!");
        doubleMetaphoneResult37.append('H');
        doubleMetaphoneResult37.append("hi!");
        doubleMetaphoneResult37.appendAlternate("");
        doubleMetaphoneResult37.appendAlternate("H");
        java.lang.Object obj49 = doubleMetaphone0.encode((java.lang.Object) "H");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str54 = doubleMetaphone0.doubleMetaphone(" A111111111hi!hi!aAA11111111", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "A" + "'", str54, "A");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append('1');
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.append("4hi!HaHIhi!H A111111111", "\000H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        char char25 = doubleMetaphone0.charAt("HIHH", (int) (short) 10);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult28.append('4');
        doubleMetaphoneResult28.append('A', 'a');
        doubleMetaphoneResult28.appendAlternate('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aa", "aHa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "A");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HIH", "\000 ");
        char char36 = doubleMetaphone0.charAt("4hi!H hi!\000", 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '4' + "'", char36 == '4');
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("hi!H ", "hi!H ");
        boolean boolean17 = caverphone0.isCaverphoneEqual(" HI4AA11111111", "AH");
        java.lang.String str19 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str21 = caverphone0.encode("hi!hi!aAA11111111i A111111111A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('h');
        doubleMetaphoneResult15.append('A', '#');
        doubleMetaphoneResult15.appendPrimary("hi!H#");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("hi!", "H");
        doubleMetaphoneResult15.append("HH");
        doubleMetaphoneResult15.appendPrimary("A111111111");
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("a", "1111111111");
        doubleMetaphoneResult15.appendPrimary("hi!H hi!\000H");
        doubleMetaphoneResult15.append('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!HHHH" + "'", str29, "hi!HHHH");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        int int29 = doubleMetaphone0.maxCodeLen;
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H ", "hi!4");
        boolean boolean36 = doubleMetaphone0.isDoubleMetaphoneEqual("aa", "\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.apache.commons.codec.language.Caverphone caverphone39 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean42 = caverphone39.isCaverphoneEqual("", "");
        boolean boolean45 = caverphone39.isCaverphoneEqual("", "A111111111");
        boolean boolean48 = caverphone39.isCaverphoneEqual("A", "A");
        java.lang.String str50 = caverphone39.encode("A");
        boolean boolean53 = caverphone39.isCaverphoneEqual("a", "4");
        java.lang.Object obj54 = doubleMetaphone0.encode((java.lang.Object) "4");
        java.lang.String str57 = doubleMetaphone0.doubleMetaphone("AHHIH", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult59 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult59.append("A111111111", "4hi!Ha");
        doubleMetaphoneResult59.appendPrimary('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "A111111111" + "'", str50, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "" + "'", obj54, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "A" + "'", str57, "A");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        metaphone0.setMaxCodeLen((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!hi!hi!H hi!ahi!H hi!", (-1), (int) (byte) 10, strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha", 7, 104, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("4h4");
        int int14 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(8);
        metaphone0.setMaxCodeLen((int) 'a');
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "Hhi!1", "#HIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate("");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!" + "'", str27, "Hhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!" + "'", str28, "Hhi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!" + "'", str29, "Hhi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendAlternate(' ');
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult29.appendPrimary("HHH");
        doubleMetaphoneResult29.appendAlternate('#');
        doubleMetaphoneResult29.append('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("AH");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!", "hi!HIH");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HHa", " \000");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("AHHIH", "hi!Ha", false);
        java.lang.String str29 = doubleMetaphone0.encode("");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("HHI", "HIAAAHIHHI", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ahi!H hi!a", "HIHIHIHHIAHIHHI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("HHa", "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate("");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.append("HH");
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("hi!H4");
        doubleMetaphoneResult15.append("#HIHIhi!HHhi!H\000", "");
        java.lang.Class<?> wildcardClass35 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!HH" + "'", str29, "Hhi!HH");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("HIH");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str22 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("#");
        doubleMetaphoneResult15.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!HIH" + "'", str21, "hi!HIH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("4", "hi!H hi!");
        boolean boolean22 = doubleMetaphoneResult15.isComplete();
        java.lang.String str23 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str24 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!H hi!" + "'", str23, "hi!hi!H hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!H hi!" + "'", str24, "hi!hi!H hi!");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("hi!hi!aAA11111111", false);
        java.lang.String str21 = doubleMetaphone0.encode("hi!HHHH1111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.caverphone("AH");
        boolean boolean19 = caverphone0.isCaverphoneEqual("##ahi!", "hi!hi!aAA11111111");
        boolean boolean22 = caverphone0.isCaverphoneEqual("HHhi!HH", "hi!HH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H hi!\000");
        boolean boolean10 = metaphone0.isMetaphoneEqual("AHI", "");
        metaphone0.setMaxCodeLen((int) 'a');
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("i#", "\000\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("HI", "hi!Ha");
        doubleMetaphoneResult20.append("HI");
        doubleMetaphoneResult20.appendAlternate("hi!H A111111111");
        doubleMetaphoneResult20.append("hi!HH");
        doubleMetaphoneResult20.append("hi!H\000");
        java.lang.String str36 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.append('i');
        doubleMetaphoneResult20.appendPrimary("hi!H hi!\000 ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#HIHIhi!HHhi!H\000" + "'", str36, "#HIHIhi!HHhi!H\000");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "HIH");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("AH", false);
        doubleMetaphone0.setMaxCodeLen(10);
        doubleMetaphone0.maxCodeLen = 7;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        java.lang.String str12 = caverphone0.caverphone("hi!HIH");
        boolean boolean15 = caverphone0.isCaverphoneEqual("AHII", "HHhi!4aHHI");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary('h');
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        boolean boolean27 = doubleMetaphoneResult15.isComplete();
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append(' ', ' ');
        doubleMetaphoneResult15.append("HI", "hi!");
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('h', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!H hi!" + "'", str29, "hi!H hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult22.appendAlternate("AA");
        doubleMetaphoneResult22.append('4', 'h');
        java.lang.String str28 = doubleMetaphoneResult22.getAlternate();
        doubleMetaphoneResult22.appendPrimary("hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        int int29 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str33 = doubleMetaphone0.encode("hi!H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str37 = doubleMetaphone0.encode("#HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult21.append('h');
        doubleMetaphoneResult21.append('1', 'a');
        doubleMetaphoneResult21.appendPrimary('i');
        doubleMetaphoneResult21.append(' ', 'I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!H hi!", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        metaphone0.setMaxCodeLen(32);
        metaphone0.setMaxCodeLen((int) 'h');
        metaphone0.setMaxCodeLen((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", false);
        char char26 = doubleMetaphone0.charAt("A111111111", 9);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '1' + "'", char26 == '1');
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        java.lang.String str11 = caverphone0.encode("HHa");
        java.lang.String str13 = caverphone0.caverphone("aa1");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        doubleMetaphone14.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone14.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult29.append("", "hi!");
        doubleMetaphoneResult29.appendAlternate("H");
        java.lang.String str35 = doubleMetaphoneResult29.getAlternate();
        doubleMetaphoneResult29.appendPrimary('\000');
        doubleMetaphoneResult29.append("");
        java.lang.Object obj40 = caverphone0.encode((java.lang.Object) "");
        java.lang.String str42 = caverphone0.caverphone("#h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!H" + "'", str35, "hi!H");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A111111111" + "'", str42, "A111111111");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("4H", "\000hi!H hi!");
        java.lang.String str23 = caverphone0.caverphone("Hhi!HHhi!A111111111A111111111ahi!H hi!HHa");
        boolean boolean26 = caverphone0.isCaverphoneEqual("ahi!H hi!", "AH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AA11111111");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H A111111111", "1111111111", false);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("HII", "\000AA111111111", true);
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("hi!H");
        java.lang.String str15 = metaphone0.encode("ha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str21 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append('#', '4');
        doubleMetaphoneResult20.append("HI", "hi!Ha");
        doubleMetaphoneResult20.append("HI");
        doubleMetaphoneResult20.appendAlternate("hi!H A111111111");
        doubleMetaphoneResult20.append("hi!HH");
        doubleMetaphoneResult20.append("hi!H\000");
        java.lang.String str36 = doubleMetaphoneResult20.getPrimary();
        doubleMetaphoneResult20.append('i');
        java.lang.String str39 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#HIHIhi!HHhi!H\000" + "'", str36, "#HIHIhi!HHhi!H\000");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4hi!HaHIhi!H A111111111hi!HHhi!H\000i" + "'", str39, "4hi!HaHIhi!H A111111111hi!HHhi!H\000i");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        java.lang.String str10 = caverphone0.caverphone("Hhi!");
        java.lang.String str12 = caverphone0.caverphone("HH");
        java.lang.String str14 = caverphone0.encode("aHHIH");
        boolean boolean17 = caverphone0.isCaverphoneEqual(" #H", "HIAAAHIHHI");
        java.lang.String str19 = caverphone0.encode("Hhi!HH AHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        int int14 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str17 = metaphone15.encode("hi!");
        int int18 = metaphone15.getMaxCodeLen();
        java.lang.String str20 = metaphone15.metaphone("hi!H");
        java.lang.String str22 = metaphone15.encode("hi!H ");
        java.lang.String str24 = metaphone15.metaphone("hi!H");
        java.lang.Object obj25 = metaphone0.encode((java.lang.Object) "hi!H");
        java.lang.String str27 = metaphone0.encode("hi!4");
        java.lang.String str29 = metaphone0.encode(" #");
        java.lang.String str31 = metaphone0.encode("hi!H a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str13 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("A", "4hi!Ha");
        int int6 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "1A111111111", "#HIHIhi!HH\000A111111111ahi!H ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        int int22 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        org.apache.commons.codec.language.Metaphone metaphone25 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str27 = metaphone25.encode("hi!");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone25, "A111111111", "hi!H ");
        boolean boolean33 = metaphone25.isMetaphoneEqual("1111111111", "");
        int int34 = metaphone25.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) metaphone25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("##a");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "A111111111");
        java.lang.String str24 = caverphone16.caverphone("hi!");
        boolean boolean27 = caverphone16.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj29 = caverphone16.encode((java.lang.Object) "A111111111");
        java.lang.Object obj30 = metaphone0.encode((java.lang.Object) "A111111111");
        metaphone0.setMaxCodeLen((int) (short) -1);
        metaphone0.setMaxCodeLen((int) 'A');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone35 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray43);
        boolean boolean45 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray43);
        java.lang.Object obj46 = doubleMetaphone35.encode((java.lang.Object) "hi!");
        doubleMetaphone35.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult50 = doubleMetaphone35.new DoubleMetaphoneResult(100);
        boolean boolean54 = doubleMetaphone35.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        java.lang.Object obj55 = metaphone0.encode((java.lang.Object) "hi!HH");
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A111111111" + "'", obj29, "A111111111");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "A" + "'", obj30, "A");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "H" + "'", obj46, "H");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "H" + "'", obj55, "H");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!H", false);
        java.lang.String str28 = doubleMetaphone0.encode("hi!H");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "");
        char char34 = doubleMetaphone0.charAt("1111111111", 0);
        int int35 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '1' + "'", char34 == '1');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        java.lang.String str15 = caverphone0.encode("HHHIHH");
        java.lang.String str17 = caverphone0.caverphone("hi!hi!hi!H hi!ahi!H hi!");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "4H", "hi!H\000hi!4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!H", "");
        java.lang.String str13 = caverphone0.encode("hi!HIH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("\000h", "HIHA");
        java.lang.String str18 = caverphone0.encode("hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "hi!A111111111A111111111ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("4 ahi!hi!aAA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int33 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str37 = doubleMetaphone0.encode("AA");
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int40 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
        char char28 = doubleMetaphone0.charAt("HI", (int) '#');
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone0.new DoubleMetaphoneResult(65);
        java.lang.String str35 = doubleMetaphone0.doubleMetaphone("hi!H4", true);
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append(' ', 'a');
        doubleMetaphoneResult15.appendAlternate("AA11111111");
        doubleMetaphoneResult15.append('i', 'i');
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('#', 'h');
        java.lang.String str33 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! i" + "'", str29, "hi! i");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi! i#" + "'", str33, "hi! i#");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!4a", false);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("aa1", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendPrimary("a");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHa" + "'", str27, "HHa");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!");
        boolean boolean18 = metaphone0.isMetaphoneEqual("HIHIHIHHIAHIHHI", "hi! i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AHH", "1A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("aa1");
        java.lang.String str15 = caverphone0.encode("Hhi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        char char30 = doubleMetaphone16.charAt("H", (int) (short) 0);
        char char33 = doubleMetaphone16.charAt("H", (int) (byte) -1);
        boolean boolean37 = doubleMetaphone16.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str39 = doubleMetaphone16.encode("");
        java.lang.String str42 = doubleMetaphone16.doubleMetaphone("hi!H", false);
        java.lang.String str44 = doubleMetaphone16.encode("hi!H");
        int int45 = doubleMetaphone16.maxCodeLen;
        int int48 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "hi!H ", "hi!4");
        java.lang.String str50 = doubleMetaphone16.encode("ahi!H hi!");
        java.lang.Object obj51 = caverphone0.encode((java.lang.Object) str50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'H' + "'", char30 == 'H');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H" + "'", str42, "H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "H" + "'", str44, "H");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AH" + "'", str50, "AH");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "A111111111" + "'", obj51, "A111111111");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        boolean boolean16 = metaphone0.isMetaphoneEqual("4", "hi!Ha");
        metaphone0.setMaxCodeLen((-1));
        java.lang.String str20 = metaphone0.encode("HHIHI");
        int int21 = metaphone0.getMaxCodeLen();
        java.lang.String str23 = metaphone0.encode("4h4");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HHHH", "#h");
        java.lang.String str28 = metaphone0.encode("");
        java.lang.String str30 = metaphone0.encode("Hhi!1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str11 = metaphone0.encode("4hi!Ha");
        java.lang.String str13 = metaphone0.metaphone("HHHIHH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!#i", "HHa");
        java.lang.String str18 = metaphone0.encode("AHII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.encode("hi!H hi!");
        int int13 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'A');
        java.lang.String str17 = metaphone0.metaphone("HII");
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 65 + "'", int18 == 65);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate("");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.append("HH");
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("ahi!H hi!a", "hi!Hhi!#");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!Hhi!HHH" + "'", str30, "hi!Hhi!HHH");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        int int4 = metaphone0.getMaxCodeLen();
        boolean boolean7 = metaphone0.isMetaphoneEqual("aa1", "HIHIAAA");
        metaphone0.setMaxCodeLen(72);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendPrimary("a");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('h');
        doubleMetaphoneResult15.append("4 ahi!hi!aAA11111111", "hi!hi!aAA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHa" + "'", str27, "HHa");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HHa" + "'", str28, "HHa");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a", true);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AA11111111");
        int int33 = doubleMetaphone0.maxCodeLen;
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) "hi!4");
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("4 aH4", "HIHAHIHIHAHIHH");
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("HIAA", "hi!H hi!\000 ");
        int int44 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "#h", "\000A111111111a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "A" + "'", str32, "A");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("HIH", "hi!HH");
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendPrimary("hi!hi!H hi!");
        doubleMetaphoneResult15.appendPrimary("HHhi!4aH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!4a", false);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "##ahi!", false);
        char char30 = doubleMetaphone0.charAt("1111111111", (int) (short) 0);
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("hi!H hi!", false);
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!HIH", true);
        java.lang.String str40 = doubleMetaphone0.doubleMetaphone("HIHH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '1' + "'", char30 == '1');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("aH\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A" + "'", str6, "A");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int16 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "##a4ihi!Hhi!#i", "4 a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        char char25 = doubleMetaphone0.charAt("HIHH", (int) (short) 10);
        int int26 = doubleMetaphone0.getMaxCodeLen();
        char char29 = doubleMetaphone0.charAt("HIHAHIHHI", 0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray38);
        java.lang.Object obj41 = doubleMetaphone30.encode((java.lang.Object) "hi!");
        doubleMetaphone30.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult45 = doubleMetaphone30.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult45.append("", "hi!");
        doubleMetaphoneResult45.appendAlternate("H");
        java.lang.String str51 = doubleMetaphoneResult45.getAlternate();
        doubleMetaphoneResult45.appendPrimary('\000');
        doubleMetaphoneResult45.append("");
        java.lang.String str56 = doubleMetaphoneResult45.getAlternate();
        java.lang.Object obj57 = doubleMetaphone0.encode((java.lang.Object) str56);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H" + "'", obj41, "H");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!H" + "'", str51, "hi!H");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!H" + "'", str56, "hi!H");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "H" + "'", obj57, "H");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendPrimary("H");
        doubleMetaphoneResult15.appendAlternate('H');
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HH" + "'", str25, "HH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.append('a');
        doubleMetaphoneResult15.append("HIHAH", "\000ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.append("hi!H hi!");
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.appendAlternate("HH");
        boolean boolean33 = doubleMetaphoneResult15.isComplete();
        java.lang.String str34 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("", "Hhi!hi!4 h ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ahi!H hi!" + "'", str34, "ahi!H hi!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "hi!HaHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ahi!H hi!A", "HIAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult23.append("", " h");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.appendAlternate("");
        doubleMetaphoneResult15.appendAlternate("H");
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("");
        doubleMetaphoneResult15.append("HIHAH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!" + "'", str27, "Hhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!" + "'", str28, "Hhi!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        java.lang.String str12 = metaphone0.metaphone("1111111111");
        int int13 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        char char28 = doubleMetaphone14.charAt("H", (int) (short) 0);
        char char31 = doubleMetaphone14.charAt("H", (int) (byte) -1);
        boolean boolean35 = doubleMetaphone14.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str37 = doubleMetaphone14.encode("");
        java.lang.String str40 = doubleMetaphone14.doubleMetaphone("hi!H", false);
        java.lang.String str42 = doubleMetaphone14.doubleMetaphone("AH");
        java.lang.Object obj43 = metaphone0.encode((java.lang.Object) str42);
        int int44 = metaphone0.getMaxCodeLen();
        boolean boolean47 = metaphone0.isMetaphoneEqual("4h4", "hi!H4");
        java.lang.String str49 = metaphone0.metaphone("#HIHIhi!HHhi!H\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'H' + "'", char28 == 'H');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A" + "'", str42, "A");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "A" + "'", obj43, "A");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "HHH" + "'", str49, "HHH");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!H hi!", "hi!H ");
        boolean boolean19 = metaphone0.isMetaphoneEqual("\000\000", "AAHIH");
        java.lang.String str21 = metaphone0.metaphone("\000A111111111hi!H ");
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4AH", "\000A111111111hi!H ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }
}

