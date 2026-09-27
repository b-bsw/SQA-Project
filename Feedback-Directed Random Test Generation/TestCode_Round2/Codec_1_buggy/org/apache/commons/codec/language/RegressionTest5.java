package org.apache.commons.codec.language;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("hi!4", (int) 'a');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Hhi!#i", "\000hi!H hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String str11 = metaphone0.metaphone("ahi!H hi!a");
        int int12 = metaphone0.getMaxCodeLen();
        java.lang.String str14 = metaphone0.encode("hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        java.lang.String str31 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!HHHHhi! #" + "'", str31, "hi!HHHHhi! #");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        doubleMetaphoneResult15.append("HIAA");
        doubleMetaphoneResult15.append(" HI", "");
        java.lang.String str32 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str33 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000HHIAA HI" + "'", str32, "\000HHIAA HI");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!HHIAA" + "'", str33, "hi!HHIAA");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("aa1", true);
        doubleMetaphone0.setMaxCodeLen(9);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "A", "hi!HHHHa");
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("HHIHH", "hi!H hi!\000 ");
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("hi!H#");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        boolean boolean8 = metaphone0.isMetaphoneEqual("HIHH", "hi!4");
        boolean boolean11 = metaphone0.isMetaphoneEqual(" #H", "hi!Hhi!#i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        int int34 = doubleMetaphone0.maxCodeLen;
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        doubleMetaphoneResult15.append("A111111111", "AH");
        doubleMetaphoneResult15.appendAlternate("");
        java.lang.String str32 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000hA111111111" + "'", str32, "\000hA111111111");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.lang.String str63 = doubleMetaphoneResult59.getAlternate();
        doubleMetaphoneResult59.append("hi!HHHH1111111111");
        doubleMetaphoneResult59.appendPrimary('a');
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4hi!Ha" + "'", str63, "4hi!Ha");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        boolean boolean12 = metaphone0.isMetaphoneEqual("hi!HIH", "Hhi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray21);
        java.lang.Object obj24 = doubleMetaphone13.encode((java.lang.Object) "hi!");
        char char27 = doubleMetaphone13.charAt("H", (int) (short) 0);
        char char30 = doubleMetaphone13.charAt("H", (int) (byte) -1);
        boolean boolean34 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str36 = doubleMetaphone13.encode("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone13.new DoubleMetaphoneResult((int) '1');
        doubleMetaphone13.setMaxCodeLen((int) '4');
        java.lang.String str43 = doubleMetaphone13.doubleMetaphone("", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = metaphone0.encode((java.lang.Object) str43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H" + "'", obj24, "H");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        boolean boolean12 = metaphone0.isMetaphoneEqual("hi!H", "4hi!Ha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        doubleMetaphoneResult15.appendPrimary(' ');
        doubleMetaphoneResult15.appendAlternate('h');
        doubleMetaphoneResult15.appendPrimary('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("aHHIH", "4h4");
        java.lang.String str23 = caverphone0.caverphone("hi!4a");
        boolean boolean26 = caverphone0.isCaverphoneEqual("", "HHA");
        java.lang.String str28 = caverphone0.encode("\000");
        boolean boolean31 = caverphone0.isCaverphoneEqual("hi!Ha", "\000A111111111a");
        java.lang.String str33 = caverphone0.caverphone("hi!H#a");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("H", "AHI");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        org.apache.commons.codec.language.Metaphone metaphone16 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str18 = metaphone16.encode("hi!");
        int int19 = metaphone16.getMaxCodeLen();
        java.lang.String str21 = metaphone16.metaphone("hi!H");
        java.lang.String str23 = metaphone16.encode("hi!H ");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone16, "A", "hi!H ");
        metaphone16.setMaxCodeLen(3);
        int int29 = metaphone16.getMaxCodeLen();
        int int30 = metaphone16.getMaxCodeLen();
        int int31 = metaphone16.getMaxCodeLen();
        java.lang.String str33 = metaphone16.encode(" A111111111");
        java.lang.Object obj34 = caverphone0.encode((java.lang.Object) " A111111111");
        java.lang.String str36 = caverphone0.caverphone("hi!H a##a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "A111111111" + "'", obj34, "A111111111");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AA11111111" + "'", str36, "AA11111111");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H", "H");
        int int26 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("hi!HHHhi!hi!hi!H hi!ahi!H hi!hi!H ", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        boolean boolean45 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!hi!aAA11111111", "hi!H hi!\000H");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        char char18 = doubleMetaphone0.charAt("AA11111111", (int) (byte) 100);
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("HHI", "hi!H");
        doubleMetaphoneResult15.append('4');
        doubleMetaphoneResult15.append('H', 'I');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Hhi!1" + "'", str25, "Hhi!1");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        int int39 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        doubleMetaphoneResult28.append('1');
        boolean boolean36 = doubleMetaphoneResult28.isComplete();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        doubleMetaphone0.maxCodeLen = 9;
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str39 = doubleMetaphone0.encode("HHH");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("Hhi!");
        java.lang.String str13 = caverphone0.encode("H");
        java.lang.String str15 = caverphone0.encode("I");
        java.lang.String str17 = caverphone0.caverphone(" \000##a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("A111111111", (int) '1', 52, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h4", 33, 100, strArray19);
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHH", (int) 'h', (int) '4', strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000hi!H hi!", 3, 35, strArray19);
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.encode("hi!");
        int int16 = metaphone13.getMaxCodeLen();
        java.lang.String str18 = metaphone13.metaphone("hi!H");
        java.lang.String str20 = metaphone13.encode("hi!H ");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone13, "A", "hi!H ");
        metaphone13.setMaxCodeLen(3);
        int int26 = metaphone13.getMaxCodeLen();
        int int27 = metaphone13.getMaxCodeLen();
        int int28 = metaphone13.getMaxCodeLen();
        int int31 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone13, " \000", "aH");
        java.lang.String str33 = metaphone13.metaphone(" HI4AA11111111");
        java.lang.Object obj34 = metaphone0.encode((java.lang.Object) " HI4AA11111111");
        java.lang.String str36 = metaphone0.metaphone("#hi!H\000#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "H" + "'", str33, "H");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H" + "'", obj34, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("i#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        char char38 = doubleMetaphone0.charAt(" A111111111A4hHA111111111", 72);
        java.lang.String str40 = doubleMetaphone0.doubleMetaphone("hi!HHA111111111HHHhi!HH4hH");
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
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hH", 49, 97, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        doubleMetaphoneResult20.append(" HI4AA11111111", "hi!hi!aAA11111111");
        doubleMetaphoneResult20.appendAlternate('i');
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
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!H", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("", "");
        boolean boolean15 = caverphone9.isCaverphoneEqual("", "A111111111");
        java.lang.String str17 = caverphone9.caverphone("hi!");
        boolean boolean20 = caverphone9.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj21 = caverphone0.encode((java.lang.Object) "HIH");
        boolean boolean24 = caverphone0.isCaverphoneEqual("hi!H\000hi!4", "##ahi!");
        java.lang.String str26 = caverphone0.caverphone("hi!hi!aAA11111111i A111111111A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "AA11111111" + "'", obj21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a", false);
        org.apache.commons.codec.language.Caverphone caverphone4 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean7 = caverphone4.isCaverphoneEqual("", "");
        boolean boolean10 = caverphone4.isCaverphoneEqual("", "A111111111");
        java.lang.String str12 = caverphone4.caverphone("hi!");
        java.lang.String str14 = caverphone4.caverphone("HH");
        java.lang.String str16 = caverphone4.caverphone("hi!H hi!");
        java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) "hi!H hi!");
        java.lang.String str19 = doubleMetaphone0.encode("hi!H#h4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        doubleMetaphone0.maxCodeLen = 9;
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHH", "HIAA");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str42 = doubleMetaphone0.encode("AA11111111");
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "A" + "'", str42, "A");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("#HIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI" + "'", str1, "HIHI");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        char char36 = doubleMetaphone0.charAt("A", (-1));
        doubleMetaphone0.maxCodeLen = 0;
        int int39 = doubleMetaphone0.maxCodeLen;
        boolean boolean42 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "hi!HHHHa");
        boolean boolean46 = doubleMetaphone0.isDoubleMetaphoneEqual(" #H", "HIHHHHIH", false);
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
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        char char24 = doubleMetaphone0.charAt("hi!H", 4);
        doubleMetaphone0.maxCodeLen = 3;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        doubleMetaphoneResult15.append('a');
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
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.lang.String str24 = caverphone0.encode("HIH \000");
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
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(8);
        doubleMetaphoneResult22.appendPrimary("\000A111111111hi!H ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        doubleMetaphoneResult20.append("hi!H\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##ahi!" + "'", str32, "##ahi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4 a" + "'", str33, "4 a");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str20 = doubleMetaphone0.encode("HII");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(72);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("H", false);
        org.apache.commons.codec.language.Caverphone caverphone23 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean28 = doubleMetaphone24.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj29 = caverphone23.encode((java.lang.Object) "a");
        java.lang.String str31 = caverphone23.caverphone("hi!4");
        java.lang.String str33 = caverphone23.caverphone("4hi!Ha");
        java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) str33);
        int int35 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("HIHIHHI", "HIHH");
        int int39 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "A111111111" + "'", obj29, "A111111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "AA11111111" + "'", str33, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        boolean boolean39 = doubleMetaphone0.isDoubleMetaphoneEqual("aa", "\000", false);
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("HIHIAAAHIHIH");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HHHH" + "'", str41, "HHHH");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000AA111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("AA11111111");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.lang.String str63 = doubleMetaphoneResult59.getAlternate();
        doubleMetaphoneResult59.append("hi!HHHH1111111111");
        doubleMetaphoneResult59.appendAlternate('h');
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4hi!Ha" + "'", str63, "4hi!Ha");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ahi!H hi!a", "HIHIHIHHIAHIHHI");
        java.lang.String str13 = caverphone0.caverphone("4hi!HaHIhi!H A111111111hi!HH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        doubleMetaphone0.maxCodeLen = 3;
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "hi!H hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        metaphone0.setMaxCodeLen(4);
        boolean boolean12 = metaphone0.isMetaphoneEqual("", "HII");
        java.lang.String str14 = metaphone0.metaphone(" \000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.encode("HI");
        java.lang.String str11 = metaphone0.metaphone("HI");
        java.lang.String str13 = metaphone0.metaphone("HHI");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult(2);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("aa");
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHHIH", "hi!HIH");
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("AHIHHIA", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "AH" + "'", str28, "AH");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HHHH" + "'", str27, "hi!HHHH");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!H ah");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!4", "hi!HaHI");
        java.lang.String str18 = caverphone0.caverphone("hi!H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        java.lang.String str26 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendAlternate("hi!HH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!aAA11111111" + "'", str26, "hi!hi!aAA11111111");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        java.lang.String str12 = metaphone0.metaphone("1111111111");
        java.lang.String str14 = metaphone0.metaphone("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        java.lang.String str38 = doubleMetaphone0.encode("HHI");
        char char41 = doubleMetaphone0.charAt("1111111111", 2);
        int int42 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '1');
        boolean boolean48 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HaHIH", "hi!hi!hi!H hi!ahi!H hi!", false);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '1' + "'", char41 == '1');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "1111111111");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("##a");
        char char29 = doubleMetaphone0.charAt("\000h", (-1));
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AHI", true);
        int int33 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone34 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray42);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray42);
        java.lang.Object obj45 = doubleMetaphone34.encode((java.lang.Object) "hi!");
        doubleMetaphone34.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult49 = doubleMetaphone34.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult49.append("", "hi!");
        doubleMetaphoneResult49.appendAlternate("A111111111");
        doubleMetaphoneResult49.appendAlternate("A111111111");
        doubleMetaphoneResult49.append('\000', 'a');
        doubleMetaphoneResult49.appendPrimary("##a");
        doubleMetaphoneResult49.appendAlternate('A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult49);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AH" + "'", str32, "AH");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "H" + "'", obj45, "H");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "1111111111");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("##a");
        char char29 = doubleMetaphone0.charAt("\000h", (-1));
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("AHI", true);
        int int33 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "AH" + "'", str32, "AH");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        java.lang.String str34 = doubleMetaphoneResult28.getAlternate();
        doubleMetaphoneResult28.appendAlternate("H1");
        doubleMetaphoneResult28.appendPrimary("##a4");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "aHIHH" + "'", str34, "aHIHH");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.String str58 = doubleMetaphone0.doubleMetaphone("hi!Hhi!hi!4hi!4hi!Ha", false);
        doubleMetaphone0.maxCodeLen = 7;
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "H" + "'", str58, "H");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("hahi!H hi!h", 9);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(33);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone(" #H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '!' + "'", char18 == '!');
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '!');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        java.lang.String str23 = caverphone0.encode("#HAH#");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String[] strArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("1111111111AA111111111\000", (int) (short) 1, (-1), strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 22");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult32 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        doubleMetaphone0.maxCodeLen = (short) 10;
        int int34 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("HHhi!4aH");
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHHA", "HIA");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        boolean boolean8 = metaphone0.isMetaphoneEqual("A", "hi!H ");
        java.lang.String str10 = metaphone0.encode("hi!4a");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 5;
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.metaphone("hi!4");
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.encode("hi!Hhi!HHH");
        java.lang.String str17 = metaphone0.encode("HIHHHHIH");
        java.lang.String str19 = metaphone0.metaphone("hi!hi!#h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HH" + "'", str19, "HH");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("AH");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        doubleMetaphoneResult15.appendPrimary('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("Hhi!");
        java.lang.String str15 = caverphone0.caverphone("hi!H");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "A111111111");
        java.lang.String str24 = caverphone16.caverphone("hi!");
        java.lang.String str26 = caverphone16.caverphone("HHA");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray35);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray35);
        java.lang.Object obj38 = doubleMetaphone27.encode((java.lang.Object) "hi!");
        doubleMetaphone27.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone27.new DoubleMetaphoneResult(100);
        java.lang.String str43 = doubleMetaphoneResult42.getPrimary();
        doubleMetaphoneResult42.append('\000');
        doubleMetaphoneResult42.append("A111111111");
        java.lang.Object obj48 = caverphone16.encode((java.lang.Object) "A111111111");
        java.lang.String str50 = caverphone16.encode("hi!4a");
        java.lang.Object obj51 = caverphone0.encode((java.lang.Object) str50);
        java.lang.String str53 = caverphone0.encode("HIHHII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AA11111111" + "'", str26, "AA11111111");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H" + "'", obj38, "H");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "A111111111" + "'", obj48, "A111111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "AA11111111" + "'", obj51, "AA11111111");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AA11111111" + "'", str53, "AA11111111");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        int int30 = doubleMetaphone0.getMaxCodeLen();
        char char33 = doubleMetaphone0.charAt("ahi!H hi!", 3);
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("##a4ihi!Hhi!#i", "#h", false);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '!' + "'", char33 == '!');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000AA111111111", (int) (short) 1, 32, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, (int) 'H', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha1\000hi!H hi!", 8, 0, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        java.lang.String str10 = metaphone0.metaphone("");
        java.lang.String str12 = metaphone0.metaphone("HIH");
        int int13 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(104);
        metaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!Hhi!HHH", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        boolean boolean17 = metaphone0.isMetaphoneEqual("aa", "HI");
        int int18 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray27);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray27);
        java.lang.Object obj30 = doubleMetaphone19.encode((java.lang.Object) "hi!");
        char char33 = doubleMetaphone19.charAt("H", (int) (short) 0);
        char char36 = doubleMetaphone19.charAt("hi!", (int) (byte) 100);
        boolean boolean40 = doubleMetaphone19.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) "H");
        int int42 = doubleMetaphone0.maxCodeLen;
        char char45 = doubleMetaphone0.charAt("aHHIH", (int) '1');
        boolean boolean49 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H!", "hi!HHIAA", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H" + "'", obj30, "H");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + 'H' + "'", char33 == 'H');
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "" + "'", obj41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '\000' + "'", char45 == '\000');
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        int int26 = doubleMetaphone0.maxCodeLen;
        int int27 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("HHhi!HH4hH", "##a", false);
        java.lang.String str33 = doubleMetaphone0.doubleMetaphone("hi!H a##a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        doubleMetaphone0.maxCodeLen = 10;
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("#HIHIhi!HH\000A111111111ahi!H ");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HHH" + "'", str41, "HHH");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!4a", false);
        char char26 = doubleMetaphone0.charAt("HIH", (int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone0.new DoubleMetaphoneResult(49);
        java.lang.String str29 = doubleMetaphoneResult28.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray28);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hH", (int) (short) 1, 9, strArray28);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains(" A111111111", (int) (short) 1, (int) 'i', strArray28);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa1", (int) 'i', (int) '\000', strArray28);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha1\000hi!H hi!", (int) (byte) 1, 100, strArray28);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("AHHIH", 10, (int) (byte) 0, strArray28);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH", 3, (int) (byte) 10, strArray28);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("#H", (int) (byte) 1, (int) '\000', strArray28);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendAlternate("HHhi!HH");
        doubleMetaphoneResult15.appendPrimary("##a4ihi!Hhi!#i");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.encode("HI");
        java.lang.String str12 = caverphone0.caverphone("hi!HHHH");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HIHH", "4");
        boolean boolean18 = caverphone0.isCaverphoneEqual("HHIHI", " A111111111");
        java.lang.Class<?> wildcardClass19 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        int int1 = metaphone0.getMaxCodeLen();
        boolean boolean4 = metaphone0.isMetaphoneEqual("Hhi!", "hi!H hi!\000");
        metaphone0.setMaxCodeLen(49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        doubleMetaphone0.maxCodeLen = 9;
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str40 = doubleMetaphone0.doubleMetaphone("", true);
        org.apache.commons.codec.language.Metaphone metaphone41 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str43 = metaphone41.encode("hi!");
        int int44 = metaphone41.getMaxCodeLen();
        java.lang.String str46 = metaphone41.metaphone("hi!H");
        java.lang.String str48 = metaphone41.encode("hi!H ");
        int int51 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone41, "A", "hi!H ");
        metaphone41.setMaxCodeLen((int) 'i');
        java.lang.String str55 = metaphone41.metaphone("H");
        java.lang.Object obj56 = doubleMetaphone0.encode((java.lang.Object) str55);
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "H" + "'", str43, "H");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "H" + "'", str46, "H");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "H" + "'", str48, "H");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "H" + "'", str55, "H");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "" + "'", obj56, "");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!hi!aAA11111111", "hi!H hi!\00041", true);
        int int25 = doubleMetaphone0.getMaxCodeLen();
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        doubleMetaphoneResult55.appendAlternate('A');
        doubleMetaphoneResult55.append("Hhi!HH");
        doubleMetaphoneResult55.append(" A111111111", "HHIHHAHHHHHH");
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
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("HHhi!HH", "hi!HHHHa", false);
        org.apache.commons.codec.language.Caverphone caverphone33 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean36 = caverphone33.isCaverphoneEqual("", "");
        boolean boolean39 = caverphone33.isCaverphoneEqual("", "A111111111");
        boolean boolean42 = caverphone33.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str44 = caverphone33.caverphone("H");
        java.lang.String str46 = caverphone33.caverphone("A111111111");
        java.lang.String str48 = caverphone33.caverphone("hi!4");
        java.lang.String str50 = caverphone33.encode("hi!HHHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = doubleMetaphone0.encode((java.lang.Object) caverphone33);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "A111111111" + "'", str44, "A111111111");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "A111111111" + "'", str46, "A111111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "AA11111111" + "'", str50, "AA11111111");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        boolean boolean16 = caverphone0.isCaverphoneEqual("AHHIH", "hi!hi!aAA11111111");
        boolean boolean19 = caverphone0.isCaverphoneEqual("", "hi! i#");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.encode("HI");
        int int10 = metaphone0.getMaxCodeLen();
        boolean boolean13 = metaphone0.isMetaphoneEqual("HIHIAAAHIHIH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        int int21 = doubleMetaphone0.maxCodeLen;
        java.lang.String str23 = doubleMetaphone0.encode("Hhi!");
        int int24 = doubleMetaphone0.maxCodeLen;
        int int25 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        boolean boolean35 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "4");
        int int36 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        char char28 = doubleMetaphone0.charAt("H\000\000", (int) '1');
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
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str13 = metaphone0.metaphone("A111111111");
        java.lang.String str15 = metaphone0.encode("HIHHIHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        doubleMetaphoneResult15.append("HAH", "ahi!H hi!A");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        char char18 = doubleMetaphone0.charAt("A111111111", (int) (byte) -1);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" A111111111");
        char char23 = doubleMetaphone0.charAt("4", 3);
        int int24 = doubleMetaphone0.maxCodeLen;
        java.lang.String str26 = doubleMetaphone0.encode("HIHHIHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        org.apache.commons.codec.language.Caverphone caverphone18 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean23 = doubleMetaphone19.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj24 = caverphone18.encode((java.lang.Object) "a");
        boolean boolean27 = caverphone18.isCaverphoneEqual("A", "hi!H ");
        boolean boolean30 = caverphone18.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str32 = caverphone18.caverphone("1111111111");
        java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) "1111111111");
        java.lang.String str35 = doubleMetaphone0.encode("hi!HHHHIH");
        boolean boolean39 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!hi!4", " HI", true);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "A111111111" + "'", obj24, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HHIHI", "hi! ihA111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        boolean boolean13 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "AA11111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("\000i", "HHhi!4aH");
        boolean boolean19 = metaphone0.isMetaphoneEqual("hi!H hi!4H", "Ah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.lang.String str45 = doubleMetaphone0.doubleMetaphone("");
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        doubleMetaphoneResult15.appendPrimary('i');
        doubleMetaphoneResult15.appendAlternate(' ');
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append("H1", "#H");
        doubleMetaphoneResult15.appendPrimary('i');
        doubleMetaphoneResult15.appendPrimary("1111111111");
        doubleMetaphoneResult15.append("#hi!HH4", "4aa ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual(" A1111111111", "HHHHH");
        boolean boolean36 = doubleMetaphone0.isDoubleMetaphoneEqual("#HIHIhi!HHhi!H\000", "hi!HHHHa", false);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        doubleMetaphoneResult15.append("AH", "hi!HHHHH!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        doubleMetaphoneResult15.append("");
        doubleMetaphoneResult15.append("#HIHIhi!HH\000A111111111ahi!H ", "hi! ihA111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("Hhi!", (int) (short) -1, 9, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        doubleMetaphoneResult15.appendAlternate('1');
        doubleMetaphoneResult15.append('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        int int26 = doubleMetaphone0.getMaxCodeLen();
        int int27 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone0.new DoubleMetaphoneResult(8);
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("HIHHHIH", false);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi! i A111111111A111111111HIIHIAAha");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIIAAHIIHIAAHA" + "'", str1, "HIIAAHIIHIAAHA");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000", (int) (byte) 10, (int) '\000', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHIAAA", 2, (int) 'H', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 97, 104, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Hhi!HHH", 4, (int) (short) 10, strArray19);
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        doubleMetaphoneResult35.append('a', 'i');
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
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.maxCodeLen = 0;
        int int24 = doubleMetaphone0.maxCodeLen;
        char char27 = doubleMetaphone0.charAt("HHHHHH", (int) 'I');
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.lang.String str38 = doubleMetaphone0.encode("HHI");
        char char41 = doubleMetaphone0.charAt("1111111111", 2);
        int int42 = doubleMetaphone0.maxCodeLen;
        int int43 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '1' + "'", char41 == '1');
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int30 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        java.lang.String str11 = caverphone0.encode("HHa");
        java.lang.String str13 = caverphone0.encode("hi!H\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str11 = metaphone0.metaphone("##ahi!");
        int int12 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("\000A111111111HII", (int) (byte) 10);
        doubleMetaphone0.setMaxCodeLen(2);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '1' + "'", char17 == '1');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("##a");
        metaphone0.setMaxCodeLen(2);
        java.lang.String str14 = metaphone0.encode("hi!hi!hi!H hi!ahi!H hi!");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str18 = metaphone0.encode("hi!H#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi! i", "hi!HHHH");
        int int19 = doubleMetaphone0.getMaxCodeLen();
        int int20 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!H\000#", "##a");
        java.lang.String str25 = doubleMetaphone0.encode("\000A111111111HII");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.lang.String str28 = doubleMetaphone0.encode("Hhi!1");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "HII");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "\000hi!H hi!", "hi!HHHH");
        java.lang.String str23 = metaphone0.metaphone("hahi!HHHH\000A111111111HII\000H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHH" + "'", str23, "HHH");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        doubleMetaphoneResult15.append("1111111111", "hi!Ha");
        doubleMetaphoneResult15.appendPrimary("hi!H ");
        doubleMetaphoneResult15.appendAlternate("4 a");
        doubleMetaphoneResult15.append("hi!H hi!\000H", "H\000HHa");
        doubleMetaphoneResult15.appendAlternate("HIHHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        doubleMetaphoneResult15.append('a');
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
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append("A111111111", "ahi!H hi!");
        doubleMetaphoneResult15.appendAlternate("\000A111111111HII");
        doubleMetaphoneResult15.appendPrimary("4hi!HaHIhi!H A111111111hi!HH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        java.lang.String str30 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4hi!HaHI" + "'", str30, "4hi!HaHI");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        int int24 = doubleMetaphone0.getMaxCodeLen();
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!A111111111HHI", "\000 ");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "##hhi!Hhi!HHH", "#hi!HH4 \000ahi!H hi!A");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        char char19 = doubleMetaphone0.charAt("hi!HH", (int) (short) -1);
        doubleMetaphone0.maxCodeLen = 97;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        int int24 = doubleMetaphone0.maxCodeLen;
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("aH", "Hhi!ahi!H hi!a");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("HHHIHH", "\000AA", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        metaphone0.setMaxCodeLen(8);
        metaphone0.setMaxCodeLen(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        doubleMetaphoneResult15.append('\000', '!');
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
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!\000", "hi!Ha");
        java.lang.String str5 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("#HIHI", false);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        boolean boolean32 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!", "A", false);
        int int33 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("", true);
        java.lang.String str38 = doubleMetaphone0.encode("aa1");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "A" + "'", str38, "A");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        doubleMetaphoneResult59.appendAlternate("HH");
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int12 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 1);
        metaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str18 = metaphone0.encode("1111111111");
        java.lang.String str20 = metaphone0.metaphone("HHHIHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        doubleMetaphone0.maxCodeLen = 'h';
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
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        java.lang.String str4 = metaphone0.metaphone("4hi!HaHIhi!H A111111111hi!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHH" + "'", str4, "HHHH");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!H hi!" + "'", str28, "hi!H hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!H hi!" + "'", str29, "hi!H hi!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        java.lang.String str29 = doubleMetaphone0.encode("\000a HI4AA111111111A111111111");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        int int29 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str31 = doubleMetaphone0.encode("hi!A111111111");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("hi!hi!hi!H hi!\000 ", "#");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("A", "");
        boolean boolean14 = metaphone0.isMetaphoneEqual("4hH", "hi!A111111111");
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.metaphone("hi! hH1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        doubleMetaphoneResult15.append('A', '\000');
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("A111111111", (int) '#');
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("a");
        java.lang.String str22 = doubleMetaphone0.encode("1111111111");
        int int23 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 10;
        int int26 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        doubleMetaphoneResult15.appendPrimary('4');
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H#hi!H hi!a4 a", (-1), 7, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("aa");
        boolean boolean17 = caverphone0.isCaverphoneEqual("A", "HH");
        java.lang.String str19 = caverphone0.encode("");
        java.lang.String str21 = caverphone0.caverphone("hi!4");
        java.lang.String str23 = caverphone0.caverphone("hi!4HIHhi! iAHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.appendPrimary("HAH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("HAH", "hi!H ");
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("hi!HHHHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.lang.String str22 = metaphone0.encode(" #H");
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H\000", (int) 'h', (int) ' ', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("aH\000", 0, 3, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHHH", 8, 65, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHHH", 10, 2, strArray19);
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        doubleMetaphone0.maxCodeLen = '4';
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!hi!a", "HHIHI");
        int int27 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        java.lang.String str21 = metaphone0.metaphone("\000AA");
        java.lang.Class<?> wildcardClass22 = metaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        java.lang.Class<?> wildcardClass29 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str13 = metaphone0.metaphone("A111111111");
        int int14 = metaphone0.getMaxCodeLen();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "Hhi!1", "HHhi!HHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        doubleMetaphone0.setMaxCodeLen((int) '!');
        char char32 = doubleMetaphone0.charAt("hi!Hhi!hi!4hi!4hi!Ha", 104);
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
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        doubleMetaphoneResult15.appendPrimary("4");
        doubleMetaphoneResult15.append("AA11111111", "hi!H");
        java.lang.String str33 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " HI4AA11111111" + "'", str33, " HI4AA11111111");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("hi!H");
        boolean boolean12 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        metaphone0.setMaxCodeLen((int) '1');
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!hi!hi!H hi!ahi!H hi!", "##a4ihi!Hhi!#i");
        java.lang.String str19 = metaphone0.metaphone("4hi!HaHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HHH" + "'", str19, "HHH");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000", (int) (byte) 10, (int) '\000', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHIAAA", 2, (int) 'H', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHhi!4aH", 7, 32, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("A", "4hi!Ha");
        boolean boolean6 = metaphone0.isMetaphoneEqual("hi!H", "a");
        java.lang.String str8 = metaphone0.metaphone("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("4h4");
        java.lang.String str15 = metaphone0.metaphone("HIHIHIHHIAHIHHI");
        metaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHH" + "'", str15, "HHHH");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult27.append(" h ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        doubleMetaphoneResult15.appendPrimary("\000h A111111111a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!H", "");
        java.lang.String str13 = caverphone0.encode("hi!HIH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("\000h", "HIHA");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray25);
        java.lang.Object obj28 = doubleMetaphone17.encode((java.lang.Object) "hi!");
        doubleMetaphone17.maxCodeLen = (short) 0;
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone17, "", "");
        java.lang.String str35 = doubleMetaphone17.doubleMetaphone("HIH");
        java.lang.String str38 = doubleMetaphone17.doubleMetaphone("hi!hi!hi!H hi!ahi!H hi!", true);
        int int39 = doubleMetaphone17.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult41 = doubleMetaphone17.new DoubleMetaphoneResult(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H" + "'", obj28, "H");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!Hhi!HHH", "");
        java.lang.String str18 = caverphone0.encode("hi!A111111111A111111111ahi!H hi!");
        java.lang.String str20 = caverphone0.caverphone("hi!4");
        java.lang.String str22 = caverphone0.caverphone("hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        doubleMetaphoneResult15.appendPrimary("hi!H A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!H" + "'", str26, "hi!H");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("1111111111");
        metaphone0.setMaxCodeLen((int) 'A');
        java.lang.String str16 = metaphone0.metaphone("hi!hi!H hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HHH" + "'", str16, "HHH");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        doubleMetaphoneResult15.append("");
        doubleMetaphoneResult15.appendPrimary("hi!HHHHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("AHIHHIA", (int) 'H', 0, strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H ", 32, 0, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIAAAHIHHI", 3, (int) ' ', strArray19);
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        org.apache.commons.codec.language.Metaphone metaphone10 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str12 = metaphone10.encode("hi!");
        int int13 = metaphone10.getMaxCodeLen();
        java.lang.String str15 = metaphone10.metaphone("hi!H");
        java.lang.String str17 = metaphone10.encode("hi!H ");
        int int18 = metaphone10.getMaxCodeLen();
        java.lang.String str20 = metaphone10.encode("");
        java.lang.String str22 = metaphone10.metaphone("hi!4");
        java.lang.String str24 = metaphone10.metaphone("HHhi!4aH");
        java.lang.Object obj25 = caverphone0.encode((java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "1111111111" + "'", obj25, "1111111111");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        doubleMetaphoneResult15.append('H');
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        java.lang.String str51 = metaphone0.metaphone("##a4");
        boolean boolean54 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "##ahi!");
        int int55 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) 'I');
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        doubleMetaphoneResult20.appendAlternate('i');
        doubleMetaphoneResult20.append(" \000", "hi!Ha");
        doubleMetaphoneResult20.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.encode("HI");
        java.lang.String str7 = metaphone0.encode("ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) "hi!hi!hi!H hi!ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        metaphone0.setMaxCodeLen((int) (short) -1);
        int int11 = metaphone0.getMaxCodeLen();
        java.lang.String str13 = metaphone0.metaphone("HIHIHHI");
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111111" + "'", str5, "1111111111");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("4 ahi!hi!aAA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHIHIAAA" + "'", str1, "AHIHIAAA");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("hi!");
        doubleMetaphoneResult15.append("hi!H hi!");
        doubleMetaphoneResult15.appendAlternate('4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "Hhi!ahi!H hi!a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        doubleMetaphoneResult15.appendAlternate("A");
        java.lang.String str31 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!Hhi!HHHA" + "'", str31, "hi!Hhi!HHHA");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.caverphone("H1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        char char18 = doubleMetaphone0.charAt("A111111111", (int) (byte) -1);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone(" A111111111");
        doubleMetaphone0.setMaxCodeLen(104);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult24.appendPrimary('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!HHaHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHAHIH" + "'", str1, "HIHHAHIH");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        int int26 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str28 = doubleMetaphone0.encode("hi!hi!#h");
        java.lang.String str30 = doubleMetaphone0.encode("HIHAHIHHI");
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char35 = doubleMetaphone0.charAt("Hhi!ahi!H hi!a", (int) '!');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H#", "HAHHIH", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHH" + "'", str30, "HHH");
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        int int11 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aH#", "HIIAAHIIHIAAHA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str6 = doubleMetaphone0.encode("");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("AA", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "H", "hi!hi!aAA11111111hi!4hi!H ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        java.lang.String str4 = metaphone0.metaphone("HIHH");
        int int7 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4hH", "aa1\000hi!H hi!aA");
        java.lang.String str9 = metaphone0.encode("hi!hi!aAA11111111");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "\000a", "Hhi!hi!4hi!H hi!");
        java.lang.String str14 = metaphone0.encode("hi!H ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        char char32 = doubleMetaphone15.charAt("H", (int) (byte) -1);
        boolean boolean36 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!", "a", false);
        java.lang.String str39 = doubleMetaphone15.doubleMetaphone("HIHIHHI", false);
        int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "aa", "HHIHHAHHHHHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = metaphone0.encode((java.lang.Object) int42);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HH" + "'", str9, "HH");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HH" + "'", str39, "HH");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        doubleMetaphone0.maxCodeLen = 72;
        int int29 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 72 + "'", int29 == 72);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        int int15 = metaphone0.getMaxCodeLen();
        boolean boolean18 = metaphone0.isMetaphoneEqual("hi!H#hi!H hi!a4 a", "aH");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str22 = metaphone0.metaphone("HIA");
        java.lang.String str24 = metaphone0.metaphone(" A1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult30.append("H\000HHa", "#H");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.metaphone(" A111111111");
        java.lang.String str14 = metaphone0.metaphone("hi!hi!H hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HHH" + "'", str14, "HHH");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("hi!H");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HII", "#hi!HH4");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("", "");
        boolean boolean20 = caverphone14.isCaverphoneEqual("", "A111111111");
        boolean boolean23 = caverphone14.isCaverphoneEqual("A", "A");
        java.lang.String str25 = caverphone14.encode("A");
        boolean boolean28 = caverphone14.isCaverphoneEqual("a", "4");
        java.lang.String str30 = caverphone14.caverphone(" \000");
        java.lang.String str32 = caverphone14.encode("");
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone14, "AA", "AHIHHIA");
        java.lang.Object obj36 = caverphone0.encode((java.lang.Object) "AA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A111111111" + "'", str25, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1111111111" + "'", str30, "1111111111");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1111111111" + "'", str32, "1111111111");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "AA11111111" + "'", obj36, "AA11111111");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendPrimary("\000 ");
        doubleMetaphoneResult15.appendAlternate("hi!hi!aAA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str13 = metaphone0.encode("hi!HH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "hi!4");
        java.lang.String str18 = metaphone0.encode("hi!H ");
        int int19 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.caverphone("4h4");
        boolean boolean14 = caverphone0.isCaverphoneEqual("HHa", "1111111111AA111111111\000");
        java.lang.String str16 = caverphone0.caverphone("#hi!HH4 \000ahi!H hi!A");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        java.lang.Object obj19 = doubleMetaphone8.encode((java.lang.Object) "hi!");
        char char22 = doubleMetaphone8.charAt("H", (int) (short) 0);
        char char25 = doubleMetaphone8.charAt("H", (int) (byte) -1);
        int int26 = doubleMetaphone8.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone27 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray35);
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray35);
        java.lang.Object obj38 = doubleMetaphone27.encode((java.lang.Object) "hi!");
        char char41 = doubleMetaphone27.charAt("H", (int) (short) 0);
        char char44 = doubleMetaphone27.charAt("hi!", (int) (byte) 100);
        boolean boolean48 = doubleMetaphone27.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.Object obj49 = doubleMetaphone8.encode((java.lang.Object) "H");
        int int50 = doubleMetaphone8.maxCodeLen;
        java.lang.String str52 = doubleMetaphone8.encode("HHHHHH");
        doubleMetaphone8.maxCodeLen = 4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = metaphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'H' + "'", char22 == 'H');
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "H" + "'", obj38, "H");
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + 'H' + "'", char41 == 'H');
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + '\000' + "'", char44 == '\000');
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        doubleMetaphoneResult15.appendPrimary("hi!H");
        doubleMetaphoneResult15.append('\000', 'H');
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000A111111111a", "ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        java.lang.String str16 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        metaphone0.setMaxCodeLen((int) 'h');
        int int20 = metaphone0.getMaxCodeLen();
        java.lang.String str22 = metaphone0.metaphone("hi!hi!aAA11111111hi!4hi!H ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HHHH" + "'", str22, "HHHH");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("hi!4a");
        java.lang.String str15 = metaphone0.metaphone("HIHIHIHHIAHIHHI");
        metaphone0.setMaxCodeLen((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HHHH" + "'", str15, "HHHH");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "#HIHI", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HH", "hi!H hi!\000");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "4");
        java.lang.String str25 = doubleMetaphone0.encode("\000 ");
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHHIH", "1111111111AA111111111\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str14 = metaphone0.metaphone("4hi!Ha");
        java.lang.String str16 = metaphone0.metaphone("hi!Hhi!HHHA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        int int24 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass25 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        doubleMetaphoneResult35.appendAlternate("hi!hi!hi!H hi!ahi!H hi!");
        java.lang.String str38 = doubleMetaphoneResult35.getAlternate();
        doubleMetaphoneResult35.appendPrimary('!');
        java.lang.Class<?> wildcardClass41 = doubleMetaphoneResult35.getClass();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!H hi!ahi!H hi!" + "'", str38, "hi!hi!hi!H hi!ahi!H hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("hi!H#a");
        doubleMetaphone0.maxCodeLen = 100;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        doubleMetaphoneResult15.append('H', '4');
        doubleMetaphoneResult15.appendPrimary("HHI");
        java.lang.String str35 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!H hi!\0004" + "'", str35, "hi!H hi!\0004");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        int int15 = doubleMetaphone0.maxCodeLen;
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi! i");
        int int19 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Hhi!hi!4hi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHIHIHHI" + "'", str1, "HHIHIHIHHI");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        doubleMetaphoneResult15.appendAlternate('h');
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (int) ' ', (int) (short) 1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("aHIHH", (int) (short) 1, 4, strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Hhi!HH", (int) (short) 1, (int) '#', strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        boolean boolean6 = metaphone0.isMetaphoneEqual("A111111111", "##a");
        boolean boolean9 = metaphone0.isMetaphoneEqual("hi!H hi!", "aa1");
        metaphone0.setMaxCodeLen((int) (short) -1);
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode(obj12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H hi!\0004", "4aa ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        char char26 = doubleMetaphone0.charAt("HHI", (int) (short) 0);
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("hi!Hhi!#i");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "A111111111", false);
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("hi!HHHHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        boolean boolean34 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "Hhi!HH", false);
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("Ah");
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "A" + "'", str36, "A");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.encode("##a");
        java.lang.String str10 = caverphone0.caverphone("H1");
        boolean boolean13 = caverphone0.isCaverphoneEqual("", "AH");
        java.lang.String str15 = caverphone0.caverphone("\000!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!a", "HH", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("aHHIH", "4h4");
        java.lang.String str23 = caverphone0.caverphone("hi!4a");
        boolean boolean26 = caverphone0.isCaverphoneEqual("", "HHA");
        java.lang.String str28 = caverphone0.encode("\000");
        java.lang.String str30 = caverphone0.caverphone("4h4");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1111111111" + "'", str28, "1111111111");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A111111111" + "'", str30, "A111111111");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("HIHAH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("4");
        java.lang.String str15 = caverphone0.encode("a");
        java.lang.String str17 = caverphone0.caverphone("HHa");
        java.lang.String str19 = caverphone0.encode("aa");
        java.lang.String str21 = caverphone0.caverphone("HIA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        doubleMetaphoneResult15.appendAlternate(" A111111111A4hHA111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!Hhi!HHH" + "'", str30, "hi!Hhi!HHH");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!H", "");
        boolean boolean11 = caverphone0.isCaverphoneEqual("H A111111111A111111111", "hi!H hi!\000");
        java.lang.String str13 = caverphone0.caverphone("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        boolean boolean14 = caverphone0.isCaverphoneEqual("a", "4");
        java.lang.String str16 = caverphone0.caverphone(" \000");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        boolean boolean6 = metaphone0.isMetaphoneEqual("A111111111", "##a");
        boolean boolean9 = metaphone0.isMetaphoneEqual("hi!H hi!", "aa1");
        org.apache.commons.codec.language.Caverphone caverphone10 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str12 = caverphone10.encode("HHIHI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = metaphone0.encode((java.lang.Object) caverphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        java.lang.String str17 = metaphone0.metaphone("");
        boolean boolean20 = metaphone0.isMetaphoneEqual("hi!HHHH", "#H##a");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        boolean boolean25 = metaphone0.isMetaphoneEqual("4hH", "hi!H#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!");
        java.lang.String str17 = metaphone0.encode("HIHIAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        char char18 = doubleMetaphone0.charAt("A111111111", (int) (byte) -1);
        int int19 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 4;
        int int24 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HH", " \000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        org.apache.commons.codec.language.Metaphone metaphone20 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str22 = metaphone20.encode("hi!");
        int int23 = metaphone20.getMaxCodeLen();
        java.lang.String str25 = metaphone20.metaphone("hi!H");
        java.lang.String str27 = metaphone20.encode("hi!H ");
        int int28 = metaphone20.getMaxCodeLen();
        java.lang.String str30 = metaphone20.encode("");
        java.lang.String str32 = metaphone20.metaphone("hi!4");
        int int33 = metaphone20.getMaxCodeLen();
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone20, "", " HI4AA11111111");
        java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) "");
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = doubleMetaphone0.encode(obj38);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        java.lang.String str17 = metaphone0.metaphone("");
        metaphone0.setMaxCodeLen((int) (short) 100);
        java.lang.String str21 = metaphone0.encode("H A111111111A111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        doubleMetaphoneResult15.append("", "hi!H hi!\000");
        doubleMetaphoneResult15.appendAlternate('\000');
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!" + "'", str28, "Hhi!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("H", "AHI");
        java.lang.String str15 = caverphone0.encode("AA11111111");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!", "4hi!H hi!\000");
        java.lang.String str20 = caverphone0.encode("aH\000");
        java.lang.String str22 = caverphone0.encode("HII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        char char18 = doubleMetaphone0.charAt("hi!H ", (int) (byte) 0);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!HIH");
        int int21 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("HAHHIH", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'h' + "'", char18 == 'h');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        boolean boolean9 = metaphone0.isMetaphoneEqual("HIA", "HHIHI");
        java.lang.String str11 = metaphone0.metaphone("hi!HHAH");
        java.lang.String str13 = metaphone0.metaphone("aH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        doubleMetaphoneResult15.appendAlternate('\000');
        doubleMetaphoneResult15.append('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        doubleMetaphoneResult15.appendPrimary("hi!H");
        doubleMetaphoneResult15.append('\000', 'H');
        doubleMetaphoneResult15.appendPrimary('\000');
        doubleMetaphoneResult15.appendAlternate('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        doubleMetaphoneResult15.appendPrimary("HIHIAAA");
        java.lang.String str33 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!HHHHa" + "'", str33, "hi!HHHHa");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        int int28 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
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
        doubleMetaphoneResult46.append(' ', ' ');
        doubleMetaphoneResult46.append("HI", "hi!");
        boolean boolean59 = doubleMetaphoneResult46.isComplete();
        doubleMetaphoneResult46.appendAlternate('4');
        doubleMetaphoneResult46.append('H');
        doubleMetaphoneResult46.appendAlternate('1');
        doubleMetaphoneResult46.appendPrimary("\000hi!H hi!");
        doubleMetaphoneResult46.appendAlternate("HHHIHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult46);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "H" + "'", obj42, "H");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!H" + "'", str52, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        java.lang.String str53 = doubleMetaphone0.encode("HIAA");
        java.lang.String str56 = doubleMetaphone0.doubleMetaphone("hi!hi!a", false);
        char char59 = doubleMetaphone0.charAt("HHIHHHIAAAHIHHIHHA", 104);
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "H" + "'", str53, "H");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "H" + "'", str56, "H");
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + '\000' + "'", char59 == '\000');
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIHAHIHIHA", "HIHIAAA");
        java.lang.String str13 = caverphone0.encode("hi!Hhi!#i");
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = caverphone0.encode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hH", (int) (short) 1, 9, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains(" A111111111", (int) (short) 1, (int) 'i', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa1", (int) 'i', (int) '\000', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHIHI", (int) (byte) -1, (int) '4', strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H#a", (int) (byte) -1, (int) 'A', strArray25);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!hi!a", 1, 5, strArray25);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("aa");
        int int8 = metaphone0.getMaxCodeLen();
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "hi!hi!aAA11111111");
        java.lang.String str13 = metaphone0.encode("HIHIHIHHAAHIH");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H a##a", "1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HHHH" + "'", str13, "HHHH");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        int int20 = doubleMetaphone0.maxCodeLen;
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HHIHIHIHHI", "HIIAAHIIHIAAHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        int int26 = doubleMetaphone0.getMaxCodeLen();
        int int27 = doubleMetaphone0.maxCodeLen;
        java.lang.String str30 = doubleMetaphone0.doubleMetaphone("4hi!HaHIhi!H A111111111hi!HH", true);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HH" + "'", str30, "HH");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        java.lang.String str29 = doubleMetaphone0.encode("4");
        java.lang.String str31 = doubleMetaphone0.encode("hi!A111111111");
        boolean boolean35 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!\000H", "", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        metaphone0.setMaxCodeLen(8);
        metaphone0.setMaxCodeLen(105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        java.lang.String str13 = caverphone0.caverphone("A111111111");
        java.lang.String str15 = caverphone0.caverphone("hi!4");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        java.lang.String str32 = doubleMetaphoneResult31.getPrimary();
        java.lang.Object obj33 = caverphone0.encode((java.lang.Object) str32);
        java.lang.Object obj35 = caverphone0.encode((java.lang.Object) "H A111111111A111111111");
        boolean boolean38 = caverphone0.isCaverphoneEqual("aH#", "hi!H a##a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "1111111111" + "'", obj33, "1111111111");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "AA11111111" + "'", obj35, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        java.lang.String str44 = doubleMetaphone0.doubleMetaphone("hahi!HHHH\000A111111111HII\000H", false);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "HH" + "'", str44, "HH");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, " \000##a", "hi!hi!#h");
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!1", "hi!HaHI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        int int15 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(97);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HHhi!HH4hH", "hi! ihA111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult25.appendPrimary('A');
        doubleMetaphoneResult25.append("a#", "hi!hi!hi!H hi!ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!H ah");
        java.lang.String str15 = caverphone0.encode("4aa ");
        java.lang.String str17 = caverphone0.caverphone("hi!Hhi!#a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        int int22 = doubleMetaphone0.maxCodeLen;
        int int23 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("Hhi!hi!4 h ", false);
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("#hi!Hhi!hi!4hi!4hi!Ha", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        char char33 = doubleMetaphone0.charAt("HH", 5);
        java.lang.String str35 = doubleMetaphone0.encode("HHa");
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
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!hi!#h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIH" + "'", str1, "HIHIH");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        java.lang.String str29 = doubleMetaphone0.encode("4h4");
        java.lang.String str32 = doubleMetaphone0.doubleMetaphone("hi!A111111111", true);
        boolean boolean36 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H\000#", "hi!hi!H hi!", true);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "H" + "'", str32, "H");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        doubleMetaphoneResult28.append('H');
        doubleMetaphoneResult28.append('H');
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        boolean boolean23 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate("hi!H ");
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("");
        doubleMetaphoneResult15.append('1');
        boolean boolean32 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("##a");
        metaphone0.setMaxCodeLen(2);
        boolean boolean15 = metaphone0.isMetaphoneEqual("A111111111", "##a");
        java.lang.String str17 = metaphone0.encode("4AH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        char char22 = doubleMetaphone0.charAt("HI", 4);
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIA", "hi!");
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("HHhi!HHh", "HIHHHHIH", false);
        java.lang.Class<?> wildcardClass30 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H hi!", "AA11111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray21);
        java.lang.Object obj24 = doubleMetaphone13.encode((java.lang.Object) "hi!");
        char char27 = doubleMetaphone13.charAt("H", (int) (short) 0);
        char char30 = doubleMetaphone13.charAt("H", (int) (byte) -1);
        boolean boolean34 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str36 = doubleMetaphone13.encode("");
        java.lang.String str39 = doubleMetaphone13.doubleMetaphone("hi!H", false);
        java.lang.String str41 = doubleMetaphone13.encode("hi!H");
        int int42 = doubleMetaphone13.maxCodeLen;
        int int45 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "hi!H ", "hi!4");
        boolean boolean48 = doubleMetaphone13.isDoubleMetaphoneEqual("H", "4");
        java.lang.Object obj49 = caverphone0.encode((java.lang.Object) "H");
        java.lang.String str51 = caverphone0.encode("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone52 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        boolean boolean61 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray60);
        boolean boolean62 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray60);
        java.lang.Object obj63 = doubleMetaphone52.encode((java.lang.Object) "hi!");
        doubleMetaphone52.maxCodeLen = (short) 0;
        doubleMetaphone52.maxCodeLen = 0;
        java.lang.String str69 = doubleMetaphone52.encode("");
        int int72 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone52, "H", "HIH");
        doubleMetaphone52.setMaxCodeLen(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = caverphone0.encode((java.lang.Object) doubleMetaphone52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H" + "'", obj24, "H");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "H" + "'", str39, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H" + "'", str41, "H");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "A111111111" + "'", obj49, "A111111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "A111111111" + "'", str51, "A111111111");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "H" + "'", obj63, "H");
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa", (int) (byte) 100, (int) 'h', strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("HII", 10, (int) ' ', strArray22);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000A111111111HII", 49, (int) 'h', strArray22);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi! i#", 9, (int) (byte) 0, strArray22);
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
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        int int15 = metaphone0.getMaxCodeLen();
        java.lang.String str17 = metaphone0.metaphone("hi!");
        boolean boolean20 = metaphone0.isMetaphoneEqual("hi!A111111111HHI", "Hhi!ahi!H hi!a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.encode("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
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
    }
}

