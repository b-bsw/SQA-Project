package org.apache.commons.codec.language;

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str14 = metaphone0.metaphone("H");
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean18 = metaphone15.isMetaphoneEqual("", "");
        java.lang.String str20 = metaphone15.metaphone("A111111111");
        metaphone15.setMaxCodeLen(10);
        int int23 = metaphone15.getMaxCodeLen();
        int int24 = metaphone15.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = metaphone0.encode((java.lang.Object) metaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        doubleMetaphoneResult32.appendAlternate('a');
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
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        boolean boolean14 = caverphone0.isCaverphoneEqual("Hhi!", "hi!H");
        boolean boolean17 = caverphone0.isCaverphoneEqual("HHa", "4");
        java.lang.String str19 = caverphone0.caverphone("hi!HHHHa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        boolean boolean21 = metaphone0.isMetaphoneEqual("HHHHHH", "");
        boolean boolean24 = metaphone0.isMetaphoneEqual("HIHH", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        doubleMetaphone0.setMaxCodeLen((int) 'H');
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("\000A111111111ahi!H ", "hi! i", true);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("HH");
        java.lang.String str12 = caverphone0.caverphone("4 a");
        java.lang.String str14 = caverphone0.encode("hi!H ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        char char32 = doubleMetaphone15.charAt("H", (int) (byte) -1);
        boolean boolean36 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str38 = doubleMetaphone15.encode("");
        java.lang.String str40 = doubleMetaphone15.doubleMetaphone("");
        java.lang.String str42 = doubleMetaphone15.encode("hi!H");
        int int45 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "hi!H hi!\000", " A111111111");
        boolean boolean49 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!HH", "hi!hi!#h", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = caverphone0.encode((java.lang.Object) boolean49);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "H" + "'", str42, "H");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("hi!H", "hi!HH");
        java.lang.String str19 = caverphone0.caverphone("aHIHH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        java.lang.String str10 = metaphone0.metaphone("hi!4");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str14 = metaphone0.metaphone("ahi!H hi!a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!HIH", "hi!HHHH");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        doubleMetaphoneResult15.append(' ', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        java.lang.Class<?> wildcardClass8 = metaphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.lang.String str25 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.append("a", "AA11111111");
        doubleMetaphoneResult20.append('\000', ' ');
        boolean boolean32 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.String str23 = doubleMetaphone0.encode("4");
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.encode("AA11111111");
        java.lang.String str15 = caverphone0.caverphone("hi!4");
        java.lang.String str17 = caverphone0.encode("aa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        doubleMetaphoneResult15.appendAlternate("hi! i");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) 'h', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHH", (int) (byte) 0, 52, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        java.lang.String str11 = caverphone0.encode("hi!HHHH");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!Ha#hi", "A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        int int28 = doubleMetaphone0.maxCodeLen;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        doubleMetaphoneResult28.appendPrimary("#h");
        doubleMetaphoneResult28.append("4h4", "4H");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("hi!H hi!");
        java.lang.String str7 = caverphone0.caverphone("HII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        java.lang.String str26 = doubleMetaphoneResult15.getAlternate();
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!H" + "'", str26, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        java.lang.String str15 = caverphone0.caverphone("hi! i");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!Ha1\000hi!H hi!", "hi!H\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4h4", "HHIHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("4 a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        char char28 = doubleMetaphone14.charAt("H", (int) (short) 0);
        char char31 = doubleMetaphone14.charAt("H", (int) (byte) -1);
        int int32 = doubleMetaphone14.getMaxCodeLen();
        doubleMetaphone14.setMaxCodeLen(4);
        doubleMetaphone14.setMaxCodeLen((int) 'h');
        java.lang.String str39 = doubleMetaphone14.doubleMetaphone("AH", true);
        java.lang.Class<?> wildcardClass40 = doubleMetaphone14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = caverphone0.encode((java.lang.Object) wildcardClass40);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'H' + "'", char28 == 'H');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A" + "'", str39, "A");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        java.lang.String str29 = metaphone0.metaphone("Hhi!HH");
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
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHH" + "'", str1, "HHHH");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HIH", "hi! i");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!Hhi!HHH", "");
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.encode("hi!");
        int int20 = metaphone17.getMaxCodeLen();
        java.lang.String str22 = metaphone17.metaphone("hi!H");
        java.lang.String str24 = metaphone17.encode("hi!H ");
        int int25 = metaphone17.getMaxCodeLen();
        boolean boolean28 = metaphone17.isMetaphoneEqual("A", "");
        metaphone17.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = caverphone0.encode((java.lang.Object) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "hi!HHHHa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("HIHHI", "", false);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        boolean boolean9 = metaphone0.isMetaphoneEqual("a", "HIH");
        boolean boolean12 = metaphone0.isMetaphoneEqual("hi!HIH", "hi!HHHH");
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.caverphone("AH");
        java.lang.String str18 = caverphone0.encode("hi!H ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "HH");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("HIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        doubleMetaphoneResult15.appendAlternate("hi!H hi!\00041");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (int) (byte) 1, (int) 'A', strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHHIH", (int) (byte) 10, (int) (byte) 10, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        boolean boolean11 = metaphone0.isMetaphoneEqual("\000hi!H hi!", "hi!hi!#h");
        java.lang.String str13 = metaphone0.encode("hi!H");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!H#a", "\000H");
        int int17 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!H hi!\00041");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHI" + "'", str1, "HIHHI");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("HHHHHH", true);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("hi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        java.lang.String str22 = doubleMetaphoneResult21.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", (int) (byte) 1, (int) '4', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("AA", (int) 'i', (int) 'h', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa", (int) (byte) -1, 0, strArray17);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H\000#", 3, (int) (byte) 1, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        doubleMetaphoneResult15.append("hi!H ");
        doubleMetaphoneResult15.append("Hhi!1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("aa");
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("HHI", "HIA", false);
        java.lang.String str28 = doubleMetaphone0.encode("aa");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        doubleMetaphoneResult15.appendAlternate("HIAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        doubleMetaphoneResult15.appendPrimary('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        doubleMetaphoneResult15.append('a', 'a');
        doubleMetaphoneResult15.appendPrimary('A');
        doubleMetaphoneResult15.appendAlternate("AHII");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (short) 1);
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.metaphone("#hi!H\000#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) 'a');
        int int16 = metaphone0.getMaxCodeLen();
        java.lang.String str18 = metaphone0.metaphone("##a");
        java.lang.String str20 = metaphone0.encode("hi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("#h", "##ahi!");
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
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHA", " A111111111A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.String str39 = doubleMetaphone0.encode("A111111111");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A" + "'", str39, "A");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!Ha1\000hi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHAHIHHI" + "'", str1, "HIHAHIHHI");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        int int36 = doubleMetaphone0.maxCodeLen;
        char char39 = doubleMetaphone0.charAt(" A111111111A111111111", 100);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        char char22 = doubleMetaphone0.charAt("HI", 4);
        doubleMetaphone0.setMaxCodeLen(3);
        int int25 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        char char26 = doubleMetaphone12.charAt("H", (int) (short) 0);
        char char29 = doubleMetaphone12.charAt("H", (int) (byte) -1);
        int int30 = doubleMetaphone12.getMaxCodeLen();
        doubleMetaphone12.setMaxCodeLen(4);
        doubleMetaphone12.setMaxCodeLen((int) 'h');
        java.lang.String str37 = doubleMetaphone12.doubleMetaphone("AH", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = caverphone0.encode((java.lang.Object) doubleMetaphone12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("", "");
        boolean boolean15 = caverphone9.isCaverphoneEqual("HIHHI", " A111111111");
        boolean boolean18 = caverphone9.isCaverphoneEqual("hi!H ", "H1");
        java.lang.Object obj19 = caverphone0.encode((java.lang.Object) "H1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "A111111111" + "'", obj19, "A111111111");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        char char21 = doubleMetaphone0.charAt("hi!HHHH", 8);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        char char25 = doubleMetaphone0.charAt("hi! i", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'h' + "'", char25 == 'h');
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        java.lang.String str10 = caverphone0.caverphone("");
        java.lang.String str12 = caverphone0.encode("hi! i");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "HIAA", true);
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("HHHIHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "4hH");
        boolean boolean19 = caverphone0.isCaverphoneEqual("hi!H4", "\000A111111111HII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("1111111111", " A111111111");
        java.lang.String str14 = metaphone0.encode("HIH");
        boolean boolean17 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
            doubleMetaphoneResult27.append("HHA");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        boolean boolean33 = metaphone0.isMetaphoneEqual("hi!4a", " HI4AA11111111");
        java.lang.String str35 = metaphone0.metaphone("4hi!Ha");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HH" + "'", str35, "HH");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        doubleMetaphoneResult15.append("#HIHIhi!HHhi!H\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (short) -1);
        boolean boolean16 = metaphone0.isMetaphoneEqual("", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str25 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary('a');
        doubleMetaphoneResult15.append("HIAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H" + "'", str25, "hi!H");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str14 = metaphone0.metaphone("H");
        java.lang.String str16 = metaphone0.encode("#hi!H\000#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("HI");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("HII", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult25.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) '1');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4", "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) 'h', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("##a", (int) (short) 10, 8, strArray19);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h4", (-1), 3, strArray19);
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.String str55 = doubleMetaphone0.doubleMetaphone("hi!H\000");
        java.lang.Class<?> wildcardClass56 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "H" + "'", str55, "H");
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!HH", "a");
        java.lang.String str12 = metaphone0.encode("4hi!Ha");
        java.lang.String str14 = metaphone0.encode("hi!H hi!");
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str17 = metaphone15.encode("hi!");
        int int18 = metaphone15.getMaxCodeLen();
        java.lang.String str20 = metaphone15.metaphone("hi!H");
        java.lang.String str22 = metaphone15.encode("hi!H ");
        int int23 = metaphone15.getMaxCodeLen();
        boolean boolean26 = metaphone15.isMetaphoneEqual("A", "");
        boolean boolean29 = metaphone15.isMetaphoneEqual("4hH", "hi!A111111111");
        int int30 = metaphone15.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) metaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HH" + "'", str14, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HH", "hi!4a");
        java.lang.String str15 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.caverphone("AA");
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode(obj16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        int int40 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HHa", "HIHIHIHHIAHIHHI");
        char char43 = doubleMetaphone0.charAt("hi!HHHH", (int) '#');
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\000' + "'", char43 == '\000');
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        java.lang.String str16 = metaphone0.encode("A111111111");
        java.lang.String str18 = metaphone0.metaphone("A");
        java.lang.String str20 = metaphone0.encode("a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "HI");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!hi!hi!H hi!ahi!H hi!", "AHHIH", true);
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIAA" + "'", str1, "HIAA");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        char char22 = doubleMetaphone0.charAt("HI", 4);
        doubleMetaphone0.setMaxCodeLen(9);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        doubleMetaphoneResult15.append("Hhi!", "hi!hi!aAA11111111");
        boolean boolean31 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!" + "'", str27, "Hhi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        metaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        doubleMetaphoneResult20.appendPrimary('1');
        doubleMetaphoneResult20.append(' ', '4');
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.lang.String str28 = doubleMetaphoneResult20.getAlternate();
        java.lang.String str29 = doubleMetaphoneResult20.getPrimary();
        java.lang.String str30 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4hi!H hi!\000" + "'", str28, "4hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#H" + "'", str29, "#H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#H" + "'", str30, "#H");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.lang.String str24 = doubleMetaphone0.encode("hi!Hhi!HHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (short) 1);
        int int9 = metaphone0.getMaxCodeLen();
        boolean boolean12 = metaphone0.isMetaphoneEqual("HIHIAAA", "#HAH#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
            doubleMetaphoneResult30.append("hi!H hi!\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 9");
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
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHIHIHHIAHIHHI", "AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        java.lang.String str12 = metaphone0.metaphone("1111111111");
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.encode("AHHIH");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        boolean boolean6 = caverphone0.isCaverphoneEqual(" HI4AA11111111", "hi!Ha1\000hi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean11 = doubleMetaphone7.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str13 = doubleMetaphone7.encode("");
        java.lang.String str16 = doubleMetaphone7.doubleMetaphone("AA", true);
        java.lang.Object obj17 = caverphone0.encode((java.lang.Object) str16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "A111111111" + "'", obj17, "A111111111");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H ", "hi!4");
        java.lang.String str26 = doubleMetaphone0.encode("#HAH#");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("hi!hi!aAA11111111", false);
        doubleMetaphone0.setMaxCodeLen(104);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIH", "4hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hahi!H hi!h", "\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult19.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        boolean boolean30 = doubleMetaphone0.isDoubleMetaphoneEqual("HIHH", " A111111111A111111111");
        int int31 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.encode("HH");
        java.lang.String str10 = caverphone0.caverphone("hi!hi!aAA11111111");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        doubleMetaphoneResult15.append('\000', '#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        char char21 = doubleMetaphone0.charAt("hi!HHHH", 8);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000H", "ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        doubleMetaphoneResult20.append("##a");
        java.lang.String str30 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#H##a" + "'", str30, "#H##a");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        doubleMetaphoneResult15.appendAlternate(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "hi!H ");
        java.lang.String str13 = caverphone0.encode("hi!H#a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray14);
        java.lang.Object obj17 = doubleMetaphone6.encode((java.lang.Object) "hi!");
        doubleMetaphone6.maxCodeLen = (short) 0;
        doubleMetaphone6.maxCodeLen = 0;
        java.lang.String str23 = doubleMetaphone6.encode("");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone6, "H", "HIH");
        int int27 = doubleMetaphone6.getMaxCodeLen();
        doubleMetaphone6.maxCodeLen = 104;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) doubleMetaphone6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("\000hi!H hi!", "Hhi!HH", false);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        java.lang.String str11 = metaphone0.metaphone("\000 ");
        boolean boolean14 = metaphone0.isMetaphoneEqual("", "H");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str20 = doubleMetaphoneResult19.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4 a", "1111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        doubleMetaphoneResult15.append("Hhi!hi!4");
        doubleMetaphoneResult15.appendAlternate("HIHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        doubleMetaphoneResult15.append('a', 'a');
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
        doubleMetaphoneResult15.appendPrimary("4hH");
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        java.lang.Class<?> wildcardClass31 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHhi!HH4hH" + "'", str30, "HHhi!HH4hH");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!HHAH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000", (int) (byte) 10, (int) '\000', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHIAAA", 2, (int) 'H', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("#h", (int) (byte) 100, (int) (byte) 100, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.lang.String str23 = doubleMetaphone0.encode("HIAA");
        int int26 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H A111111111", "HIAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        doubleMetaphoneResult15.append("HHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
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
        doubleMetaphoneResult25.append(' ', ' ');
        doubleMetaphoneResult25.append("HI", "hi!");
        doubleMetaphoneResult25.appendPrimary("4");
        java.lang.Object obj40 = caverphone0.encode((java.lang.Object) "4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H" + "'", str31, "hi!H");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "1111111111" + "'", obj40, "1111111111");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        int int1 = metaphone0.getMaxCodeLen();
        int int2 = metaphone0.getMaxCodeLen();
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HIAA", "hi!H hi!");
        java.lang.String str7 = metaphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI", "4 a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual(" HI4AA11111111", "hi!4a", true);
        char char24 = doubleMetaphone0.charAt("4h4", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '4' + "'", char24 == '4');
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) -1;
        char char21 = doubleMetaphone0.charAt("hi!H\000", 9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = doubleMetaphone0.doubleMetaphone("HHA", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        char char19 = doubleMetaphone0.charAt("A111111111", 100);
        char char22 = doubleMetaphone0.charAt("AA11111111", (int) (short) 0);
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'A' + "'", char22 == 'A');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("#HAH#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HAH" + "'", str1, "HAH");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("", "Hhi!");
        metaphone0.setMaxCodeLen((int) ' ');
        boolean boolean19 = metaphone0.isMetaphoneEqual("hi!hi!#h", "aa");
        java.lang.String str21 = metaphone0.encode("4hi!Ha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HH" + "'", str21, "HH");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.encode("HI");
        java.lang.String str12 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str14 = caverphone0.encode("4hH");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (int) (byte) 1, 0, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = caverphone0.encode((java.lang.Object) strArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HH", "hi!HIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("hi!H hi!\000");
        boolean boolean10 = metaphone0.isMetaphoneEqual("AHI", "");
        java.lang.String str12 = metaphone0.metaphone("hi!HHHHa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("hi!H");
        boolean boolean13 = caverphone0.isCaverphoneEqual(" ", "4H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        doubleMetaphone14.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone14.new DoubleMetaphoneResult(100);
        java.lang.String str32 = doubleMetaphone14.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone14.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str35 = doubleMetaphoneResult34.getAlternate();
        doubleMetaphoneResult34.append('#', '4');
        doubleMetaphoneResult34.append("H", "hi!H hi!\000");
        doubleMetaphoneResult34.append("AH", "hi!H hi!");
        doubleMetaphoneResult34.appendPrimary('#');
        boolean boolean47 = doubleMetaphoneResult34.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = caverphone0.encode((java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.encode("##a");
        java.lang.String str10 = caverphone0.encode("hi!HH");
        boolean boolean13 = caverphone0.isCaverphoneEqual("\000hi!H hi!", "##ahi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        java.lang.Object obj19 = doubleMetaphone8.encode((java.lang.Object) "hi!");
        doubleMetaphone8.maxCodeLen = (short) 0;
        int int22 = doubleMetaphone8.maxCodeLen;
        doubleMetaphone8.setMaxCodeLen((int) (short) 1);
        int int25 = doubleMetaphone8.getMaxCodeLen();
        int int26 = doubleMetaphone8.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = metaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("hi!H");
        boolean boolean13 = caverphone0.isCaverphoneEqual(" ", "4H");
        boolean boolean16 = caverphone0.isCaverphoneEqual("a", "hi!A111111111A111111111ahi!H hi!");
        java.lang.String str18 = caverphone0.caverphone("4H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A111111111" + "'", str18, "A111111111");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        int int36 = doubleMetaphone0.maxCodeLen;
        java.lang.String str38 = doubleMetaphone0.doubleMetaphone("HHhi!4aH");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.append('\000', '\000');
        doubleMetaphoneResult15.appendPrimary("4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        int int16 = metaphone0.getMaxCodeLen();
        boolean boolean19 = metaphone0.isMetaphoneEqual("aa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("ahi!H hi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHIHHIA" + "'", str1, "AHIHHIA");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!HHHH", "A");
        int int18 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!hi!hi!H hi!ahi!H hi!", "\000h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" h ", " \000##a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        doubleMetaphoneResult15.append('a', 'i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        metaphone0.setMaxCodeLen((int) (byte) 0);
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("#HAH#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHhi!4aH", "A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str17 = metaphone0.metaphone("HIHH");
        java.lang.String str19 = metaphone0.encode("HHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.String str24 = doubleMetaphone0.encode("HHA");
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
        doubleMetaphoneResult40.appendPrimary('\000');
        doubleMetaphoneResult40.append("");
        doubleMetaphoneResult40.appendAlternate("H");
        doubleMetaphoneResult40.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = doubleMetaphone0.encode((java.lang.Object) 'a');
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
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H" + "'", obj36, "H");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!H" + "'", str46, "hi!H");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("Hhi!");
        java.lang.String str7 = caverphone0.encode(" \000##a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.metaphone("ahi!H hi!");
        metaphone0.setMaxCodeLen((int) 'A');
        int int15 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AHH" + "'", str12, "AHH");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65 + "'", int15 == 65);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("", "Hhi!");
        boolean boolean17 = metaphone0.isMetaphoneEqual(" HI", "4 a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HH", "hi!H hi!\000");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "4");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H A111111111", "AHII", true);
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode(obj28);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        java.lang.String str9 = metaphone0.encode("hi!H#a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        char char28 = doubleMetaphone0.charAt("aHIHH", (int) 'A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 1, (int) (short) 1, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray32);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray32);
        java.lang.Object obj35 = doubleMetaphone24.encode((java.lang.Object) "hi!");
        doubleMetaphone24.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone24.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult39.append("", "hi!");
        doubleMetaphoneResult39.appendAlternate("A111111111");
        doubleMetaphoneResult39.appendPrimary('a');
        doubleMetaphoneResult39.appendAlternate("hi!4");
        doubleMetaphoneResult39.appendPrimary('#');
        doubleMetaphoneResult39.appendAlternate(" HI4AA11111111");
        java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) " HI4AA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        char char18 = doubleMetaphone0.charAt("AA11111111", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        char char23 = doubleMetaphone0.charAt("", (int) 'H');
        int int24 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H hi!\000", " A111111111");
        char char33 = doubleMetaphone0.charAt(" HI4AA11111111", 9);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '1' + "'", char33 == '1');
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.encode("hi!");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone17, "A111111111", "hi!H ");
        boolean boolean25 = metaphone17.isMetaphoneEqual("1111111111", "");
        int int26 = metaphone17.getMaxCodeLen();
        boolean boolean29 = metaphone17.isMetaphoneEqual("hi!HIH", "Hhi!");
        boolean boolean32 = metaphone17.isMetaphoneEqual("A", "hi!H4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = metaphone0.encode((java.lang.Object) metaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        doubleMetaphoneResult15.appendAlternate('i');
        doubleMetaphoneResult15.append('1');
        boolean boolean37 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("H1", "HAH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.encode("4hi!Ha");
        java.lang.String str17 = caverphone0.caverphone("hi!H4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        boolean boolean38 = doubleMetaphone0.isDoubleMetaphoneEqual("HHhi!HH", "AHI", true);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!HHHH");
        boolean boolean16 = caverphone0.isCaverphoneEqual("1111111111", "\000h");
        boolean boolean19 = caverphone0.isCaverphoneEqual("H", "hi!Hhi!HHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.metaphone("hi!HHHH");
        java.lang.Object obj9 = metaphone0.encode((java.lang.Object) "hi!Hhi!HHH");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!HIH", "aa");
        java.lang.String str14 = metaphone0.encode("aHIHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "H" + "'", obj9, "H");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AH" + "'", str14, "AH");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("hi!H");
        boolean boolean13 = caverphone0.isCaverphoneEqual("\000", "\000 ");
        java.lang.String str15 = caverphone0.encode("hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHHa", "HHH", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.String str35 = doubleMetaphone0.doubleMetaphone("HIAA");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("Hhi!");
        boolean boolean8 = caverphone0.isCaverphoneEqual("Hhi!", "A111111111");
        java.lang.String str10 = caverphone0.encode(" A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode(" HI4AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        doubleMetaphoneResult15.appendAlternate("hi!H hi!\000");
        doubleMetaphoneResult15.appendAlternate("AA");
        doubleMetaphoneResult15.append('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        doubleMetaphoneResult38.appendPrimary('4');
        boolean boolean41 = doubleMetaphoneResult38.isComplete();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!hi!H hi!", "hi!Ha#hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.String str25 = doubleMetaphoneResult15.getAlternate();
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H" + "'", str25, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHIAAA", "aHIHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        doubleMetaphoneResult15.append('i');
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.encode("hi!");
        int int16 = metaphone13.getMaxCodeLen();
        java.lang.String str18 = metaphone13.metaphone("hi!H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode((java.lang.Object) metaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        char char33 = doubleMetaphone0.charAt("HIHIHIHHIAHIHHI", 32);
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
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        int int36 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char22 = doubleMetaphone0.charAt("HIHHHH", 100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!H hi!\000");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String str18 = caverphone0.encode("hahi!H hi!h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        boolean boolean15 = metaphone0.isMetaphoneEqual("4h4", "HAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone(" A111111111", false);
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!HH", " ", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        doubleMetaphone0.maxCodeLen = 3;
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = doubleMetaphone0.doubleMetaphone("HHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHA", "Hhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        doubleMetaphoneResult15.append("AH", " \000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.append("", "hi!");
        doubleMetaphoneResult31.append('H');
        doubleMetaphoneResult31.appendPrimary("H");
        doubleMetaphoneResult31.appendAlternate('4');
        java.lang.String str41 = doubleMetaphoneResult31.getAlternate();
        java.lang.String str42 = doubleMetaphoneResult31.getPrimary();
        java.lang.Object obj43 = metaphone0.encode((java.lang.Object) str42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!H4" + "'", str41, "hi!H4");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "HH" + "'", str42, "HH");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "" + "'", obj43, "");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! " + "'", str24, "hi! ");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.append('\000', '\000');
        doubleMetaphoneResult15.append("ahi!H hi!", "HII");
        doubleMetaphoneResult15.appendAlternate('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.metaphone("hi!HH");
        int int16 = metaphone0.getMaxCodeLen();
        java.lang.String str18 = metaphone0.encode("HIHIAAA");
        boolean boolean21 = metaphone0.isMetaphoneEqual("4 a", "aa1");
        metaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HH" + "'", str18, "HH");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", (int) (byte) 1, (int) '4', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("AA", (int) 'i', (int) 'h', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa", (int) (byte) -1, 0, strArray17);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHHI", (int) ' ', (int) (byte) -1, strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        doubleMetaphoneResult15.appendAlternate('h');
        doubleMetaphoneResult15.appendAlternate('\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.encode("HI");
        java.lang.String str12 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str14 = caverphone0.encode("4hH");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "\000A111111111HII", "AHHIH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        doubleMetaphoneResult24.appendPrimary("Hhi!1");
        doubleMetaphoneResult24.appendPrimary('a');
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        int int30 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("aa", "");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        char char26 = doubleMetaphone0.charAt("#hi!H\000#", 32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        int int6 = metaphone0.getMaxCodeLen();
        int int7 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass8 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("H", "4h4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!Ha#hi", "AHIHHIA");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.metaphone("\000H");
        int int13 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("4", "hi!H hi!");
        doubleMetaphoneResult15.append("aa", "ahi!H hi!");
        doubleMetaphoneResult15.append(' ');
        java.lang.String str27 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4aa " + "'", str27, "4aa ");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult19.append("#HIHIhi!HHhi!H\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HH", "hi!");
        java.lang.String str17 = caverphone0.caverphone("hi!hi!a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H4" + "'", str25, "hi!H4");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HH", "HIH");
        java.lang.String str15 = metaphone0.encode("hi!4");
        boolean boolean18 = metaphone0.isMetaphoneEqual("ahi!H hi!a", "\000");
        java.lang.String str20 = metaphone0.metaphone("##a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        doubleMetaphoneResult15.appendPrimary("4hH");
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("hi! i");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHhi!HH4hH" + "'", str30, "HHhi!HH4hH");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int12 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean17 = doubleMetaphone13.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str19 = doubleMetaphone13.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = metaphone0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.String str34 = doubleMetaphone0.encode("ahi!H hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean39 = doubleMetaphone0.isDoubleMetaphoneEqual("\000H", "\000A111111111HII");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AH" + "'", str34, "AH");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("aa");
        java.lang.String str16 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = caverphone0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.encode("HI");
        java.lang.String str7 = metaphone0.encode("hi!4a");
        boolean boolean10 = metaphone0.isMetaphoneEqual("4h4", "HIH");
        org.apache.commons.codec.language.Metaphone metaphone11 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str13 = metaphone11.encode("hi!");
        int int14 = metaphone11.getMaxCodeLen();
        java.lang.String str16 = metaphone11.metaphone("hi!H");
        java.lang.String str18 = metaphone11.encode("hi!H ");
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone11, "A", "hi!H ");
        metaphone11.setMaxCodeLen(3);
        int int24 = metaphone11.getMaxCodeLen();
        int int25 = metaphone11.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) metaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AHIHHIA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHIHHIA" + "'", str1, "AHIHHIA");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        boolean boolean33 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!HH" + "'", str29, "Hhi!HH");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.append('\000', '\000');
        doubleMetaphoneResult15.append("ahi!H hi!", "HII");
        java.lang.String str24 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000ahi!H hi!" + "'", str24, "\000ahi!H hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        int int28 = doubleMetaphone0.maxCodeLen;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        doubleMetaphoneResult15.append('4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "ahi!H hi!a", "HIHIHIHHIAHIHHI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("", "HIA");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.append("\000H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        org.apache.commons.codec.language.Caverphone caverphone35 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone36 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean40 = doubleMetaphone36.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj41 = caverphone35.encode((java.lang.Object) "a");
        boolean boolean44 = caverphone35.isCaverphoneEqual("A", "hi!H ");
        boolean boolean47 = caverphone35.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str49 = caverphone35.encode("4");
        java.lang.String str51 = caverphone35.caverphone("AH");
        boolean boolean54 = caverphone35.isCaverphoneEqual("##ahi!", "hi!hi!aAA11111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone55 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!" };
        boolean boolean64 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray63);
        boolean boolean65 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray63);
        java.lang.Object obj66 = doubleMetaphone55.encode((java.lang.Object) "hi!");
        doubleMetaphone55.maxCodeLen = (short) 0;
        int int69 = doubleMetaphone55.maxCodeLen;
        doubleMetaphone55.setMaxCodeLen((int) (short) 1);
        int int72 = doubleMetaphone55.getMaxCodeLen();
        java.lang.String str75 = doubleMetaphone55.doubleMetaphone("hi!H hi!", false);
        doubleMetaphone55.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult79 = doubleMetaphone55.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str80 = doubleMetaphoneResult79.getAlternate();
        java.lang.Object obj81 = caverphone35.encode((java.lang.Object) str80);
        java.lang.Object obj82 = doubleMetaphone0.encode(obj81);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "A111111111" + "'", obj41, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1111111111" + "'", str49, "1111111111");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "A111111111" + "'", str51, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "H" + "'", obj66, "H");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "H" + "'", str75, "H");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + "1111111111" + "'", obj81, "1111111111");
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + "" + "'", obj82, "");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!A111111111A111111111ahi!H hi!", "HIHA", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!H hi!\000");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String str18 = caverphone0.caverphone("HHA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("HIH");
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "4hH");
        boolean boolean19 = caverphone0.isCaverphoneEqual("HIAA", "hi!H A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str11 = metaphone0.encode("4hi!Ha");
        java.lang.String str13 = metaphone0.metaphone("HHHIHH");
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!\00041");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIA", "hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String[] strArray4 = new java.lang.String[] { "HIHIHIHHIAHIHHI" };
        boolean boolean5 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHIHI", (int) 'A', 35, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HIHIHIHHIAHIHHI" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        doubleMetaphoneResult15.append("aa1", "4hH");
        java.lang.Class<?> wildcardClass32 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HH", "aHIHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        boolean boolean30 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        java.lang.String str12 = metaphone0.metaphone("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) -1;
        char char21 = doubleMetaphone0.charAt("hi!H\000", 9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", "aHHIH");
        metaphone0.setMaxCodeLen((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("4hi!HaHIhi!H A111111111hi!HH");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HHI", "hi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray32);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray32);
        java.lang.Object obj35 = doubleMetaphone24.encode((java.lang.Object) "hi!");
        doubleMetaphone24.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone24.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult39.append("", "hi!");
        doubleMetaphoneResult39.append('H');
        doubleMetaphoneResult39.append("hi!");
        doubleMetaphoneResult39.append("", "hi!H hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult39);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("AH");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!4a", "hi!H\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("aa");
        boolean boolean17 = caverphone0.isCaverphoneEqual("A", "HH");
        java.lang.String str19 = caverphone0.encode("");
        java.lang.String str21 = caverphone0.encode("H A111111111A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.append("", "hi!");
        doubleMetaphoneResult31.append('H');
        java.lang.String str37 = doubleMetaphoneResult31.getPrimary();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H" + "'", str37, "H");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.String str59 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = doubleMetaphone0.isDoubleMetaphoneEqual("aa1", "HHa", false);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        doubleMetaphoneResult15.appendPrimary("HII");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        doubleMetaphoneResult15.append('h', '1');
        doubleMetaphoneResult15.append('A');
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AHII", "4hH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("4hH", (int) (short) 1, 9, strArray25);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains(" A111111111", (int) (short) 1, (int) 'i', strArray25);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("aa1", (int) 'i', (int) '\000', strArray25);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha1\000hi!H hi!", (int) (byte) 1, 100, strArray25);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("AHHIH", 10, (int) (byte) 0, strArray25);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("aHIHH", (int) (short) -1, (int) 'H', strArray25);
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = doubleMetaphone0.doubleMetaphone("#HAH#");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        int int14 = metaphone0.getMaxCodeLen();
        java.lang.String str16 = metaphone0.encode("HHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        doubleMetaphoneResult15.appendPrimary("aHHIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!HHHH" + "'", str29, "hi!HHHH");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        doubleMetaphoneResult15.append('h', 'a');
        doubleMetaphoneResult15.append("hi!HHHHIH", "ahi!H hi!a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        doubleMetaphoneResult15.append(' ', 'H');
        doubleMetaphoneResult15.append('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("1111111111", "hi!HH");
        java.lang.String str16 = caverphone0.caverphone(" ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) '#');
        java.lang.String str13 = metaphone0.metaphone("4h4");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!H ", "HIHHHH");
        metaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        doubleMetaphoneResult15.append('H', 'a');
        doubleMetaphoneResult15.append(' ', 'a');
        doubleMetaphoneResult15.appendAlternate('H');
        boolean boolean32 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        doubleMetaphoneResult15.appendAlternate("HII");
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "HHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHa", "hi!Hhi!HHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        doubleMetaphoneResult15.append("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.caverphone("AH");
        boolean boolean19 = caverphone0.isCaverphoneEqual("##ahi!", "hi!hi!aAA11111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        int int34 = doubleMetaphone20.maxCodeLen;
        doubleMetaphone20.setMaxCodeLen((int) (short) 1);
        int int37 = doubleMetaphone20.getMaxCodeLen();
        java.lang.String str40 = doubleMetaphone20.doubleMetaphone("hi!H hi!", false);
        doubleMetaphone20.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult44 = doubleMetaphone20.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.String str45 = doubleMetaphoneResult44.getAlternate();
        java.lang.Object obj46 = caverphone0.encode((java.lang.Object) str45);
        java.lang.String str48 = caverphone0.caverphone("\000A111111111hi!H ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A111111111" + "'", str16, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "1111111111" + "'", obj46, "1111111111");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "AA11111111" + "'", str48, "AA11111111");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "HHA", "hi!A111111111A111111111ahi!H hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        doubleMetaphone0.maxCodeLen = (short) 0;
        java.lang.String str60 = doubleMetaphone0.encode("\000h");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone61 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!" };
        boolean boolean70 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray69);
        boolean boolean71 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray69);
        java.lang.Object obj72 = doubleMetaphone61.encode((java.lang.Object) "hi!");
        char char75 = doubleMetaphone61.charAt("H", (int) (short) 0);
        char char78 = doubleMetaphone61.charAt("H", (int) (byte) -1);
        boolean boolean82 = doubleMetaphone61.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str84 = doubleMetaphone61.encode("");
        java.lang.String str86 = doubleMetaphone61.doubleMetaphone("");
        java.lang.String str88 = doubleMetaphone61.encode("hi!H");
        int int91 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone61, "hi!H hi!\000", " A111111111");
        boolean boolean95 = doubleMetaphone61.isDoubleMetaphoneEqual("hi!HH", "hi!hi!#h", true);
        doubleMetaphone61.maxCodeLen = 35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj98 = doubleMetaphone0.encode((java.lang.Object) 35);
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
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "H" + "'", obj72, "H");
        org.junit.Assert.assertTrue("'" + char75 + "' != '" + 'H' + "'", char75 == 'H');
        org.junit.Assert.assertTrue("'" + char78 + "' != '" + '\000' + "'", char78 == '\000');
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "H" + "'", str88, "H");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aHIHH", "HHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone(" A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HIAA", "HIHIAAA");
        java.lang.String str14 = caverphone0.encode(" A111111111A111111111");
        java.lang.String str16 = caverphone0.encode("HIHIAAA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        doubleMetaphoneResult15.appendAlternate("AHHIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HH", "hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.append("", "hi!");
        doubleMetaphoneResult31.appendAlternate("A111111111");
        doubleMetaphoneResult31.appendAlternate("A111111111");
        doubleMetaphoneResult31.append('\000', 'a');
        doubleMetaphoneResult31.appendPrimary("##a");
        java.lang.Object obj44 = caverphone0.encode((java.lang.Object) "##a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "A111111111" + "'", obj44, "A111111111");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HIH", "A111111111");
        java.lang.String str12 = caverphone0.encode("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111" + "'", str12, "1111111111");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        doubleMetaphoneResult15.appendPrimary("#HAH#");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("HH");
        java.lang.String str12 = caverphone0.caverphone("4 a");
        java.lang.String str14 = caverphone0.encode("hi!H ah");
        boolean boolean17 = caverphone0.isCaverphoneEqual("4H", "##a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray26);
        java.lang.Object obj29 = doubleMetaphone18.encode((java.lang.Object) "hi!");
        doubleMetaphone18.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone18.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult33.append("", "hi!");
        doubleMetaphoneResult33.appendAlternate("H");
        java.lang.String str39 = doubleMetaphoneResult33.getAlternate();
        doubleMetaphoneResult33.appendPrimary('4');
        java.lang.String str42 = doubleMetaphoneResult33.getPrimary();
        doubleMetaphoneResult33.appendPrimary('i');
        doubleMetaphoneResult33.appendAlternate(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = caverphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H" + "'", obj29, "H");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!H" + "'", str39, "hi!H");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4" + "'", str42, "4");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        java.lang.String str11 = caverphone0.encode("hi!HHHH");
        java.lang.String str13 = caverphone0.caverphone("");
        java.lang.String str15 = caverphone0.caverphone("HHHHHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.Class<?> wildcardClass23 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str29 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!Hhi!HH" + "'", str28, "hi!Hhi!HH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4AH" + "'", str29, "4AH");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendAlternate('1');
        doubleMetaphoneResult15.appendPrimary("\000hi!H hi!");
        java.lang.Class<?> wildcardClass37 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!Hhi!#i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHII" + "'", str1, "HIHHII");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4", "A111111111");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.encode("hi!");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone13, "A111111111", "hi!H ");
        java.lang.String str20 = metaphone13.encode("hi!Ha");
        java.lang.String str22 = metaphone13.metaphone("##a");
        metaphone13.setMaxCodeLen((int) (byte) 10);
        metaphone13.setMaxCodeLen(100);
        metaphone13.setMaxCodeLen((int) 'a');
        boolean boolean31 = metaphone13.isMetaphoneEqual("hi!H", "hi!H hi!\000");
        java.lang.Object obj32 = caverphone0.encode((java.lang.Object) "hi!H hi!\000");
        java.lang.String str34 = caverphone0.caverphone("Hhi!hi!4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "AA11111111" + "'", obj32, "AA11111111");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AA11111111" + "'", str34, "AA11111111");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.String str9 = metaphone0.encode("##a");
        java.lang.String str11 = metaphone0.metaphone("hi!4a");
        boolean boolean14 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        int int30 = doubleMetaphone15.getMaxCodeLen();
        boolean boolean33 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!", "hi!");
        doubleMetaphone15.setMaxCodeLen((int) (byte) 10);
        java.lang.String str38 = doubleMetaphone15.doubleMetaphone("hi!hi!aAA11111111", false);
        java.lang.Object obj39 = metaphone0.encode((java.lang.Object) "hi!hi!aAA11111111");
        boolean boolean42 = metaphone0.isMetaphoneEqual("hahi!H hi!h", " \000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "HH" + "'", obj39, "HH");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("HHhi!HH", "hi!H hi!", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str11 = caverphone0.encode("A");
        boolean boolean14 = caverphone0.isCaverphoneEqual("HIAA", "");
        boolean boolean17 = caverphone0.isCaverphoneEqual("\000A111111111ahi!H ", "AHII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        char char18 = doubleMetaphone0.charAt("AA11111111", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        int int21 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.encode("hi!H hi!");
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("hi!H#a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("HI");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "4hi!Ha");
        java.lang.String str18 = caverphone0.caverphone("hi!H ah");
        java.lang.String str20 = caverphone0.encode(" \000");
        boolean boolean23 = caverphone0.isCaverphoneEqual("\000H", "hi!hi!a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str18 = doubleMetaphone0.encode("");
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("AHI", "4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        java.lang.Class<?> wildcardClass30 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!Ha" + "'", str29, "hi!Ha");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", (int) (byte) 1, (int) '4', strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("AA", (int) 'i', (int) 'h', strArray14);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha#hi", 4, (int) '4', strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.caverphone("");
        java.lang.String str13 = caverphone0.encode("hi!H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111" + "'", str11, "1111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        boolean boolean41 = doubleMetaphone0.isDoubleMetaphoneEqual("#hi!H\000#", "hi!hi!aAA11111111");
        doubleMetaphone0.setMaxCodeLen(97);
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.encode("hi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray21);
        java.lang.Object obj24 = doubleMetaphone13.encode((java.lang.Object) "hi!");
        char char27 = doubleMetaphone13.charAt("H", (int) (short) 0);
        char char30 = doubleMetaphone13.charAt("H", (int) (byte) -1);
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "HI", "A");
        int int36 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone13, "HIH", "4");
        doubleMetaphone13.maxCodeLen = 4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = metaphone0.encode((java.lang.Object) 4);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H" + "'", obj24, "H");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" \000##a", "4 a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", "aHHIH");
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone14.caverphone("H");
        java.lang.String str21 = caverphone14.encode("A111111111");
        java.lang.String str23 = caverphone14.caverphone("hi!HHHH");
        java.lang.String str25 = caverphone14.encode("A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) caverphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A111111111" + "'", str25, "A111111111");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        doubleMetaphoneResult15.append("4hH", "hi!4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult31.appendAlternate('#');
        doubleMetaphoneResult31.append("HIH", "hi!HH");
        doubleMetaphoneResult31.appendAlternate('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = metaphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        int int11 = metaphone0.getMaxCodeLen();
        int int12 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray21);
        java.lang.Object obj24 = doubleMetaphone13.encode((java.lang.Object) "hi!");
        char char27 = doubleMetaphone13.charAt("H", (int) (short) 0);
        java.lang.String str30 = doubleMetaphone13.doubleMetaphone("A", false);
        boolean boolean33 = doubleMetaphone13.isDoubleMetaphoneEqual("HHhi!HH", " h ");
        java.lang.Class<?> wildcardClass34 = doubleMetaphone13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = metaphone0.encode((java.lang.Object) doubleMetaphone13);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "H" + "'", obj24, "H");
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "A" + "'", str30, "A");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        doubleMetaphoneResult29.append('4', 'H');
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!4a" + "'", str27, "hi!4a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        boolean boolean14 = caverphone0.isCaverphoneEqual("Hhi!", "hi!H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        doubleMetaphone15.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone15.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult30.appendAlternate('#');
        doubleMetaphoneResult30.append("HIH", "hi!HH");
        doubleMetaphoneResult30.appendAlternate('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = caverphone0.encode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHHIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIHH" + "'", str1, "HHHIHH");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.appendAlternate('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        doubleMetaphoneResult15.append('a', 'a');
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendPrimary('a');
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) 'a');
        boolean boolean18 = metaphone0.isMetaphoneEqual("hi!H", "hi!H hi!\000");
        boolean boolean21 = metaphone0.isMetaphoneEqual("AA", "aHHIH");
        java.lang.Class<?> wildcardClass22 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4hi!HaHIhi!H A111111111hi!HH", "HHHIHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        int int23 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean27 = metaphone24.isMetaphoneEqual("", "");
        java.lang.String str29 = metaphone24.metaphone("A111111111");
        metaphone24.setMaxCodeLen(10);
        boolean boolean34 = metaphone24.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) " A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A" + "'", str29, "A");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "A" + "'", obj35, "A");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        doubleMetaphoneResult15.appendPrimary("4hH");
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.appendAlternate('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HHhi!HH4hH" + "'", str30, "HHhi!HH4hH");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!H hi!\000");
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!hi!hi!H hi!ahi!H hi!", "A");
        java.lang.String str19 = caverphone0.encode("HHHH");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "4AH", "hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        java.lang.String str38 = doubleMetaphone0.doubleMetaphone("##ahi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult40 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult40.append('i');
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHHHHH", "AH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.apache.commons.codec.language.Caverphone caverphone29 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean32 = caverphone29.isCaverphoneEqual("", "");
        java.lang.String str34 = caverphone29.caverphone("H");
        boolean boolean37 = caverphone29.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean40 = caverphone29.isCaverphoneEqual("A", "HI");
        java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) "A");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "A111111111" + "'", str34, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "A" + "'", obj41, "A");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        doubleMetaphoneResult15.appendAlternate('\000');
        boolean boolean27 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        java.lang.String str12 = metaphone0.metaphone("1111111111");
        metaphone0.setMaxCodeLen((int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        java.lang.String str13 = doubleMetaphone0.encode("hi!4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        doubleMetaphoneResult34.appendPrimary('#');
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
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        doubleMetaphoneResult15.append('a', '1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000" + "'", str30, "\000\000");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (short) -1);
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.encode("hi!");
        int int17 = metaphone14.getMaxCodeLen();
        java.lang.String str19 = metaphone14.metaphone("hi!H");
        java.lang.String str21 = metaphone14.encode("hi!H ");
        int int22 = metaphone14.getMaxCodeLen();
        int int23 = metaphone14.getMaxCodeLen();
        java.lang.String str25 = metaphone14.encode("hi!HHHH");
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone14, " A111111111", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = metaphone0.encode((java.lang.Object) metaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        doubleMetaphoneResult15.append("#h");
        doubleMetaphoneResult15.appendAlternate("4AH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        doubleMetaphoneResult15.appendAlternate("hi!Hhi!hi!4hi!4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!HH" + "'", str29, "Hhi!HH");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        doubleMetaphoneResult15.append("AHI", " HI");
        doubleMetaphoneResult15.append('4', 'h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!hi!aAA11111111hi!4hi!H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIAAAHIHIH" + "'", str1, "HIHIAAAHIHIH");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        char char34 = doubleMetaphone20.charAt("H", (int) (short) 0);
        char char37 = doubleMetaphone20.charAt("H", (int) (byte) -1);
        int int40 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone20, "HI", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone20.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult42.appendAlternate("AA");
        java.lang.String str45 = doubleMetaphoneResult42.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult42);
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
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + 'H' + "'", char34 == 'H');
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + '\000' + "'", char37 == '\000');
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("", "");
        boolean boolean15 = caverphone9.isCaverphoneEqual("", "A111111111");
        boolean boolean18 = caverphone9.isCaverphoneEqual("A", "A");
        java.lang.String str20 = caverphone9.encode("A");
        java.lang.String str22 = caverphone9.encode("hi!Ha");
        java.lang.Object obj23 = metaphone0.encode((java.lang.Object) "hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray32);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray32);
        java.lang.Object obj35 = doubleMetaphone24.encode((java.lang.Object) "hi!");
        char char38 = doubleMetaphone24.charAt("H", (int) (short) 0);
        char char41 = doubleMetaphone24.charAt("H", (int) (byte) -1);
        boolean boolean45 = doubleMetaphone24.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str47 = doubleMetaphone24.encode("");
        java.lang.String str50 = doubleMetaphone24.doubleMetaphone("hi!H", false);
        java.lang.String str52 = doubleMetaphone24.encode("hi!H");
        int int53 = doubleMetaphone24.maxCodeLen;
        int int56 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!H ", "hi!4");
        boolean boolean60 = doubleMetaphone24.isDoubleMetaphoneEqual("aa", "\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult62 = doubleMetaphone24.new DoubleMetaphoneResult(0);
        java.lang.String str64 = doubleMetaphone24.encode("hi!H4");
        int int65 = doubleMetaphone24.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj66 = metaphone0.encode((java.lang.Object) int65);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "HH" + "'", obj23, "HH");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + 'H' + "'", char38 == 'H');
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "H" + "'", str50, "H");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "H" + "'", str52, "H");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "H" + "'", str64, "H");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("##a", "##ahi!");
        java.lang.String str14 = caverphone0.caverphone("HHA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "HH", false);
        int int19 = doubleMetaphone0.maxCodeLen;
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!4");
        int int22 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        doubleMetaphoneResult21.appendPrimary("hi!hi!#h");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        java.lang.String str28 = doubleMetaphoneResult27.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        doubleMetaphoneResult15.append(' ', 'H');
        java.lang.String str34 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.appendPrimary(' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!H hi!\000H" + "'", str34, "hi!H hi!\000H");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        boolean boolean8 = metaphone0.isMetaphoneEqual("", "hi!H ");
        metaphone0.setMaxCodeLen(97);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "hi!hi!aAA11111111", false);
        char char18 = doubleMetaphone11.charAt("aHHIH", 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = metaphone0.encode((java.lang.Object) char18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("Hhi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4", "A111111111");
        java.lang.String str14 = caverphone0.caverphone("hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        doubleMetaphone15.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone15.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult30.append("", "hi!");
        doubleMetaphoneResult30.appendAlternate("H");
        java.lang.String str36 = doubleMetaphoneResult30.getAlternate();
        doubleMetaphoneResult30.appendPrimary('a');
        java.lang.String str39 = doubleMetaphoneResult30.getPrimary();
        doubleMetaphoneResult30.append('a', 'a');
        boolean boolean43 = doubleMetaphoneResult30.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!H" + "'", str36, "hi!H");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "a" + "'", str39, "a");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str13 = metaphone0.metaphone("hi!Ha#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.encode("hi!H A111111111");
        java.lang.String str17 = metaphone0.encode("");
        metaphone0.setMaxCodeLen((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        char char19 = doubleMetaphone0.charAt("hi!4a", (int) 'H');
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("hi!A111111111", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.lang.String str20 = metaphone0.encode("hi! ");
        metaphone0.setMaxCodeLen(65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("");
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone(" A111111111", false);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("\000\000", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("HI", 0, (int) (byte) 1, strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HH", (int) (short) 1, (int) '4', strArray16);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("AHHIH", (int) (byte) 1, 35, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        doubleMetaphoneResult15.append('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str18 = doubleMetaphone0.encode(" HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        boolean boolean14 = caverphone0.isCaverphoneEqual("hi!H ", "hi!H ");
        boolean boolean17 = caverphone0.isCaverphoneEqual(" HI4AA11111111", "AH");
        java.lang.String str19 = caverphone0.caverphone("hi!HHHH");
        boolean boolean22 = caverphone0.isCaverphoneEqual("HHHH", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!HHHHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHHHIH" + "'", str1, "HIHHHHIH");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        doubleMetaphoneResult15.appendPrimary('1');
        boolean boolean32 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("HIHIAAAHIHIH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHH" + "'", str23, "HHHH");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!H ah");
        java.lang.String str15 = caverphone0.encode("HIAA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        int int23 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str25 = doubleMetaphone0.encode("hi!4a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("hi!H hi!\000");
        java.lang.String str16 = caverphone0.caverphone("");
        java.lang.String str18 = caverphone0.caverphone("4");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!hi!hi!H hi!ahi!H hi!", " HI4AA11111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111" + "'", str16, "1111111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111" + "'", str18, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        doubleMetaphoneResult15.appendAlternate("HHhi!HH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!H hi!" + "'", str28, "hi!H hi!");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        java.lang.String str9 = metaphone0.metaphone("");
        java.lang.String str11 = metaphone0.metaphone("HHIHI");
        java.lang.String str13 = metaphone0.encode("AA11111111");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi! ", " HI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        boolean boolean19 = caverphone0.isCaverphoneEqual("HI", "hi!H ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone20.new DoubleMetaphoneResult(100);
        int int36 = doubleMetaphone20.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = caverphone0.encode((java.lang.Object) doubleMetaphone20);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000A111111111ahi!H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIH" + "'", str1, "AAHIH");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        doubleMetaphoneResult15.appendAlternate("4hi!Ha");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIHA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHA" + "'", str1, "HIHA");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.metaphone("hi!HH");
        java.lang.String str17 = metaphone0.encode("HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI" + "'", str1, "HHI");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.metaphone("hi!HHHH");
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!H hi!\000H", "hi!A111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("##ahi!", "4hi!Ha");
        java.lang.String str13 = caverphone0.encode("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        doubleMetaphoneResult15.append("HIHIAAA");
        doubleMetaphoneResult15.append('a', '#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        java.lang.String str10 = caverphone0.caverphone("");
        boolean boolean13 = caverphone0.isCaverphoneEqual("hi!H hi!\000", "hi!4a");
        java.lang.String str15 = caverphone0.caverphone("hi!H\000#");
        boolean boolean18 = caverphone0.isCaverphoneEqual("hi!HHHH", "Hhi!HHhi!A111111111A111111111ahi!H hi!HHa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIAAAHIHHI" + "'", str1, "HIAAAHIHHI");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        doubleMetaphoneResult15.appendAlternate("hi!H hi!\000");
        doubleMetaphoneResult15.append('1', ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.caverphone("4 a");
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "", "4hH");
        java.lang.String str18 = caverphone0.encode("AHHIH");
        java.lang.String str20 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111" + "'", str20, "1111111111");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        doubleMetaphone0.maxCodeLen = '#';
        int int42 = doubleMetaphone0.maxCodeLen;
        int int45 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HHhi!4aH", "hi!Ha1\000hi!H hi!");
        java.lang.Class<?> wildcardClass46 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        int int16 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("hi!hi!aAA11111111", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HIHH", " \000", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        boolean boolean22 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        java.lang.String str10 = caverphone0.caverphone("hi!H");
        boolean boolean13 = caverphone0.isCaverphoneEqual("\000", "\000 ");
        java.lang.String str15 = caverphone0.encode("hi!Hhi!HHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("aH", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        char char18 = doubleMetaphone0.charAt("A111111111", (int) '#');
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("#HAH#", "hi!HHHHa", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray31);
        java.lang.Object obj34 = doubleMetaphone23.encode((java.lang.Object) "hi!");
        doubleMetaphone23.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone23.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult38.append("", "hi!");
        doubleMetaphoneResult38.appendAlternate("H");
        java.lang.String str44 = doubleMetaphoneResult38.getAlternate();
        doubleMetaphoneResult38.appendPrimary('a');
        doubleMetaphoneResult38.append('H', 'a');
        doubleMetaphoneResult38.append(' ', 'a');
        doubleMetaphoneResult38.appendAlternate('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = doubleMetaphone0.encode((java.lang.Object) 'H');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H" + "'", obj34, "H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!H" + "'", str44, "hi!H");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", 8, 3, strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) 'A', (int) '4', strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        doubleMetaphoneResult20.appendPrimary("HHHHHH");
        doubleMetaphoneResult20.appendPrimary("4hH");
        boolean boolean32 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("4hi!HaHIhi!H A111111111hi!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHAHIHIHAHIHH" + "'", str1, "HIHAHIHIHAHIHH");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Object obj19 = metaphone0.encode((java.lang.Object) " HI4AA11111111");
        java.lang.String str21 = metaphone0.encode("AHI");
        org.apache.commons.codec.language.Metaphone metaphone22 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str24 = metaphone22.encode("hi!");
        boolean boolean27 = metaphone22.isMetaphoneEqual("", "A111111111");
        metaphone22.setMaxCodeLen((int) (byte) -1);
        metaphone22.setMaxCodeLen((int) (short) 0);
        java.lang.String str33 = metaphone22.encode("4hi!Ha");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = metaphone0.encode((java.lang.Object) metaphone22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHa", "AAHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        boolean boolean15 = metaphone0.isMetaphoneEqual("ahi!H hi!a", "hi!H ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        char char30 = doubleMetaphone16.charAt("H", (int) (short) 0);
        char char33 = doubleMetaphone16.charAt("H", (int) (byte) -1);
        boolean boolean37 = doubleMetaphone16.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str40 = doubleMetaphone16.doubleMetaphone("HHa", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = metaphone0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'H' + "'", char30 == 'H');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIAAAHIHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIAAAHIHHI" + "'", str1, "HIAAAHIHHI");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) 'i');
        java.lang.String str14 = metaphone0.metaphone("H");
        java.lang.String str16 = metaphone0.metaphone("AA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.String str25 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#hi!HH4" + "'", str25, "#hi!HH4");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        doubleMetaphone0.maxCodeLen = 'h';
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
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        java.lang.String str11 = caverphone0.encode("HHa");
        java.lang.String str13 = caverphone0.caverphone("HIHA");
        java.lang.String str15 = caverphone0.encode("\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111" + "'", str15, "1111111111");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("4aa ", "4hH", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("HHHH", true);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        char char42 = doubleMetaphone0.charAt(" A111111111A111111111", (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '1' + "'", char42 == '1');
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str13 = metaphone0.encode("hi!HH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "hi!4");
        java.lang.String str18 = metaphone0.encode("HIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        char char57 = doubleMetaphone0.charAt("hi!H hi!\000H", (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000 ", " \000##a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        int int22 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("#h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("AA11111111", "hi!HHAH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H4" + "'", str25, "hi!H4");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H4" + "'", str27, "hi!H4");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        boolean boolean46 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H ", "#HAH#", false);
        char char49 = doubleMetaphone0.charAt("hi! i", (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\000' + "'", char49 == '\000');
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.encode("hi!H hi!");
        int int13 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen(0);
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HH" + "'", str12, "HH");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        int int52 = doubleMetaphone0.maxCodeLen;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        boolean boolean12 = caverphone0.isCaverphoneEqual("##a", "##ahi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("hi!H#a", "H1");
        java.lang.String str17 = caverphone0.caverphone("4hi!Ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('4', '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!Hhi!HH" + "'", str28, "hi!Hhi!HH");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str13 = metaphone0.metaphone("hi!hi!H hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        doubleMetaphoneResult15.append("4 a");
        java.lang.String str33 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!H#hi!H hi!a4 a" + "'", str33, "hi!H#hi!H hi!a4 a");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("HI");
        boolean boolean16 = caverphone0.isCaverphoneEqual("", "4hi!Ha");
        java.lang.String str18 = caverphone0.caverphone("hi!H ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray27);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray27);
        java.lang.Object obj30 = doubleMetaphone19.encode((java.lang.Object) "hi!");
        doubleMetaphone19.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone19.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult34.append("", "hi!");
        doubleMetaphoneResult34.appendAlternate("H");
        java.lang.String str40 = doubleMetaphoneResult34.getAlternate();
        doubleMetaphoneResult34.appendPrimary('a');
        java.lang.String str43 = doubleMetaphoneResult34.getPrimary();
        doubleMetaphoneResult34.append('a', 'a');
        boolean boolean47 = doubleMetaphoneResult34.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H" + "'", obj30, "H");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!H" + "'", str40, "hi!H");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "a" + "'", str43, "a");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        int int22 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.encode("AA11111111");
        java.lang.String str15 = caverphone0.caverphone("HHHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        java.lang.String str14 = metaphone0.encode("hi!H\000");
        metaphone0.setMaxCodeLen((int) 'A');
        java.lang.String str18 = metaphone0.metaphone("hi!hi!hi!H hi!ahi!H hi!");
        boolean boolean21 = metaphone0.isMetaphoneEqual("", "HIHHII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HHHHHH" + "'", str18, "HHHHHH");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", " A111111111");
        boolean boolean13 = metaphone0.isMetaphoneEqual("hi!HIH", "hi!HHHH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("aa", "hi!hi!hi!H hi!ahi!H hi!");
        int int17 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("aa1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult21.appendPrimary('#');
        doubleMetaphoneResult21.appendPrimary('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("##ahi!", "hi! i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        doubleMetaphoneResult15.appendAlternate('i');
        doubleMetaphoneResult15.appendPrimary("HIHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        boolean boolean16 = caverphone0.isCaverphoneEqual("4 a", "HHhi!HH4hH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str20 = metaphone0.encode("hi! ");
        metaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        doubleMetaphone12.maxCodeLen = (short) 0;
        doubleMetaphone12.maxCodeLen = 0;
        boolean boolean31 = doubleMetaphone12.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean35 = doubleMetaphone12.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone12.new DoubleMetaphoneResult(10);
        doubleMetaphoneResult37.appendPrimary('A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult37);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        int int8 = metaphone0.getMaxCodeLen();
        boolean boolean11 = metaphone0.isMetaphoneEqual("ahi!H hi!a", " \000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        doubleMetaphoneResult15.append(" \000##a", "hi!H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Hhi!HH" + "'", str29, "Hhi!HH");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("AH");
        int int18 = doubleMetaphone0.maxCodeLen;
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHIHI", "HIHIHIHHIAHIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!Hhi!HH", "HIHA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        doubleMetaphoneResult15.append(' ', 'H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        java.lang.String str14 = metaphone0.encode("hi!H\000");
        java.lang.String str16 = metaphone0.encode("hi!Hhi!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        java.lang.String str19 = doubleMetaphone0.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult(3);
        doubleMetaphoneResult21.append("HH", "hi!4");
        doubleMetaphoneResult21.appendAlternate('1');
        doubleMetaphoneResult21.appendAlternate('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen(1);
        java.lang.String str14 = metaphone0.encode("hi!H hi!\000");
        boolean boolean17 = metaphone0.isMetaphoneEqual("A111111111", "hi!HHHH");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H#hi!H hi!a4 a", "hi!H\000hi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!hi!aAA11111111", false);
        char char7 = doubleMetaphone0.charAt("aHHIH", 97);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        boolean boolean29 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!", "hi!H ", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        char char34 = doubleMetaphone0.charAt("#H##a", (-1));
        boolean boolean37 = doubleMetaphone0.isDoubleMetaphoneEqual("HIAAAHIHHI", " h ");
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "HH", "HIH");
        java.lang.String str15 = metaphone0.encode("hi!4");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H ", "hi!4");
        char char27 = doubleMetaphone0.charAt("HHA", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'H' + "'", char27 == 'H');
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HAH", "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIHHHHIH", "hi!H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        java.lang.String str9 = metaphone0.encode("aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIH", "ahi!H hi!a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        java.lang.String str12 = caverphone0.caverphone("AAHIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str17 = metaphone0.metaphone("HIHH");
        boolean boolean20 = metaphone0.isMetaphoneEqual("HHhi!4aH", "hi!Ha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.String str31 = doubleMetaphoneResult30.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult30.appendAlternate("aHIHH");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("HHa");
        boolean boolean21 = caverphone0.isCaverphoneEqual("AA11111111", "HHa");
        boolean boolean24 = caverphone0.isCaverphoneEqual("AA", "hi! ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        boolean boolean15 = caverphone0.isCaverphoneEqual("HH", "hi!");
        java.lang.String str17 = caverphone0.encode("Hhi!");
        java.lang.String str19 = caverphone0.caverphone("HIHIAAA");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone20.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult35.append("", "hi!");
        doubleMetaphoneResult35.append("hi!");
        doubleMetaphoneResult35.appendPrimary('4');
        boolean boolean43 = doubleMetaphoneResult35.isComplete();
        java.lang.String str44 = doubleMetaphoneResult35.getPrimary();
        doubleMetaphoneResult35.appendAlternate("hi!HH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult35);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!4" + "'", str44, "hi!4");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('H');
        doubleMetaphoneResult15.append("hi!HHHHIH", "HHHH");
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HHHHH" + "'", str21, "HHHHH");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        boolean boolean34 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.append("4hi!H hi!\000", "hi!H\000#");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        doubleMetaphoneResult15.append("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HI", "hi!HHHH");
        java.lang.String str13 = caverphone0.caverphone("hi!HHAH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        doubleMetaphoneResult15.appendAlternate('1');
        doubleMetaphoneResult15.appendPrimary("HHhi!HH4hH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        doubleMetaphoneResult20.appendAlternate("H");
        boolean boolean32 = doubleMetaphoneResult20.isComplete();
        doubleMetaphoneResult20.append('4');
        java.lang.String str35 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "##a4" + "'", str35, "##a4");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        boolean boolean14 = caverphone0.isCaverphoneEqual("4h4", "HIHH");
        org.apache.commons.codec.language.Caverphone caverphone15 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean18 = caverphone15.isCaverphoneEqual("", "");
        java.lang.String str20 = caverphone15.caverphone("H");
        java.lang.String str22 = caverphone15.caverphone("AA11111111");
        java.lang.String str24 = caverphone15.caverphone("ahi!H hi!");
        boolean boolean27 = caverphone15.isCaverphoneEqual("##a", "##ahi!");
        java.lang.String str29 = caverphone15.caverphone("H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = caverphone0.encode((java.lang.Object) caverphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "A111111111" + "'", str29, "A111111111");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("1111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        doubleMetaphoneResult15.appendAlternate("hi!H#a");
        boolean boolean35 = doubleMetaphoneResult15.isComplete();
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        doubleMetaphoneResult20.append('a', '\000');
        doubleMetaphoneResult20.append("hi!H ah", "hi!H#hi!H hi!a4 a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        boolean boolean32 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        metaphone0.setMaxCodeLen((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        doubleMetaphoneResult20.appendPrimary('1');
        java.lang.String str36 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "##a" + "'", str30, "##a");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4 ahi!hi!aAA11111111" + "'", str36, "4 ahi!hi!aAA11111111");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("HHa");
        java.lang.String str20 = caverphone0.encode("A");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AA11111111" + "'", str18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A111111111" + "'", str20, "A111111111");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        int int24 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (byte) 0;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("aHHIH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        char char24 = doubleMetaphone10.charAt("H", (int) (short) 0);
        char char27 = doubleMetaphone10.charAt("hi!", (int) (byte) 100);
        boolean boolean31 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "H", false);
        java.lang.String str33 = doubleMetaphone10.encode("4");
        java.lang.String str35 = doubleMetaphone10.doubleMetaphone("\000 ");
        java.lang.String str37 = doubleMetaphone10.encode("4hH");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone10.new DoubleMetaphoneResult((int) (byte) -1);
        int int40 = doubleMetaphone10.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = metaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        int int1 = metaphone0.getMaxCodeLen();
        boolean boolean4 = metaphone0.isMetaphoneEqual("Hhi!", "hi!H hi!\000");
        int int5 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray14);
        java.lang.Object obj17 = doubleMetaphone6.encode((java.lang.Object) "hi!");
        doubleMetaphone6.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone6.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult21.append("", "hi!");
        doubleMetaphoneResult21.append("hi!");
        doubleMetaphoneResult21.appendPrimary('4');
        boolean boolean29 = doubleMetaphoneResult21.isComplete();
        doubleMetaphoneResult21.append("HIH", "hi!H hi!");
        doubleMetaphoneResult21.append("hi! i", "ahi!H hi!");
        java.lang.Object obj36 = metaphone0.encode((java.lang.Object) "ahi!H hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "AHH" + "'", obj36, "AHH");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult19.append("HIHHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        boolean boolean8 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray7);
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains(" HI4AA11111111", (int) (short) 0, 97, strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aHIHH", "hi!HIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        metaphone0.setMaxCodeLen((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIHHII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHII" + "'", str1, "HIHHII");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        doubleMetaphoneResult15.appendAlternate("AH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHH", "hi!HHHHa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str34 = doubleMetaphone0.encode("ahi!H hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen(2);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AH" + "'", str34, "AH");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("1111111111", " A111111111");
        java.lang.String str14 = metaphone0.encode("HIH");
        int int15 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        char char30 = doubleMetaphone16.charAt("H", (int) (short) 0);
        char char33 = doubleMetaphone16.charAt("H", (int) (byte) -1);
        int int34 = doubleMetaphone16.getMaxCodeLen();
        java.lang.String str36 = doubleMetaphone16.doubleMetaphone("");
        char char39 = doubleMetaphone16.charAt("\000 ", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = metaphone0.encode((java.lang.Object) char39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + 'H' + "'", char30 == 'H');
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        boolean boolean17 = metaphone0.isMetaphoneEqual("aa", "HI");
        java.lang.String str19 = metaphone0.metaphone("\000");
        int int20 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000" + "'", str19, "\000");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" ", "HIHIAAAHIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHH" + "'", str1, "HHHHHH");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        boolean boolean35 = metaphone0.isMetaphoneEqual("##a", "hi!H");
        java.lang.String str37 = metaphone0.encode("i#");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!H", "");
        java.lang.String str13 = caverphone0.encode("hi!HIH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        char char28 = doubleMetaphone14.charAt("H", (int) (short) 0);
        char char31 = doubleMetaphone14.charAt("hi!", (int) (byte) 100);
        boolean boolean35 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", false);
        char char38 = doubleMetaphone14.charAt("hi!H", 4);
        java.lang.String str40 = doubleMetaphone14.doubleMetaphone("hi!");
        int int41 = doubleMetaphone14.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = caverphone0.encode((java.lang.Object) int41);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'H' + "'", char28 == 'H');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\000' + "'", char38 == '\000');
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "H" + "'", str40, "H");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        doubleMetaphoneResult59.appendPrimary("HHA");
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray38);
        java.lang.Object obj41 = doubleMetaphone30.encode((java.lang.Object) "hi!");
        char char44 = doubleMetaphone30.charAt("H", (int) (short) 0);
        char char47 = doubleMetaphone30.charAt("hi!", (int) (byte) 100);
        doubleMetaphone30.maxCodeLen = (short) 0;
        java.lang.String str52 = doubleMetaphone30.doubleMetaphone("H", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone30);
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H" + "'", obj41, "H");
        org.junit.Assert.assertTrue("'" + char44 + "' != '" + 'H' + "'", char44 == 'H');
        org.junit.Assert.assertTrue("'" + char47 + "' != '" + '\000' + "'", char47 == '\000');
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        java.lang.String str32 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#HIHI" + "'", str32, "#HIHI");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        doubleMetaphoneResult20.appendAlternate('h');
        doubleMetaphoneResult20.appendAlternate("A");
        doubleMetaphoneResult20.append("HIHAHIHIHAHIHH", "HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) '4');
        int int5 = metaphone0.getMaxCodeLen();
        java.lang.String str7 = metaphone0.metaphone("AHII");
        java.lang.String str9 = metaphone0.metaphone("HIHAHIHIHAHIHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AH" + "'", str7, "AH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HHHHHH" + "'", str9, "HHHHHH");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.String str36 = doubleMetaphoneResult35.getAlternate();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        metaphone0.setMaxCodeLen((int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
        java.lang.String str15 = caverphone0.encode("HHHIHH");
        java.lang.String str17 = caverphone0.caverphone("hi!HaHI");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AA11111111" + "'", str17, "AA11111111");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!hi!#h", " A1111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        java.lang.String str10 = caverphone0.caverphone("");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HHHHHH", "i#");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        java.lang.String str10 = metaphone0.metaphone("hi!4");
        java.lang.String str12 = metaphone0.encode("aa");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str15 = metaphone13.encode("hi!");
        int int18 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone13, "A111111111", "hi!H ");
        java.lang.String str20 = metaphone13.encode("hi!Ha");
        java.lang.String str22 = metaphone13.metaphone("##a");
        metaphone13.setMaxCodeLen((int) '#');
        java.lang.String str26 = metaphone13.metaphone("4h4");
        int int27 = metaphone13.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = metaphone0.encode((java.lang.Object) int27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HH" + "'", str20, "HH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        doubleMetaphoneResult24.appendAlternate("hi!A111111111HHI");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        doubleMetaphoneResult20.append("A");
        doubleMetaphoneResult20.append('4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str29 = doubleMetaphone0.encode("4hi!Ha");
        boolean boolean33 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HHHH1111111111", "HIH", false);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        java.lang.String str14 = metaphone0.metaphone("hi!4");
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!A111111111A111111111ahi!H hi!", "HIA");
        java.lang.String str19 = metaphone0.encode("hi!Hhi!HHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        char char33 = doubleMetaphone0.charAt("hi!Ha#hi", 9);
        java.lang.Class<?> wildcardClass34 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        int int38 = doubleMetaphone0.maxCodeLen;
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        doubleMetaphoneResult15.appendAlternate("hi!H hi!\00041");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        java.lang.String str15 = caverphone0.caverphone("AH");
        java.lang.String str17 = caverphone0.caverphone("");
        java.lang.String str19 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!Hhi!#i", "4 a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.caverphone("hi!H\000");
        java.lang.String str17 = caverphone0.caverphone("#h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.String str28 = doubleMetaphoneResult27.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" \000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        doubleMetaphoneResult15.append("hi!HHHH", "AH");
        doubleMetaphoneResult15.append('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!HH", "##a");
        java.lang.String str13 = caverphone0.caverphone("a");
        java.lang.String str15 = caverphone0.caverphone("\000hi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.String str31 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append(" HI4AA11111111");
        boolean boolean34 = doubleMetaphoneResult15.isComplete();
        boolean boolean35 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4h4" + "'", str31, "4h4");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        int int14 = metaphone0.getMaxCodeLen();
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!H\000#", "#HAH#");
        java.lang.String str19 = metaphone0.encode("hi!A111111111HHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("4", "hi!H hi!");
        doubleMetaphoneResult15.append("aa", "ahi!H hi!");
        doubleMetaphoneResult15.append(' ');
        boolean boolean27 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("hi!H hi!\000H", false);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual(" A1111111111", "HHIHI", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "#HAH#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!H hi!", true);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("aa");
        int int23 = doubleMetaphone0.getMaxCodeLen();
        char char26 = doubleMetaphone0.charAt("HII", (int) 'i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        doubleMetaphone0.setMaxCodeLen(32);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        boolean boolean29 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        int int12 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass13 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        doubleMetaphoneResult15.append(" HI4AA11111111", "AHHIH");
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("A111111111", "");
        java.lang.String str15 = metaphone0.encode("hi!H A111111111");
        boolean boolean18 = metaphone0.isMetaphoneEqual("\000\000", "hi!HHHHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode(obj30);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        doubleMetaphoneResult15.appendPrimary('!');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("aHHIH");
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "\000ahi!H hi!", " HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }
}

