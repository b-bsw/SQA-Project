package org.apache.commons.codec.language;

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
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.codec.language.SoundexUtils soundexUtils0 = new org.apache.commons.codec.language.SoundexUtils();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        boolean boolean5 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) 1.0d);
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
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray26);
        java.lang.Object obj29 = doubleMetaphone18.encode((java.lang.Object) "hi!");
        char char32 = doubleMetaphone18.charAt("H", (int) (short) 0);
        char char35 = doubleMetaphone18.charAt("hi!", (int) (byte) 100);
        doubleMetaphone18.maxCodeLen = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = doubleMetaphone0.encode((java.lang.Object) (short) 0);
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H" + "'", obj29, "H");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + 'H' + "'", char32 == 'H');
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        java.lang.Class<?> wildcardClass24 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H ", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H ", "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        doubleMetaphoneResult15.append('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH" + "'", str1, "HIH");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "A111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.encode("HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!H ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = caverphone0.encode((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) '4');
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = metaphone0.encode((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray9);
        java.lang.Object obj12 = doubleMetaphone1.encode((java.lang.Object) "hi!");
        char char15 = doubleMetaphone1.charAt("H", (int) (short) 0);
        doubleMetaphone1.maxCodeLen = (short) 1;
        java.lang.Class<?> wildcardClass18 = doubleMetaphone1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = caverphone0.encode((java.lang.Object) doubleMetaphone1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'H' + "'", char15 == 'H');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH" + "'", str1, "HIH");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI", "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
            java.lang.String str25 = doubleMetaphone0.encode("A");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!Ha", "HIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("hi!Ha", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'h' + "'", char14 == 'h');
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        java.lang.Object obj19 = doubleMetaphone8.encode((java.lang.Object) "hi!");
        doubleMetaphone8.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone8.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult23.append("", "hi!");
        doubleMetaphoneResult23.append('H');
        doubleMetaphoneResult23.appendAlternate("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = metaphone0.encode(obj6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray14);
        java.lang.Object obj17 = doubleMetaphone6.encode((java.lang.Object) "hi!");
        doubleMetaphone6.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone6.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult21.append("", "hi!");
        doubleMetaphoneResult21.appendAlternate("H");
        java.lang.String str27 = doubleMetaphoneResult21.getAlternate();
        doubleMetaphoneResult21.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.encode("hi!");
        int int13 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone8, "A111111111", "hi!H ");
        java.lang.String str15 = metaphone8.encode("hi!Ha");
        java.lang.String str17 = metaphone8.metaphone("##a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = metaphone0.encode((java.lang.Object) metaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("a", "hi!H ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        doubleMetaphoneResult15.appendPrimary("4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("A", "Hhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        doubleMetaphone10.maxCodeLen = (short) 0;
        doubleMetaphone10.maxCodeLen = 0;
        boolean boolean29 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "hi!H", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) doubleMetaphone10);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
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
        doubleMetaphoneResult25.appendPrimary('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = metaphone0.encode((java.lang.Object) '\000');
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H" + "'", str31, "hi!H");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone4 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray12);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray12);
        java.lang.Object obj15 = doubleMetaphone4.encode((java.lang.Object) "hi!");
        char char18 = doubleMetaphone4.charAt("H", (int) (short) 0);
        char char21 = doubleMetaphone4.charAt("hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) char21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "H" + "'", obj15, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'H' + "'", char18 == 'H');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        java.lang.String str24 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        int int8 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone9 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str11 = metaphone9.encode("hi!");
        int int12 = metaphone9.getMaxCodeLen();
        java.lang.String str14 = metaphone9.metaphone("hi!H");
        java.lang.String str16 = metaphone9.encode("hi!H ");
        int int19 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone9, "A", "hi!H ");
        metaphone9.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        java.lang.Class<?> wildcardClass28 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str13 = metaphone0.encode("HIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        doubleMetaphoneResult15.appendAlternate('\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!4", "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
            java.lang.String str25 = doubleMetaphone0.doubleMetaphone("hi!");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HI", "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("ahi!H hi!", "##a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        java.lang.String str28 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4hi!Ha" + "'", str28, "4hi!Ha");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HH", "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        doubleMetaphoneResult25.appendAlternate("hi!H hi!\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        doubleMetaphone12.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone12.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult27.append("", "hi!");
        doubleMetaphoneResult27.appendAlternate("H");
        java.lang.String str33 = doubleMetaphoneResult27.getAlternate();
        doubleMetaphoneResult27.appendPrimary('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) '4');
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!H" + "'", str33, "hi!H");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("A111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!HH", "##a");
        org.apache.commons.codec.language.Metaphone metaphone12 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean15 = metaphone12.isMetaphoneEqual("", "");
        java.lang.Object obj16 = caverphone0.encode((java.lang.Object) "");
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "1111111111" + "'", obj16, "1111111111");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.encode("4");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        doubleMetaphone10.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone10.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult25.appendAlternate('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = metaphone0.encode((java.lang.Object) 'H');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.codec.StringEncoder stringEncoder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.codec.language.SoundexUtils.difference(stringEncoder0, "AA11111111", "1111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = metaphone0.encode((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
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
        doubleMetaphoneResult25.appendPrimary('\000');
        java.lang.String str34 = doubleMetaphoneResult25.getAlternate();
        doubleMetaphoneResult25.appendAlternate("HH");
        doubleMetaphoneResult25.appendAlternate("HIH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H" + "'", str31, "hi!H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!H" + "'", str34, "hi!H");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!H", "");
        java.lang.Class<?> wildcardClass9 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("##a");
        org.apache.commons.codec.language.Metaphone metaphone15 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str17 = metaphone15.encode("hi!");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone15, "A111111111", "hi!H ");
        java.lang.String str22 = metaphone15.encode("hi!Ha");
        java.lang.String str24 = metaphone15.metaphone("##a");
        metaphone15.setMaxCodeLen((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = caverphone0.encode((java.lang.Object) metaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A111111111" + "'", str14, "A111111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HH" + "'", str22, "HH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray9);
        java.lang.Object obj12 = doubleMetaphone1.encode((java.lang.Object) "hi!");
        char char15 = doubleMetaphone1.charAt("H", (int) (short) 0);
        char char18 = doubleMetaphone1.charAt("hi!", (int) (byte) 100);
        doubleMetaphone1.maxCodeLen = (short) 0;
        java.lang.String str23 = doubleMetaphone1.doubleMetaphone("H", false);
        int int24 = doubleMetaphone1.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = metaphone0.encode((java.lang.Object) int24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "H" + "'", obj12, "H");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'H' + "'", char15 == 'H');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        java.lang.String str14 = metaphone0.metaphone("1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        doubleMetaphoneResult15.appendAlternate('\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        doubleMetaphoneResult15.appendAlternate('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone16.new DoubleMetaphoneResult(100);
        java.lang.String str34 = doubleMetaphone16.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult36 = doubleMetaphone16.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str37 = doubleMetaphoneResult36.getAlternate();
        doubleMetaphoneResult36.append('#', '4');
        doubleMetaphoneResult36.append('#', ' ');
        doubleMetaphoneResult36.append('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult36);
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
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!H ", "H");
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
        doubleMetaphoneResult25.appendPrimary('\000');
        doubleMetaphoneResult25.append("");
        doubleMetaphoneResult25.appendAlternate("H");
        doubleMetaphoneResult25.appendAlternate('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!H" + "'", str31, "hi!H");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("HI");
        boolean boolean16 = caverphone0.isCaverphoneEqual("A", "a");
        org.apache.commons.codec.language.Metaphone metaphone17 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str19 = metaphone17.encode("hi!");
        int int20 = metaphone17.getMaxCodeLen();
        java.lang.String str22 = metaphone17.metaphone("hi!H");
        java.lang.String str24 = metaphone17.encode("hi!H ");
        int int25 = metaphone17.getMaxCodeLen();
        java.lang.String str27 = metaphone17.encode("hi!Ha");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) metaphone17);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HH" + "'", str27, "HH");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("AH", "1111111111", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H", "AA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        boolean boolean10 = metaphone0.isMetaphoneEqual("AA11111111", "HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.appendAlternate("H");
        doubleMetaphoneResult15.appendAlternate("hi!4a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.String str6 = doubleMetaphone0.encode("");
        int int7 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" A111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.encode("Hhi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        char char26 = doubleMetaphone12.charAt("H", (int) (short) 0);
        char char29 = doubleMetaphone12.charAt("hi!", (int) (byte) 100);
        boolean boolean33 = doubleMetaphone12.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone34 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray42);
        boolean boolean44 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray42);
        java.lang.Object obj45 = doubleMetaphone34.encode((java.lang.Object) "hi!");
        doubleMetaphone34.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult49 = doubleMetaphone34.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult49.append("", "hi!");
        doubleMetaphoneResult49.append('H');
        doubleMetaphoneResult49.append("hi!");
        doubleMetaphoneResult49.appendAlternate("");
        doubleMetaphoneResult49.appendAlternate("H");
        java.lang.Object obj61 = doubleMetaphone12.encode((java.lang.Object) "H");
        doubleMetaphone12.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = caverphone0.encode((java.lang.Object) doubleMetaphone12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "H" + "'", obj45, "H");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        int int27 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        java.lang.Class<?> wildcardClass30 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        doubleMetaphoneResult15.append('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        doubleMetaphoneResult15.appendPrimary("A");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("4");
        java.lang.String str15 = caverphone0.caverphone("H");
        java.lang.Class<?> wildcardClass16 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        char char22 = doubleMetaphone0.charAt("HI", 4);
        java.lang.String str24 = doubleMetaphone0.encode("hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        metaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("", "");
        boolean boolean20 = caverphone14.isCaverphoneEqual("", "A111111111");
        java.lang.String str22 = caverphone14.caverphone("HIH");
        boolean boolean25 = caverphone14.isCaverphoneEqual("HI", "hi!HHHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AA11111111" + "'", str22, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str26 = metaphone24.encode("hi!");
        int int27 = metaphone24.getMaxCodeLen();
        metaphone24.setMaxCodeLen((int) (byte) 100);
        boolean boolean32 = metaphone24.isMetaphoneEqual("", "hi!H ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) "hi!H ");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.caverphone("hi!HH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        java.lang.Object obj22 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        doubleMetaphone11.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone11.new DoubleMetaphoneResult(100);
        java.lang.String str27 = doubleMetaphoneResult26.getPrimary();
        doubleMetaphoneResult26.append('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) '\000');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H" + "'", obj22, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.Class<?> wildcardClass18 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        org.apache.commons.codec.language.Caverphone caverphone27 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean32 = doubleMetaphone28.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj33 = caverphone27.encode((java.lang.Object) "a");
        java.lang.String str35 = caverphone27.encode("HH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = doubleMetaphone0.encode((java.lang.Object) caverphone27);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "A111111111" + "'", obj33, "A111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "A111111111" + "'", str35, "A111111111");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        metaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        doubleMetaphone10.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone10.new DoubleMetaphoneResult(100);
        java.lang.String str28 = doubleMetaphone10.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult30 = doubleMetaphone10.new DoubleMetaphoneResult((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) doubleMetaphone10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("hi!H ", "H");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "hi!4a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        java.lang.String str26 = doubleMetaphoneResult20.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4" + "'", str26, "4");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone37 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray45);
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray45);
        java.lang.Object obj48 = doubleMetaphone37.encode((java.lang.Object) "hi!");
        doubleMetaphone37.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult52 = doubleMetaphone37.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult52.append("", "hi!");
        doubleMetaphoneResult52.appendAlternate("H");
        java.lang.String str58 = doubleMetaphoneResult52.getAlternate();
        doubleMetaphoneResult52.appendPrimary('a');
        doubleMetaphoneResult52.append('H', 'a');
        doubleMetaphoneResult52.append(' ', 'a');
        doubleMetaphoneResult52.appendAlternate('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = metaphone0.encode((java.lang.Object) 'H');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "H" + "'", obj48, "H");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!H" + "'", str58, "hi!H");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("hi!H hi!");
        org.apache.commons.codec.language.Metaphone metaphone20 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str22 = metaphone20.encode("hi!");
        int int23 = metaphone20.getMaxCodeLen();
        java.lang.String str25 = metaphone20.metaphone("hi!H");
        java.lang.String str27 = metaphone20.encode("hi!H ");
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone20, "A", "hi!H ");
        int int33 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone20, "HH", "HIH");
        java.lang.Class<?> wildcardClass34 = metaphone20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) metaphone20);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "H" + "'", str22, "H");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "H" + "'", str25, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        doubleMetaphoneResult15.appendAlternate('H');
        java.lang.Class<?> wildcardClass30 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "HI");
        java.lang.Class<?> wildcardClass20 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000", "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!4", "Hhi!");
        java.lang.String str14 = caverphone0.caverphone("1111111111");
        boolean boolean17 = caverphone0.isCaverphoneEqual("", "HIH");
        java.lang.String str19 = caverphone0.caverphone("##a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        int int8 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!H", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        char char23 = doubleMetaphone9.charAt("H", (int) (short) 0);
        char char26 = doubleMetaphone9.charAt("H", (int) (byte) -1);
        boolean boolean30 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str32 = doubleMetaphone9.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = caverphone0.encode((java.lang.Object) str32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + 'H' + "'", char23 == 'H');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("1111111111");
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!", "A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        org.apache.commons.codec.language.Metaphone metaphone12 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str14 = metaphone12.encode("hi!");
        metaphone12.setMaxCodeLen((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = caverphone0.encode((java.lang.Object) metaphone12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHI" + "'", str1, "HIHHI");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone33 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        boolean boolean42 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray41);
        boolean boolean43 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray41);
        java.lang.Object obj44 = doubleMetaphone33.encode((java.lang.Object) "hi!");
        doubleMetaphone33.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult48 = doubleMetaphone33.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult48.append("", "hi!");
        doubleMetaphoneResult48.appendAlternate("A111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult48);
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
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "H" + "'", obj44, "H");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.lang.Class<?> wildcardClass27 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHH" + "'", str1, "HIHH");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("1111111111", "hi!HHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str17 = doubleMetaphone0.encode("");
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("hi!4", false);
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "\000 ", "hi!H ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HH", "\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("A", false);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("HH", "hi!H hi!\000");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "4");
        boolean boolean27 = doubleMetaphone0.isDoubleMetaphoneEqual("AA11111111", "hi!Ha", false);
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!4", (int) (byte) -1, 8, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 3, (int) (short) 100, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!\000", "hi!hi!hi!H hi!ahi!H hi!", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("hi!H");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        java.lang.Class<?> wildcardClass10 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        int int16 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = metaphone0.encode((java.lang.Object) strArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.String str41 = doubleMetaphone0.doubleMetaphone("HIHHI");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H" + "'", str41, "H");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000", (int) (byte) 10, (int) '\000', strArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h4", (int) (byte) 0, (int) (short) -1, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("##a", "HIHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H hi!", "\000 ");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        boolean boolean14 = metaphone0.isMetaphoneEqual("hi!hi!aAA11111111", "hi!4a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" HI4AA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIAA" + "'", str1, "HIAA");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        doubleMetaphoneResult15.appendAlternate("4hi!Ha");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        doubleMetaphoneResult15.appendPrimary("hi!");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AA11111111");
        char char21 = doubleMetaphone0.charAt("hi!Ha", (int) (short) 100);
        int int22 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi! i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HII" + "'", str1, "HII");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.Class<?> wildcardClass17 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111" + "'", str14, "1111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        doubleMetaphone9.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone9.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult24.append("", "hi!");
        doubleMetaphoneResult24.appendAlternate("H");
        java.lang.String str30 = doubleMetaphoneResult24.getAlternate();
        doubleMetaphoneResult24.append(' ', ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = caverphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H" + "'", str30, "hi!H");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        java.lang.String str13 = caverphone0.encode("hi!Ha");
        java.lang.String str15 = caverphone0.encode(" A111111111A111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str27 = doubleMetaphone0.doubleMetaphone("hi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "H" + "'", str27, "H");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("HIHH", (int) (byte) -1, 8, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        doubleMetaphoneResult15.append(' ', ' ');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) '\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H ", "\000 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone22 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray30);
        java.lang.Object obj33 = doubleMetaphone22.encode((java.lang.Object) "hi!");
        doubleMetaphone22.maxCodeLen = (short) 0;
        doubleMetaphone22.maxCodeLen = 0;
        boolean boolean41 = doubleMetaphone22.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean45 = doubleMetaphone22.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult47 = doubleMetaphone22.new DoubleMetaphoneResult(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult47);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4h4", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHa", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!HH", "hi! i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.Object obj13 = caverphone0.encode((java.lang.Object) "A111111111");
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
        doubleMetaphoneResult29.appendPrimary('a');
        doubleMetaphoneResult29.appendAlternate('#');
        doubleMetaphoneResult29.append("hi!H hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A111111111" + "'", obj13, "A111111111");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!H" + "'", str35, "hi!H");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray27);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray27);
        java.lang.Object obj30 = doubleMetaphone19.encode((java.lang.Object) "hi!");
        char char33 = doubleMetaphone19.charAt("H", (int) (short) 0);
        char char36 = doubleMetaphone19.charAt("H", (int) (byte) -1);
        int int37 = doubleMetaphone19.getMaxCodeLen();
        doubleMetaphone19.setMaxCodeLen(4);
        doubleMetaphone19.setMaxCodeLen((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult43 = doubleMetaphone19.new DoubleMetaphoneResult((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "H" + "'", obj30, "H");
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + 'H' + "'", char33 == 'H');
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("HH");
        java.lang.String str12 = caverphone0.encode("hi!Ha");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        doubleMetaphoneResult20.appendAlternate('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000H", "\000H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        doubleMetaphone13.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult28 = doubleMetaphone13.new DoubleMetaphoneResult(100);
        java.lang.String str31 = doubleMetaphone13.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone13.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str34 = doubleMetaphoneResult33.getAlternate();
        doubleMetaphoneResult33.append('#', '4');
        doubleMetaphoneResult33.append("HI", "hi!Ha");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult33);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!hi!hi!H hi!ahi!H hi!", (int) (byte) 10, (int) '#', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" A111111111", "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (int) ' ', (int) (short) 1, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H ", (int) (short) 0, (int) (short) 0, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = caverphone0.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str13 = metaphone0.encode("AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "4", "##a");
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str21 = caverphone16.encode("Hhi!");
        boolean boolean24 = caverphone16.isCaverphoneEqual("Hhi!", "A111111111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = metaphone0.encode((java.lang.Object) caverphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.String str35 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!H hi!\00041" + "'", str35, "hi!H hi!\00041");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("", "Hhi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH" + "'", str1, "HIH");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" A111111111A111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass11 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHHI", "hi!4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        java.lang.String str15 = metaphone0.metaphone("\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("AA11111111");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H A111111111", "1111111111", false);
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "##ahi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("aHHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHHIH" + "'", str1, "AHHIH");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        doubleMetaphoneResult15.append("HII");
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000A111111111HII" + "'", str25, "\000A111111111HII");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        java.lang.String str10 = caverphone0.caverphone("Hhi!");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = caverphone0.encode((java.lang.Object) boolean17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        doubleMetaphoneResult15.appendAlternate('a');
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone16 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray24);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray24);
        java.lang.Object obj27 = doubleMetaphone16.encode((java.lang.Object) "hi!");
        doubleMetaphone16.maxCodeLen = (short) 0;
        int int32 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone16, "", "");
        java.lang.String str34 = doubleMetaphone16.doubleMetaphone("HIH");
        java.lang.String str36 = doubleMetaphone16.encode("H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = metaphone0.encode((java.lang.Object) doubleMetaphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "H" + "'", obj27, "H");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" A111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H A111111111", "HIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        boolean boolean19 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "hi!H", "Hhi!HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone29 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray37);
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray37);
        java.lang.Object obj40 = doubleMetaphone29.encode((java.lang.Object) "hi!");
        doubleMetaphone29.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult44 = doubleMetaphone29.new DoubleMetaphoneResult(100);
        int int45 = doubleMetaphone29.getMaxCodeLen();
        doubleMetaphone29.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone29);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "H" + "'", obj40, "H");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HH", "hi!4a");
        java.lang.Object obj15 = caverphone0.encode((java.lang.Object) "hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "AA11111111" + "'", obj15, "AA11111111");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("4hH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA11111111", "hi!H hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!HHHH" + "'", str30, "hi!HHHH");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.String str36 = doubleMetaphone0.doubleMetaphone("hi!4");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!4", "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.lang.String str24 = doubleMetaphone0.encode(" HI4AA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "H" + "'", str24, "H");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!aAA11111111" + "'", str26, "hi!hi!aAA11111111");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!", "ahi!H hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIH", "4h4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        boolean boolean13 = metaphone0.isMetaphoneEqual("1111111111", "HIHH");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray30);
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray30);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray30);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 1, 10, strArray30);
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!HHHH", (int) 'h', (int) '4', strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = metaphone0.encode((java.lang.Object) 'h');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        char char19 = doubleMetaphone0.charAt("A111111111", 100);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        int int34 = doubleMetaphone20.maxCodeLen;
        boolean boolean38 = doubleMetaphone20.isDoubleMetaphoneEqual("hi!H hi!", "HH", false);
        int int39 = doubleMetaphone20.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        doubleMetaphoneResult15.appendPrimary('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        int int6 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI" + "'", str1, "HHI");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        doubleMetaphoneResult15.append("HI", "HHI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!hi!hi!H hi!ahi!H hi!" + "'", str30, "hi!hi!hi!H hi!ahi!H hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHA" + "'", str1, "HHA");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        doubleMetaphone0.maxCodeLen = '\000';
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone20 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray28);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray28);
        java.lang.Object obj31 = doubleMetaphone20.encode((java.lang.Object) "hi!");
        doubleMetaphone20.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone20.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult35.append("", "hi!");
        doubleMetaphoneResult35.appendAlternate("H");
        java.lang.String str41 = doubleMetaphoneResult35.getAlternate();
        doubleMetaphoneResult35.append("hi!", "H");
        doubleMetaphoneResult35.append("HH");
        java.lang.String str47 = doubleMetaphoneResult35.getPrimary();
        doubleMetaphoneResult35.append('a', 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = doubleMetaphone0.encode((java.lang.Object) 'a');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "H" + "'", obj31, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!H" + "'", str41, "hi!H");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!HH" + "'", str47, "hi!HH");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.String str21 = doubleMetaphoneResult15.getAlternate();
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000 " + "'", str21, "\000 ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!Hhi!HHH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.Class<?> wildcardClass18 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        java.lang.Object obj19 = doubleMetaphone8.encode((java.lang.Object) "hi!");
        doubleMetaphone8.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone8.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult23.append("", "hi!");
        doubleMetaphoneResult23.appendAlternate("H");
        java.lang.String str29 = doubleMetaphoneResult23.getAlternate();
        java.lang.String str30 = doubleMetaphoneResult23.getPrimary();
        doubleMetaphoneResult23.appendPrimary("HH");
        doubleMetaphoneResult23.appendPrimary("hi!HH");
        doubleMetaphoneResult23.append('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = metaphone0.encode((java.lang.Object) 'H');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!H" + "'", str29, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        boolean boolean12 = caverphone0.isCaverphoneEqual("HIHH", "hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        java.lang.String str9 = metaphone0.metaphone("Hhi!");
        boolean boolean12 = metaphone0.isMetaphoneEqual("\000", "hi!HHHH");
        java.lang.Class<?> wildcardClass13 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        doubleMetaphoneResult15.appendPrimary('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4hi!H hi!\000");
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "hi!4", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.encode("HI");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray14);
        java.lang.Object obj17 = doubleMetaphone6.encode((java.lang.Object) "hi!");
        char char20 = doubleMetaphone6.charAt("H", (int) (short) 0);
        char char23 = doubleMetaphone6.charAt("H", (int) (byte) -1);
        boolean boolean27 = doubleMetaphone6.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone6.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = metaphone0.encode((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "H" + "'", obj17, "H");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + 'H' + "'", char20 == 'H');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        char char32 = doubleMetaphone15.charAt("H", (int) (byte) -1);
        int int33 = doubleMetaphone15.getMaxCodeLen();
        java.lang.String str35 = doubleMetaphone15.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) str35);
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
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.appendPrimary('i');
        doubleMetaphoneResult15.appendAlternate('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000A111111111HII", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        doubleMetaphoneResult25.appendAlternate('\000');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!HHHH", "A");
        java.lang.Class<?> wildcardClass18 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        metaphone0.setMaxCodeLen((int) (short) 10);
        boolean boolean12 = metaphone0.isMetaphoneEqual("HHa", "hi!HIH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA11111111", "hi! i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        java.lang.String str7 = metaphone0.metaphone("hi!H hi!");
        metaphone0.setMaxCodeLen(4);
        boolean boolean12 = metaphone0.isMetaphoneEqual("", "HII");
        boolean boolean15 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "1111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        boolean boolean13 = caverphone0.isCaverphoneEqual("HH", "hi!4a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        char char28 = doubleMetaphone14.charAt("H", (int) (short) 0);
        char char31 = doubleMetaphone14.charAt("H", (int) (byte) -1);
        java.lang.String str33 = doubleMetaphone14.encode("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult35 = doubleMetaphone14.new DoubleMetaphoneResult(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = caverphone0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'H' + "'", char28 == 'H');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'H');
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("1111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!HH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.lang.Class<?> wildcardClass28 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000H", "HIAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean17 = metaphone14.isMetaphoneEqual("", "");
        java.lang.String str19 = metaphone14.metaphone("A111111111");
        java.lang.String str21 = metaphone14.encode("##a");
        java.lang.String str23 = metaphone14.encode("##a");
        java.lang.String str25 = metaphone14.metaphone("\000 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = metaphone0.encode((java.lang.Object) metaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("a", "##a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        doubleMetaphone0.maxCodeLen = 4;
        char char28 = doubleMetaphone0.charAt("4hi!Ha", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'h' + "'", char28 == 'h');
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.encode("");
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        doubleMetaphone0.maxCodeLen = 0;
        doubleMetaphone0.maxCodeLen = 'h';
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\000", (int) (byte) 10, (int) '\000', strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("HHa", (int) (short) 100, (int) (short) 1, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("Hhi!", 0, 2, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str6 = metaphone0.encode("4");
        boolean boolean9 = metaphone0.isMetaphoneEqual("aa", "hi!hi!aAA11111111");
        java.lang.String str11 = metaphone0.metaphone("hi!hi!aAA11111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HH" + "'", str11, "HH");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("##ahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI" + "'", str1, "AHI");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone8.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult23.append("", "hi!");
        doubleMetaphoneResult23.append('H');
        doubleMetaphoneResult23.append("hi!");
        boolean boolean31 = doubleMetaphoneResult23.isComplete();
        doubleMetaphoneResult23.append("hi!H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult23);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.String str28 = doubleMetaphone0.encode("AA11111111");
        boolean boolean31 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "HHhi!HH");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        int int13 = metaphone0.getMaxCodeLen();
        boolean boolean16 = metaphone0.isMetaphoneEqual("4", "hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray25);
        java.lang.Object obj28 = doubleMetaphone17.encode((java.lang.Object) "hi!");
        char char31 = doubleMetaphone17.charAt("H", (int) (short) 0);
        char char34 = doubleMetaphone17.charAt("hi!", (int) (byte) 100);
        boolean boolean38 = doubleMetaphone17.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone39 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        boolean boolean48 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray47);
        boolean boolean49 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray47);
        java.lang.Object obj50 = doubleMetaphone39.encode((java.lang.Object) "hi!");
        doubleMetaphone39.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult54 = doubleMetaphone39.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult54.append("", "hi!");
        doubleMetaphoneResult54.append('H');
        doubleMetaphoneResult54.append("hi!");
        doubleMetaphoneResult54.appendAlternate("");
        doubleMetaphoneResult54.appendAlternate("H");
        java.lang.Object obj66 = doubleMetaphone17.encode((java.lang.Object) "H");
        java.lang.String str68 = doubleMetaphone17.encode("HIH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj69 = metaphone0.encode((java.lang.Object) doubleMetaphone17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "H" + "'", obj28, "H");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + 'H' + "'", char31 == 'H');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\000' + "'", char34 == '\000');
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "H" + "'", obj50, "H");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "" + "'", obj66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "H" + "'", str68, "H");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray9);
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!", (int) '\000', 10, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = caverphone0.encode((java.lang.Object) strArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        int int24 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        char char29 = doubleMetaphone0.charAt("hi!H A111111111", 100);
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
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIA" + "'", str1, "HIA");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!Hhi!HHH", " A111111111", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded(" HI4AA11111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("HIAA", "hi!H hi!\000", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHa", "hi!HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        char char31 = doubleMetaphone0.charAt("hi! i", 9);
        boolean boolean35 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "4hi!H hi!\000", false);
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
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("A", "HI");
        java.lang.String str13 = caverphone0.encode("4");
        java.lang.String str15 = caverphone0.encode("a");
        java.lang.Class<?> wildcardClass16 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111" + "'", str13, "1111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A111111111" + "'", str15, "A111111111");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!hi!aAA11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIAAA" + "'", str1, "HIHIAAA");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass28 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!H4" + "'", str25, "hi!H4");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HH" + "'", str26, "HH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H4" + "'", str27, "hi!H4");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.encode("HI");
        java.lang.Class<?> wildcardClass11 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (byte) 10);
        boolean boolean14 = metaphone0.isMetaphoneEqual("", "Hhi!");
        int int15 = metaphone0.getMaxCodeLen();
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000 ", "\000 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray38);
        java.lang.Object obj41 = doubleMetaphone30.encode((java.lang.Object) "hi!");
        doubleMetaphone30.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult45 = doubleMetaphone30.new DoubleMetaphoneResult(100);
        java.lang.String str48 = doubleMetaphone30.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult50 = doubleMetaphone30.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str51 = doubleMetaphoneResult50.getAlternate();
        doubleMetaphoneResult50.append('#', '4');
        doubleMetaphoneResult50.append('#', ' ');
        doubleMetaphoneResult50.appendAlternate('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult50);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H" + "'", obj41, "H");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("4hi!Ha");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        java.lang.Object obj22 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        doubleMetaphone11.setMaxCodeLen((int) (byte) 1);
        java.lang.String str26 = doubleMetaphone11.encode("hi!H ");
        int int27 = doubleMetaphone11.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H" + "'", obj22, "H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("aHHIH", "hi!H hi!\00041");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.String str31 = doubleMetaphone0.doubleMetaphone("AHI", true);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AH" + "'", str31, "AH");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        doubleMetaphoneResult15.append('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Hhi!hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHI" + "'", str1, "HHIHI");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        int int22 = metaphone0.getMaxCodeLen();
        int int23 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", 1, (int) 'a', strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (byte) 1, (int) 'h', strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H hi!\00041", (int) (byte) 0, 0, strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("HI", "hi!H ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str30 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!A111111111A111111111ahi!H hi!" + "'", str28, "hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000hi!H hi!" + "'", str29, "\000hi!H hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!A111111111A111111111ahi!H hi!" + "'", str30, "hi!A111111111A111111111ahi!H hi!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray17);
        java.lang.Object obj20 = doubleMetaphone9.encode((java.lang.Object) "hi!");
        char char23 = doubleMetaphone9.charAt("H", (int) (short) 0);
        char char26 = doubleMetaphone9.charAt("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = doubleMetaphone9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = caverphone0.encode((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "H" + "'", obj20, "H");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + 'H' + "'", char23 == 'H');
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        boolean boolean13 = metaphone0.isMetaphoneEqual("HH", "Hhi!");
        int int14 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        char char32 = doubleMetaphone15.charAt("H", (int) (byte) -1);
        int int35 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone15, "HI", "A");
        java.lang.Object obj36 = metaphone0.encode((java.lang.Object) "A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "A" + "'", obj36, "A");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.encode("");
        java.lang.String str12 = metaphone0.metaphone("hi!4");
        int int13 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        doubleMetaphone14.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone14.new DoubleMetaphoneResult(100);
        java.lang.String str30 = doubleMetaphoneResult29.getPrimary();
        doubleMetaphoneResult29.append('\000');
        doubleMetaphoneResult29.append("A111111111");
        doubleMetaphoneResult29.appendAlternate('a');
        doubleMetaphoneResult29.append("hi!H ");
        doubleMetaphoneResult29.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = metaphone0.encode((java.lang.Object) 'a');
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("4 a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A111111111" + "'", str2, "A111111111");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        int int12 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "", "1111111111");
        org.apache.commons.codec.language.Metaphone metaphone13 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean16 = metaphone13.isMetaphoneEqual("", "");
        java.lang.String str18 = metaphone13.metaphone("A111111111");
        java.lang.String str20 = metaphone13.encode("##a");
        int int21 = metaphone13.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = metaphone0.encode((java.lang.Object) metaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        doubleMetaphoneResult15.append('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!Hhi!HHH" + "'", str30, "hi!Hhi!HHH");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(4);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("4hi!H hi!\000");
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("ahi!H hi!", "HHa", false);
        int int27 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        doubleMetaphoneResult15.append('a', 'H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHI" + "'", str1, "HIHHI");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.caverphone("hi!4");
        java.lang.String str10 = caverphone0.caverphone("a");
        java.lang.String str12 = caverphone0.caverphone("4hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AA11111111" + "'", str12, "AA11111111");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        doubleMetaphoneResult15.append("hi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!H hi!\000" + "'", str30, "hi!H hi!\000");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.caverphone("4h4");
        java.lang.String str13 = caverphone0.encode("4h4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("hi!HHHH");
        java.lang.String str11 = caverphone0.encode("A");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("", "");
        boolean boolean18 = caverphone12.isCaverphoneEqual("", "A111111111");
        boolean boolean21 = caverphone12.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean24 = caverphone12.isCaverphoneEqual("4hi!Ha", "ahi!H hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = caverphone0.encode((java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.String str28 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000h" + "'", str28, "\000h");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000 ", "hi!H\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        char char36 = doubleMetaphone0.charAt("hi!", 100);
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
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.String str38 = doubleMetaphone0.encode("HHIHI");
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHIAAA", "\000H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass4 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("");
        java.lang.String str11 = caverphone0.caverphone("4h4");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111" + "'", str9, "1111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        doubleMetaphone0.maxCodeLen = 'H';
        doubleMetaphone0.maxCodeLen = 0;
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        boolean boolean26 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("4H", "4hH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str31 = doubleMetaphone0.encode("hi!hi!#h");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "H" + "'", str31, "H");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.String str39 = doubleMetaphone0.doubleMetaphone("AH");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A" + "'", str39, "A");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        doubleMetaphoneResult15.append('4', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        metaphone0.setMaxCodeLen((int) (byte) 100);
        java.lang.String str13 = metaphone0.encode("hi!HH");
        boolean boolean16 = metaphone0.isMetaphoneEqual("hi!Hhi!HHH", "hi!4");
        java.lang.String str18 = metaphone0.encode("hi!H ");
        boolean boolean21 = metaphone0.isMetaphoneEqual("hi!Ha", "hi!H hi!");
        java.lang.String str23 = metaphone0.encode("aa1");
        java.lang.Class<?> wildcardClass24 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H hi!\000", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        java.lang.String str9 = caverphone0.caverphone("ahi!H hi!");
        java.lang.String str11 = caverphone0.encode("hi!H hi!\000");
        java.lang.String str13 = caverphone0.encode("hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        doubleMetaphoneResult15.append('h', 'H');
        doubleMetaphoneResult15.appendAlternate("hi!4a");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "hi!HH", "##a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        char char26 = doubleMetaphone12.charAt("H", (int) (short) 0);
        char char29 = doubleMetaphone12.charAt("H", (int) (byte) -1);
        int int30 = doubleMetaphone12.getMaxCodeLen();
        char char33 = doubleMetaphone12.charAt("hi!HHHH", 8);
        int int34 = doubleMetaphone12.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = caverphone0.encode((java.lang.Object) int34);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'H' + "'", char26 == 'H');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHI", "\000A111111111HII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone26 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        boolean boolean35 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray34);
        boolean boolean36 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray34);
        java.lang.Object obj37 = doubleMetaphone26.encode((java.lang.Object) "hi!");
        doubleMetaphone26.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult41 = doubleMetaphone26.new DoubleMetaphoneResult(100);
        java.lang.String str44 = doubleMetaphone26.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult46 = doubleMetaphone26.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str47 = doubleMetaphoneResult46.getAlternate();
        doubleMetaphoneResult46.append('#', '4');
        doubleMetaphoneResult46.append('#', ' ');
        doubleMetaphoneResult46.appendAlternate('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult46);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "H" + "'", str20, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "H" + "'", obj37, "H");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        doubleMetaphoneResult15.append('h', 'H');
        java.lang.Class<?> wildcardClass31 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append('H');
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("AA", "4hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        doubleMetaphoneResult20.append("Hhi!hi!4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HH");
        java.lang.String str10 = caverphone0.caverphone("Hhi!");
        java.lang.String str12 = caverphone0.caverphone("HH");
        java.lang.String str14 = caverphone0.encode("aHHIH");
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = caverphone0.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AA11111111" + "'", str10, "AA11111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A111111111" + "'", str12, "A111111111");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        doubleMetaphone0.maxCodeLen = (short) 1;
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.maxCodeLen;
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("HI", true);
        doubleMetaphone0.setMaxCodeLen(4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "H" + "'", str21, "H");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        doubleMetaphoneResult24.appendAlternate('a');
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.caverphone("hi!HHHH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        char char24 = doubleMetaphone10.charAt("H", (int) (short) 0);
        char char27 = doubleMetaphone10.charAt("H", (int) (byte) -1);
        boolean boolean31 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str33 = doubleMetaphone10.encode("");
        java.lang.String str36 = doubleMetaphone10.doubleMetaphone("hi!H", false);
        java.lang.String str38 = doubleMetaphone10.encode("hi!H");
        int int39 = doubleMetaphone10.maxCodeLen;
        int int42 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, "hi!H ", "hi!4");
        boolean boolean45 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "4");
        int int48 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone10, " A111111111A111111111", "4hH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = caverphone0.encode((java.lang.Object) int48);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "H" + "'", str36, "H");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "H" + "'", str38, "H");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        doubleMetaphoneResult15.appendAlternate("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.append("", "hi!");
        doubleMetaphoneResult15.append("4", "hi!H hi!");
        doubleMetaphoneResult15.append('h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("", "HHhi!HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", 4, 100, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) 10, 1, strArray13);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) 'h', strArray13);
        java.lang.Class<?> wildcardClass18 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("HIH");
        java.lang.String str10 = caverphone0.caverphone("");
        boolean boolean13 = caverphone0.isCaverphoneEqual("hi!H hi!\000", "hi!4a");
        boolean boolean16 = caverphone0.isCaverphoneEqual("hi!H ah", "hi!hi!#h");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111" + "'", str10, "1111111111");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        java.lang.String str8 = caverphone0.encode("HH");
        boolean boolean11 = caverphone0.isCaverphoneEqual("hi!4a", "ahi!H hi!");
        java.lang.Class<?> wildcardClass12 = caverphone0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "A111111111" + "'", obj6, "A111111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A111111111" + "'", str8, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'H');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!H4", "A");
        java.lang.Class<?> wildcardClass25 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHa", "AH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!hi!aAA11111111", false);
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "4 a");
        doubleMetaphone0.maxCodeLen = 97;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str18 = doubleMetaphone0.encode("");
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.String str24 = doubleMetaphoneResult20.getAlternate();
        java.lang.String str25 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "hi!H ", true);
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "A");
        int int23 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        doubleMetaphoneResult15.append('H');
        doubleMetaphoneResult15.append("hi!hi!aAA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!1", "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        int int9 = metaphone0.getMaxCodeLen();
        java.lang.String str11 = metaphone0.metaphone("##a");
        metaphone0.setMaxCodeLen((int) (short) 0);
        org.apache.commons.codec.language.Caverphone caverphone14 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean17 = caverphone14.isCaverphoneEqual("", "");
        java.lang.String str19 = caverphone14.caverphone("H");
        boolean boolean22 = caverphone14.isCaverphoneEqual("hi!H", "A111111111");
        int int25 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone14, "hi!HH", "##a");
        org.apache.commons.codec.language.Metaphone metaphone26 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean29 = metaphone26.isMetaphoneEqual("", "");
        java.lang.Object obj30 = caverphone14.encode((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = metaphone0.encode((java.lang.Object) caverphone14);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "1111111111" + "'", obj30, "1111111111");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.String str51 = caverphone0.caverphone("\000H");
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "a", false);
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("4hi!H hi!\000", "4h4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!hi!hi!H hi!ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHHIAHIHHI" + "'", str1, "HIHIHIHHIAHIHHI");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        doubleMetaphoneResult15.appendAlternate('#');
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        doubleMetaphoneResult15.appendPrimary('a');
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        int int28 = doubleMetaphone0.getMaxCodeLen();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("##a");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = metaphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.String str49 = doubleMetaphoneResult40.getAlternate();
        java.lang.String str50 = doubleMetaphoneResult40.getAlternate();
        doubleMetaphoneResult40.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult40);
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
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "H" + "'", obj36, "H");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!H" + "'", str46, "hi!H");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!H" + "'", str49, "hi!H");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!H" + "'", str50, "hi!H");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("");
        int int21 = doubleMetaphone0.maxCodeLen;
        boolean boolean25 = doubleMetaphone0.isDoubleMetaphoneEqual("##a", "HII", false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        int int26 = doubleMetaphone0.getMaxCodeLen();
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        doubleMetaphoneResult35.appendPrimary('h');
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        char char18 = doubleMetaphone0.charAt("AA11111111", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("Hhi!", "aa", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!hi!#h", "hi!H\000#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int17 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", (int) (byte) 1, (int) '4', strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h4", (int) '\000', 2, strArray14);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi! i", 0, (int) (short) 1, strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        int int1 = metaphone0.getMaxCodeLen();
        int int2 = metaphone0.getMaxCodeLen();
        boolean boolean5 = metaphone0.isMetaphoneEqual("\000H", "aa1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.apache.commons.codec.language.Metaphone metaphone24 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str26 = metaphone24.encode("hi!");
        int int27 = metaphone24.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) metaphone24);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "H" + "'", str26, "H");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        doubleMetaphoneResult15.appendPrimary("1111111111");
        doubleMetaphoneResult15.append("hi!H4", "4h4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        doubleMetaphoneResult15.append(" HI4AA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Hhi!" + "'", str27, "Hhi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hhi!" + "'", str28, "Hhi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HH" + "'", str10, "HH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HH", "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        int int27 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "HHI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        metaphone0.setMaxCodeLen(10);
        int int8 = metaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = metaphone0.encode((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("hi!H hi!");
        org.apache.commons.codec.language.Metaphone metaphone6 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str8 = metaphone6.encode("hi!");
        int int11 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone6, "A111111111", "hi!H ");
        java.lang.String str13 = metaphone6.encode("hi!Ha");
        java.lang.String str15 = metaphone6.metaphone("##a");
        java.lang.String str17 = metaphone6.encode("hi!H hi!");
        java.lang.Object obj18 = caverphone0.encode((java.lang.Object) "hi!H hi!");
        java.lang.String str20 = caverphone0.caverphone("hi!HHHH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone21 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray29);
        java.lang.Object obj32 = doubleMetaphone21.encode((java.lang.Object) "hi!");
        doubleMetaphone21.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult36 = doubleMetaphone21.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult36.append("", "hi!");
        doubleMetaphoneResult36.appendAlternate("H");
        java.lang.String str42 = doubleMetaphoneResult36.getAlternate();
        doubleMetaphoneResult36.append('4', '#');
        doubleMetaphoneResult36.append('h');
        doubleMetaphoneResult36.appendAlternate('4');
        doubleMetaphoneResult36.appendPrimary('H');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult36);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H" + "'", str8, "H");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HH" + "'", str13, "HH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HH" + "'", str17, "HH");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "AA11111111" + "'", obj18, "AA11111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AA11111111" + "'", str20, "AA11111111");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "H" + "'", obj32, "H");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!H" + "'", str42, "hi!H");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("Hhi!1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI" + "'", str1, "HHI");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        int int20 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HI", "A");
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIH", "4");
        doubleMetaphone0.maxCodeLen = 4;
        int int26 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str29 = doubleMetaphone0.doubleMetaphone("\000H", true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray11);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha", 10, (int) '1', strArray11);
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) 'H', (int) (short) 1, strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HIHIAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIAAA" + "'", str1, "HIHIAAA");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        boolean boolean9 = metaphone0.isMetaphoneEqual("a", "HIH");
        metaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str13 = metaphone0.metaphone("ahi!H hi!");
        java.lang.String str15 = metaphone0.metaphone("a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!4", "hi!4a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int21 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "1111111111", "4");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        java.lang.String str10 = metaphone0.metaphone("hi!4");
        java.lang.String str12 = metaphone0.encode("");
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!Ha", "hi!H#a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        doubleMetaphoneResult15.appendPrimary("");
        doubleMetaphoneResult15.append("hi!H hi!\00041", "A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHa" + "'", str27, "HHa");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("a", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult5 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'i');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(2);
        doubleMetaphoneResult7.append('A', 'a');
        doubleMetaphoneResult7.append('h', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A" + "'", str3, "A");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000A111111111HII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHII" + "'", str1, "AHII");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H hi!", "Hhi!hi!4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHIHI" + "'", str1, "HHIHI");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.String str24 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.appendAlternate('#');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        int int30 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        doubleMetaphoneResult15.appendAlternate("HIH");
        java.lang.String str29 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!H" + "'", str24, "hi!H");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!HHHHIH" + "'", str29, "hi!HHHHIH");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str30 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("#h");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!Ha" + "'", str29, "hi!Ha");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "aa" + "'", str30, "aa");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        int int9 = metaphone0.getMaxCodeLen();
        int int10 = metaphone0.getMaxCodeLen();
        java.lang.String str12 = metaphone0.encode("1111111111");
        metaphone0.setMaxCodeLen((int) 'A');
        boolean boolean17 = metaphone0.isMetaphoneEqual("hi!H hi!", " HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!H#a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHA" + "'", str1, "HIHA");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        doubleMetaphoneResult40.append("hi!");
        doubleMetaphoneResult40.append(' ', 'a');
        doubleMetaphoneResult40.appendAlternate("AA11111111");
        doubleMetaphoneResult40.append('i', 'i');
        doubleMetaphoneResult40.append('h', 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = doubleMetaphone0.encode((java.lang.Object) 'a');
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
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HHHH", "\000h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        doubleMetaphoneResult15.append('i');
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        int int28 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HHhi!HH", "hi!HHHHa");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.String str23 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        java.lang.String str34 = doubleMetaphone0.encode("HIAA");
        int int35 = doubleMetaphone0.maxCodeLen;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "H" + "'", str34, "H");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.encode("ahi!H hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("\000H", "4H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray20);
        java.lang.Object obj23 = doubleMetaphone12.encode((java.lang.Object) "hi!");
        doubleMetaphone12.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone12.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult27.append("", "hi!");
        doubleMetaphoneResult27.appendAlternate("H");
        java.lang.String str33 = doubleMetaphoneResult27.getAlternate();
        doubleMetaphoneResult27.appendPrimary('\000');
        java.lang.String str36 = doubleMetaphoneResult27.getAlternate();
        java.lang.String str37 = doubleMetaphoneResult27.getAlternate();
        java.lang.Object obj38 = caverphone0.encode((java.lang.Object) str37);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "H" + "'", obj23, "H");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!H" + "'", str33, "hi!H");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!H" + "'", str36, "hi!H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!H" + "'", str37, "hi!H");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "AA11111111" + "'", obj38, "AA11111111");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        org.apache.commons.codec.language.Caverphone caverphone12 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean15 = caverphone12.isCaverphoneEqual("", "");
        java.lang.String str17 = caverphone12.caverphone("H");
        java.lang.String str19 = caverphone12.encode("A111111111");
        java.lang.String str21 = caverphone12.encode("Hhi!");
        java.lang.String str23 = caverphone12.encode("hi!HHHH");
        java.lang.Object obj24 = caverphone0.encode((java.lang.Object) "hi!HHHH");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A111111111" + "'", str19, "A111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "AA11111111" + "'", obj24, "AA11111111");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        doubleMetaphoneResult15.append("A");
        doubleMetaphoneResult15.append('#', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("a", "HIHIHIHHIAHIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("HII", (int) (short) -1, (int) 'H', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        doubleMetaphoneResult15.append("hi!H hi!");
        doubleMetaphoneResult15.append("hi!HHHHIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone0, "HIH", "A111111111");
        boolean boolean13 = caverphone0.isCaverphoneEqual("a", "hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray22);
        java.lang.Object obj25 = doubleMetaphone14.encode((java.lang.Object) "hi!");
        char char28 = doubleMetaphone14.charAt("H", (int) (short) 0);
        char char31 = doubleMetaphone14.charAt("H", (int) (byte) -1);
        int int32 = doubleMetaphone14.getMaxCodeLen();
        char char35 = doubleMetaphone14.charAt("hi!HHHH", 8);
        org.apache.commons.codec.language.Caverphone caverphone36 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean39 = caverphone36.isCaverphoneEqual("", "");
        java.lang.String str41 = caverphone36.caverphone("H");
        boolean boolean44 = caverphone36.isCaverphoneEqual("hi!H", "A111111111");
        int int47 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) caverphone36, "hi!HH", "##a");
        java.lang.String str49 = caverphone36.caverphone("a");
        java.lang.Object obj50 = doubleMetaphone14.encode((java.lang.Object) str49);
        java.lang.String str52 = doubleMetaphone14.encode("HHI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = caverphone0.encode((java.lang.Object) doubleMetaphone14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "H" + "'", obj25, "H");
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + 'H' + "'", char28 == 'H');
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '\000' + "'", char35 == '\000');
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "A111111111" + "'", str41, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "A111111111" + "'", str49, "A111111111");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "A" + "'", obj50, "A");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        metaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append('h');
        doubleMetaphoneResult15.append("HIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.lang.String str26 = doubleMetaphoneResult15.getAlternate();
        java.lang.String str27 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!H" + "'", str26, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!H" + "'", str27, "hi!H");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "hi!H hi!");
        java.lang.String str14 = caverphone0.caverphone("aa");
        boolean boolean17 = caverphone0.isCaverphoneEqual("A", "HH");
        java.lang.String str19 = caverphone0.encode("");
        java.lang.String str21 = caverphone0.caverphone("hi!4");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray29);
        boolean boolean31 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray29);
        java.lang.Class<?> wildcardClass32 = strArray29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = caverphone0.encode((java.lang.Object) strArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AA11111111" + "'", str14, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111" + "'", str19, "1111111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AA11111111" + "'", str21, "AA11111111");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("1111111111", "4hi!H hi!\000");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        doubleMetaphoneResult15.append(' ', '#');
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!H", true);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("A111111111", "A111111111", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a" + "'", str26, "a");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        java.lang.String str9 = metaphone0.encode("##ahi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray18);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray18);
        java.lang.Object obj21 = doubleMetaphone10.encode((java.lang.Object) "hi!");
        char char24 = doubleMetaphone10.charAt("H", (int) (short) 0);
        char char27 = doubleMetaphone10.charAt("hi!", (int) (byte) 100);
        java.lang.String str30 = doubleMetaphone10.doubleMetaphone("hi!H hi!", true);
        int int31 = doubleMetaphone10.maxCodeLen;
        int int32 = doubleMetaphone10.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = metaphone0.encode((java.lang.Object) int32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H" + "'", str9, "H");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "H" + "'", obj21, "H");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\000' + "'", char27 == '\000');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "H" + "'", str30, "H");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        boolean boolean10 = caverphone0.isCaverphoneEqual("HIH", "4hi!Ha");
        boolean boolean13 = caverphone0.isCaverphoneEqual("4", " A111111111");
        java.lang.String str15 = caverphone0.caverphone("AH");
        java.lang.String str17 = caverphone0.encode("hi!HHHH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone18 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray26);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray26);
        java.lang.Object obj29 = doubleMetaphone18.encode((java.lang.Object) "hi!");
        char char32 = doubleMetaphone18.charAt("H", (int) (short) 0);
        doubleMetaphone18.maxCodeLen = (short) 1;
        int int35 = doubleMetaphone18.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult37 = doubleMetaphone18.new DoubleMetaphoneResult((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult39 = doubleMetaphone18.new DoubleMetaphoneResult((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = caverphone0.encode((java.lang.Object) doubleMetaphone18);
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
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "H" + "'", obj29, "H");
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + 'H' + "'", char32 == 'H');
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean29 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("HIHHI", " A111111111");
        java.lang.String str8 = caverphone0.encode("hi!H#a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean(" h ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        boolean boolean11 = metaphone0.isMetaphoneEqual("\000hi!H hi!", "hi!hi!#h");
        java.lang.String str13 = metaphone0.encode("hi!H");
        java.lang.String str15 = metaphone0.metaphone("hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HH" + "'", str15, "HH");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        doubleMetaphoneResult15.appendAlternate("hi!4");
        doubleMetaphoneResult15.appendPrimary('#');
        doubleMetaphoneResult15.appendPrimary("1111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIA", "hi!hi!aAA11111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("AH", (int) (byte) 1, 0, strArray10);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!Ha", (-1), 100, strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) -1);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str23 = doubleMetaphone0.encode("");
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("", "");
        java.lang.String str5 = metaphone0.metaphone("A111111111");
        java.lang.String str7 = metaphone0.encode("aa");
        org.apache.commons.codec.language.Metaphone metaphone8 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str10 = metaphone8.encode("hi!");
        boolean boolean13 = metaphone8.isMetaphoneEqual("", "A111111111");
        int int14 = metaphone8.getMaxCodeLen();
        int int17 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone8, "hi!H hi!", "hi!H ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = metaphone0.encode((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A" + "'", str5, "A");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A" + "'", str7, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        doubleMetaphoneResult15.append('#', 'h');
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!HIH", "hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int8 = metaphone0.getMaxCodeLen();
        java.lang.String str10 = metaphone0.metaphone("HIH");
        boolean boolean13 = metaphone0.isMetaphoneEqual(" HI4AA11111111", "AA11111111");
        java.lang.String str15 = metaphone0.metaphone("Hhi!");
        int int16 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "H" + "'", str10, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        doubleMetaphoneResult15.appendAlternate('4');
        doubleMetaphoneResult15.append("AHHIH", "Hhi!HH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = caverphone0.encode(obj8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        doubleMetaphoneResult15.append("4hi!Ha", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!4" + "'", str24, "hi!4");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        metaphone0.setMaxCodeLen((int) '4');
        int int5 = metaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass6 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("\000", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.setMaxCodeLen((-1));
        doubleMetaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        doubleMetaphoneResult15.appendPrimary('H');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HHhi!HH" + "'", str27, "HHhi!HH");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi! i", "HIHIHIHHIAHIHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        int int36 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone37 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray45);
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray45);
        java.lang.Object obj48 = doubleMetaphone37.encode((java.lang.Object) "hi!");
        doubleMetaphone37.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult52 = doubleMetaphone37.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult52.append("", "hi!");
        doubleMetaphoneResult52.append('H');
        doubleMetaphoneResult52.append("hi!");
        doubleMetaphoneResult52.appendAlternate("");
        doubleMetaphoneResult52.appendAlternate('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult52);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "H" + "'", obj48, "H");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!Ha");
        org.apache.commons.codec.language.Caverphone caverphone9 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean12 = caverphone9.isCaverphoneEqual("", "");
        boolean boolean15 = caverphone9.isCaverphoneEqual("", "A111111111");
        java.lang.String str17 = caverphone9.caverphone("HH");
        java.lang.String str19 = caverphone9.caverphone("Hhi!");
        java.lang.String str21 = caverphone9.caverphone("HH");
        java.lang.String str23 = caverphone9.encode("aHHIH");
        java.lang.Object obj24 = caverphone0.encode((java.lang.Object) str23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A111111111" + "'", str17, "A111111111");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AA11111111" + "'", str19, "AA11111111");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A111111111" + "'", str21, "A111111111");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AA11111111" + "'", str23, "AA11111111");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "AA11111111" + "'", obj24, "AA11111111");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        doubleMetaphoneResult15.appendAlternate("hi!4");
        doubleMetaphoneResult15.appendPrimary('#');
        doubleMetaphoneResult15.append("AHII");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        int int27 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone30 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        boolean boolean39 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray38);
        boolean boolean40 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray38);
        java.lang.Object obj41 = doubleMetaphone30.encode((java.lang.Object) "hi!");
        doubleMetaphone30.maxCodeLen = (short) 0;
        int int44 = doubleMetaphone30.maxCodeLen;
        int int45 = doubleMetaphone30.maxCodeLen;
        int int46 = doubleMetaphone30.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone30);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "H" + "'", obj41, "H");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen(3);
        metaphone0.setMaxCodeLen(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        java.lang.String str25 = doubleMetaphone0.encode("AH");
        java.lang.String str27 = doubleMetaphone0.encode("\000H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("\000hi!H hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHI" + "'", str1, "HIHHI");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        boolean boolean30 = doubleMetaphoneResult15.isComplete();
        doubleMetaphoneResult15.appendAlternate('a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("HHhi!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHIHH" + "'", str1, "HHHIHH");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        char char19 = doubleMetaphone0.charAt("A111111111", 100);
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        int int30 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "HIAA", "hi!A111111111A111111111ahi!H hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        int int15 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!", "Hhi!");
        java.lang.String str17 = metaphone0.encode("4");
        java.lang.String str19 = metaphone0.encode("HIHIHIHHIAHIHHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        metaphone0.setMaxCodeLen((int) (byte) -1);
        int int15 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Caverphone caverphone16 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean19 = caverphone16.isCaverphoneEqual("", "");
        boolean boolean22 = caverphone16.isCaverphoneEqual("", "A111111111");
        java.lang.String str24 = caverphone16.caverphone("hi!");
        boolean boolean27 = caverphone16.isCaverphoneEqual("HIH", "HI");
        java.lang.String str29 = caverphone16.encode("AA11111111");
        java.lang.String str31 = caverphone16.caverphone("hi!4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = metaphone0.encode((java.lang.Object) caverphone16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "AA11111111" + "'", str24, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AA11111111" + "'", str29, "AA11111111");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AA11111111" + "'", str31, "AA11111111");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.String str34 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "a" + "'", str24, "a");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!Ha#hi" + "'", str34, "hi!Ha#hi");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "A");
        java.lang.String str11 = caverphone0.encode("A");
        boolean boolean14 = caverphone0.isCaverphoneEqual("a", "4");
        java.lang.String str16 = caverphone0.encode("\000A111111111HII");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AA11111111" + "'", str16, "AA11111111");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        char char14 = doubleMetaphone0.charAt("H", (int) (short) 0);
        char char17 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen(100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        int int16 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "", "");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("HIH");
        doubleMetaphone0.maxCodeLen = '1';
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!\000", "hi!Ha");
        boolean boolean6 = caverphone0.isCaverphoneEqual("ahi!H hi!", "4hi!Ha");
        java.lang.String str8 = caverphone0.encode("hi!H ah");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!H", "\000 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("##a", "AHII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult20.appendPrimary(' ');
        doubleMetaphoneResult20.append('i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HHA", "HII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        boolean boolean8 = caverphone0.isCaverphoneEqual("hi!H", "A111111111");
        boolean boolean11 = caverphone0.isCaverphoneEqual("##ahi!", "4hi!Ha");
        org.apache.commons.codec.language.Metaphone metaphone12 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str14 = metaphone12.encode("hi!");
        int int15 = metaphone12.getMaxCodeLen();
        java.lang.String str17 = metaphone12.metaphone("hi!H");
        java.lang.String str19 = metaphone12.encode("hi!H ");
        int int22 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone12, "A", "hi!H ");
        metaphone12.setMaxCodeLen(3);
        int int25 = metaphone12.getMaxCodeLen();
        boolean boolean28 = metaphone12.isMetaphoneEqual("4", "hi!Ha");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = caverphone0.encode((java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        doubleMetaphoneResult15.appendPrimary("##a");
        doubleMetaphoneResult15.append('\000');
        doubleMetaphoneResult15.append("hi!HH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        boolean boolean9 = caverphone0.isCaverphoneEqual("AA11111111", "AA11111111");
        java.lang.String str11 = caverphone0.caverphone("H");
        java.lang.String str13 = caverphone0.caverphone("A111111111");
        boolean boolean16 = caverphone0.isCaverphoneEqual("HHHH", "H");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A111111111" + "'", str11, "A111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A111111111" + "'", str13, "A111111111");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray32);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray32);
        java.lang.Object obj35 = doubleMetaphone24.encode((java.lang.Object) "hi!");
        char char38 = doubleMetaphone24.charAt("H", (int) (short) 0);
        char char41 = doubleMetaphone24.charAt("hi!", (int) (byte) 100);
        boolean boolean45 = doubleMetaphone24.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone46 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        boolean boolean55 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray54);
        boolean boolean56 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray54);
        java.lang.Object obj57 = doubleMetaphone46.encode((java.lang.Object) "hi!");
        doubleMetaphone46.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult61 = doubleMetaphone46.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult61.append("", "hi!");
        doubleMetaphoneResult61.append('H');
        doubleMetaphoneResult61.append("hi!");
        doubleMetaphoneResult61.appendAlternate("");
        doubleMetaphoneResult61.appendAlternate("H");
        java.lang.Object obj73 = doubleMetaphone24.encode((java.lang.Object) "H");
        boolean boolean77 = doubleMetaphone24.isDoubleMetaphoneEqual("Hhi!", "A", false);
        int int80 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone24);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + 'H' + "'", char38 == 'H');
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "H" + "'", obj57, "H");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "" + "'", obj73, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        int int11 = metaphone0.getMaxCodeLen();
        metaphone0.setMaxCodeLen((int) (byte) 100);
        int int14 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        doubleMetaphoneResult15.appendPrimary('h');
        doubleMetaphoneResult15.append('#', 'h');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        boolean boolean25 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        boolean boolean8 = metaphone0.isMetaphoneEqual("1111111111", "");
        metaphone0.setMaxCodeLen((int) '1');
        java.lang.String str12 = metaphone0.metaphone("");
        java.lang.String str14 = metaphone0.encode("H1");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray23);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray23);
        java.lang.Object obj26 = doubleMetaphone15.encode((java.lang.Object) "hi!");
        char char29 = doubleMetaphone15.charAt("H", (int) (short) 0);
        char char32 = doubleMetaphone15.charAt("hi!", (int) (byte) 100);
        boolean boolean36 = doubleMetaphone15.isDoubleMetaphoneEqual("H", "H", false);
        char char39 = doubleMetaphone15.charAt("hi!H", 4);
        java.lang.String str41 = doubleMetaphone15.doubleMetaphone("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult43 = doubleMetaphone15.new DoubleMetaphoneResult((int) (short) 10);
        int int44 = doubleMetaphone15.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = metaphone0.encode((java.lang.Object) int44);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "H" + "'", obj26, "H");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'H' + "'", char29 == 'H');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\000' + "'", char39 == '\000');
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "H" + "'", str41, "H");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        doubleMetaphoneResult15.append('h', 'i');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!HH" + "'", str27, "hi!HH");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        doubleMetaphoneResult15.appendPrimary('A');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        boolean boolean26 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        doubleMetaphoneResult15.appendPrimary('H');
        java.lang.String str25 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str26 = doubleMetaphoneResult15.getPrimary();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4H" + "'", str25, "4H");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4H" + "'", str26, "4H");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        java.lang.String str10 = caverphone0.caverphone("HH");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        java.lang.Object obj22 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        doubleMetaphone11.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone11.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult26.append("", "hi!");
        doubleMetaphoneResult26.appendAlternate("H");
        java.lang.Class<?> wildcardClass32 = doubleMetaphoneResult26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = caverphone0.encode((java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A111111111" + "'", str10, "A111111111");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H" + "'", obj22, "H");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        doubleMetaphone0.maxCodeLen = 0;
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
        boolean boolean51 = doubleMetaphone16.isDoubleMetaphoneEqual("H", "4");
        int int52 = doubleMetaphone16.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = doubleMetaphone0.encode((java.lang.Object) int52);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        doubleMetaphoneResult28.append("hi!H\000", "hi!Hhi!hi!4hi!4hi!Ha");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone37 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray45);
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray45);
        java.lang.Object obj48 = doubleMetaphone37.encode((java.lang.Object) "hi!");
        char char51 = doubleMetaphone37.charAt("H", (int) (short) 0);
        char char54 = doubleMetaphone37.charAt("H", (int) (byte) -1);
        boolean boolean58 = doubleMetaphone37.isDoubleMetaphoneEqual("hi!", "hi!", false);
        java.lang.String str60 = doubleMetaphone37.encode("");
        java.lang.String str63 = doubleMetaphone37.doubleMetaphone("hi!H", false);
        java.lang.String str65 = doubleMetaphone37.encode("hi!H");
        int int66 = doubleMetaphone37.maxCodeLen;
        int int69 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone37, "hi!H ", "hi!4");
        boolean boolean73 = doubleMetaphone37.isDoubleMetaphoneEqual("aa", "\000", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult75 = doubleMetaphone37.new DoubleMetaphoneResult(0);
        doubleMetaphoneResult75.appendPrimary('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult75);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "H" + "'", str28, "H");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "H" + "'", obj48, "H");
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + 'H' + "'", char51 == 'H');
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\000' + "'", char54 == '\000');
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "H" + "'", str63, "H");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "H" + "'", str65, "H");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone1 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean5 = doubleMetaphone1.isDoubleMetaphoneEqual("A111111111", "a", false);
        java.lang.Object obj6 = caverphone0.encode((java.lang.Object) "a");
        boolean boolean9 = caverphone0.isCaverphoneEqual("A", "hi!H ");
        boolean boolean12 = caverphone0.isCaverphoneEqual("hi!H", "ahi!H hi!");
        java.lang.String str14 = caverphone0.encode("4");
        java.lang.String str16 = caverphone0.encode("hi!H ");
        java.lang.String str18 = caverphone0.caverphone("hi!");
        boolean boolean21 = caverphone0.isCaverphoneEqual("hi!H ah", "hi!H A111111111");
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
        doubleMetaphoneResult37.append("", "hi!H hi!\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = caverphone0.encode((java.lang.Object) doubleMetaphoneResult37);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "H" + "'", obj33, "H");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        doubleMetaphoneResult20.append('1', 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!A111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIA" + "'", str1, "HIA");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        boolean boolean67 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray66);
        boolean boolean68 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray66);
        java.lang.Class<?> wildcardClass69 = strArray66.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = doubleMetaphone0.encode((java.lang.Object) wildcardClass69);
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
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone24 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray32);
        boolean boolean34 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray32);
        java.lang.Object obj35 = doubleMetaphone24.encode((java.lang.Object) "hi!");
        char char38 = doubleMetaphone24.charAt("H", (int) (short) 0);
        char char41 = doubleMetaphone24.charAt("hi!", (int) (byte) 100);
        boolean boolean45 = doubleMetaphone24.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone46 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        boolean boolean55 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray54);
        boolean boolean56 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray54);
        java.lang.Object obj57 = doubleMetaphone46.encode((java.lang.Object) "hi!");
        doubleMetaphone46.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult61 = doubleMetaphone46.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult61.append("", "hi!");
        doubleMetaphoneResult61.append('H');
        doubleMetaphoneResult61.append("hi!");
        doubleMetaphoneResult61.appendAlternate("");
        doubleMetaphoneResult61.appendAlternate("H");
        java.lang.Object obj73 = doubleMetaphone24.encode((java.lang.Object) "H");
        boolean boolean77 = doubleMetaphone24.isDoubleMetaphoneEqual("Hhi!", "A", false);
        int int80 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone24, "hi!", "");
        java.lang.String str83 = doubleMetaphone24.doubleMetaphone("", false);
        doubleMetaphone24.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj86 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "H" + "'", obj35, "H");
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + 'H' + "'", char38 == 'H');
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '\000' + "'", char41 == '\000');
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + "H" + "'", obj57, "H");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + "" + "'", obj73, "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        doubleMetaphoneResult35.append('#');
        doubleMetaphoneResult35.append('a', ' ');
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("aa");
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
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        doubleMetaphoneResult15.append('a', 'h');
        doubleMetaphoneResult15.appendPrimary("AHHIH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("hi!HHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHHH" + "'", str1, "HIHHHH");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.caverphone("AA11111111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray16);
        java.lang.Object obj19 = doubleMetaphone8.encode((java.lang.Object) "hi!");
        doubleMetaphone8.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone8.new DoubleMetaphoneResult(100);
        boolean boolean27 = doubleMetaphone8.isDoubleMetaphoneEqual("hi!HH", "AA11111111", true);
        int int28 = doubleMetaphone8.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = caverphone0.encode((java.lang.Object) int28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Caverphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "H" + "'", obj19, "H");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult15.appendAlternate('#');
        doubleMetaphoneResult15.appendAlternate('4');
        java.lang.Class<?> wildcardClass20 = doubleMetaphoneResult15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        doubleMetaphoneResult21.appendPrimary('1');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        java.lang.String str5 = caverphone0.encode("Hhi!");
        java.lang.String str7 = caverphone0.caverphone("\000A111111111HII");
        java.lang.String str9 = caverphone0.caverphone("hi!HHHHa");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AA11111111" + "'", str5, "AA11111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AA11111111" + "'", str7, "AA11111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.String str28 = doubleMetaphoneResult15.getAlternate();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!HHAH" + "'", str28, "hi!HHAH");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("hi!Hhi!HHH", "AHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("##ahi!", "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        doubleMetaphoneResult15.append('1', '4');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int23 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone0, "aHHIH", "4hH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("Hhi!hi!4", "##ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.String str35 = doubleMetaphone0.doubleMetaphone("hi!H hi!\00041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone36 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        boolean boolean45 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray44);
        boolean boolean46 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray44);
        java.lang.Object obj47 = doubleMetaphone36.encode((java.lang.Object) "hi!");
        char char50 = doubleMetaphone36.charAt("H", (int) (short) 0);
        char char53 = doubleMetaphone36.charAt("hi!", (int) (byte) 100);
        boolean boolean57 = doubleMetaphone36.isDoubleMetaphoneEqual("H", "H", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone58 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!" };
        boolean boolean67 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray66);
        boolean boolean68 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray66);
        java.lang.Object obj69 = doubleMetaphone58.encode((java.lang.Object) "hi!");
        doubleMetaphone58.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult73 = doubleMetaphone58.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult73.append("", "hi!");
        doubleMetaphoneResult73.append('H');
        doubleMetaphoneResult73.append("hi!");
        doubleMetaphoneResult73.appendAlternate("");
        doubleMetaphoneResult73.appendAlternate("H");
        java.lang.Object obj85 = doubleMetaphone36.encode((java.lang.Object) "H");
        doubleMetaphone36.setMaxCodeLen((int) (short) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult89 = doubleMetaphone36.new DoubleMetaphoneResult((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone36);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "H" + "'", obj47, "H");
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + 'H' + "'", char50 == 'H');
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\000' + "'", char53 == '\000');
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + "H" + "'", obj69, "H");
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + "" + "'", obj85, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.String str23 = metaphone0.encode("\000h");
        java.lang.String str25 = metaphone0.metaphone("Hhi!");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        java.lang.String str2 = caverphone0.encode("HHIHI");
        java.lang.String str4 = caverphone0.encode("aHHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA11111111" + "'", str2, "AA11111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AA11111111" + "'", str4, "AA11111111");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        doubleMetaphoneResult15.appendAlternate("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", 100, (int) (byte) 10, strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!H", (int) (byte) 1, (int) '4', strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("4h4", (int) '\000', 2, strArray14);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("1111111111", (int) (byte) 1, 100, strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult21.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        java.lang.String str5 = caverphone0.caverphone("H");
        java.lang.String str7 = caverphone0.encode("A111111111");
        java.lang.String str9 = caverphone0.encode("hi! i");
        java.lang.String str11 = caverphone0.encode("HHa");
        java.lang.String str13 = caverphone0.caverphone("aa1");
        java.lang.String str15 = caverphone0.caverphone("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A111111111" + "'", str5, "A111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A111111111" + "'", str7, "A111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AA11111111" + "'", str9, "AA11111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AA11111111" + "'", str11, "AA11111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!HH", "a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray19);
        java.lang.Object obj22 = doubleMetaphone11.encode((java.lang.Object) "hi!");
        doubleMetaphone11.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult26 = doubleMetaphone11.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult26.append("", "hi!");
        doubleMetaphoneResult26.append('H');
        doubleMetaphoneResult26.append("hi!");
        doubleMetaphoneResult26.appendAlternate("");
        doubleMetaphoneResult26.appendAlternate("H");
        doubleMetaphoneResult26.append("HH");
        java.lang.String str40 = doubleMetaphoneResult26.getPrimary();
        doubleMetaphoneResult26.append(' ', ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = metaphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "H" + "'", obj22, "H");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Hhi!HH" + "'", str40, "Hhi!HH");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone28 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        boolean boolean37 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray36);
        boolean boolean38 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray36);
        java.lang.Object obj39 = doubleMetaphone28.encode((java.lang.Object) "hi!");
        doubleMetaphone28.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult43 = doubleMetaphone28.new DoubleMetaphoneResult(100);
        doubleMetaphoneResult43.append("", "hi!");
        doubleMetaphoneResult43.appendAlternate("H");
        java.lang.String str49 = doubleMetaphoneResult43.getAlternate();
        doubleMetaphoneResult43.append("hi!", "H");
        doubleMetaphoneResult43.append("A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "H" + "'", obj39, "H");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!H" + "'", str49, "hi!H");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.Class<?> wildcardClass27 = doubleMetaphone0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.lang.String str31 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("hi!H ah", "hi!H A111111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ahi!H hi!" + "'", str28, "ahi!H hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ahi!H hi!a" + "'", str31, "ahi!H hi!a");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int5 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A111111111", "hi!H ");
        java.lang.String str7 = metaphone0.encode("hi!Ha");
        boolean boolean10 = metaphone0.isMetaphoneEqual("hi!HH", "a");
        java.lang.String str12 = metaphone0.metaphone("HHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HH" + "'", str7, "HH");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        boolean boolean3 = metaphone0.isMetaphoneEqual("A", "4hi!Ha");
        boolean boolean6 = metaphone0.isMetaphoneEqual("hi!H", "a");
        metaphone0.setMaxCodeLen((-1));
        int int9 = metaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        doubleMetaphoneResult15.appendPrimary(" HI4AA11111111");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        doubleMetaphoneResult15.appendAlternate("aa");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = org.apache.commons.codec.language.SoundexUtils.clean("AHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI" + "'", str1, "AHI");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = org.apache.commons.codec.language.SoundexUtils.differenceEncoded("HIHH", "hi!H hi!\000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("", "");
        boolean boolean6 = caverphone0.isCaverphoneEqual("", "A111111111");
        java.lang.String str8 = caverphone0.caverphone("hi!");
        boolean boolean11 = caverphone0.isCaverphoneEqual("HIH", "HI");
        java.lang.String str13 = caverphone0.encode("AA11111111");
        java.lang.String str15 = caverphone0.caverphone("hi!4");
        java.lang.String str17 = caverphone0.encode("1111111111");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AA11111111" + "'", str8, "AA11111111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AA11111111" + "'", str13, "AA11111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AA11111111" + "'", str15, "AA11111111");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1111111111" + "'", str17, "1111111111");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        boolean boolean28 = doubleMetaphoneResult15.isComplete();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!H" + "'", str21, "hi!H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        metaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str9 = metaphone0.encode("4");
        java.lang.String str11 = metaphone0.metaphone("hi!");
        int int14 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "hi!H hi!", "HHa");
        java.lang.String str16 = metaphone0.encode("A111111111");
        java.lang.Class<?> wildcardClass17 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        java.lang.String str15 = doubleMetaphone0.encode("hi!H ");
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "H" + "'", str15, "H");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        boolean boolean5 = metaphone0.isMetaphoneEqual("", "A111111111");
        int int6 = metaphone0.getMaxCodeLen();
        java.lang.String str8 = metaphone0.encode("HH");
        metaphone0.setMaxCodeLen((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((-1));
        metaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = metaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        boolean boolean9 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray8);
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray8);
        java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) "hi!");
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        java.lang.String str16 = doubleMetaphoneResult15.getPrimary();
        java.lang.String str17 = doubleMetaphoneResult15.getPrimary();
        doubleMetaphoneResult15.append("");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.codec.language.Metaphone metaphone0 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str2 = metaphone0.encode("hi!");
        int int3 = metaphone0.getMaxCodeLen();
        java.lang.String str5 = metaphone0.metaphone("hi!H");
        java.lang.String str7 = metaphone0.encode("hi!H ");
        int int10 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) metaphone0, "A", "hi!H ");
        metaphone0.setMaxCodeLen((int) ' ');
        int int13 = metaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.Metaphone metaphone14 = new org.apache.commons.codec.language.Metaphone();
        java.lang.String str16 = metaphone14.encode("hi!");
        boolean boolean19 = metaphone14.isMetaphoneEqual("", "A111111111");
        java.lang.String str21 = metaphone14.metaphone("hi!H hi!");
        java.lang.Object obj22 = metaphone0.encode((java.lang.Object) str21);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        boolean boolean32 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray31);
        boolean boolean33 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray31);
        java.lang.Object obj34 = doubleMetaphone23.encode((java.lang.Object) "hi!");
        doubleMetaphone23.maxCodeLen = (short) 0;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult38 = doubleMetaphone23.new DoubleMetaphoneResult(100);
        java.lang.String str41 = doubleMetaphone23.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult43 = doubleMetaphone23.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str44 = doubleMetaphoneResult43.getAlternate();
        java.lang.String str45 = doubleMetaphoneResult43.getAlternate();
        java.lang.String str46 = doubleMetaphoneResult43.getPrimary();
        java.lang.String str47 = doubleMetaphoneResult43.getAlternate();
        doubleMetaphoneResult43.append('i', 'h');
        doubleMetaphoneResult43.appendPrimary('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj53 = metaphone0.encode((java.lang.Object) doubleMetaphoneResult43);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Metaphone encode is not of type java.lang.String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HH" + "'", str21, "HH");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "H" + "'", obj34, "H");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.String str37 = doubleMetaphone0.doubleMetaphone("hi!HH", false);
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "H" + "'", str37, "H");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        doubleMetaphoneResult20.appendAlternate("HIHA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "H" + "'", obj11, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4hi!H hi!\000" + "'", str28, "4hi!H hi!\000");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#H" + "'", str29, "#H");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.codec.language.Caverphone caverphone0 = new org.apache.commons.codec.language.Caverphone();
        boolean boolean3 = caverphone0.isCaverphoneEqual("hi!H hi!", "hi!Ha");
        boolean boolean6 = caverphone0.isCaverphoneEqual("H1", "AA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone38 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        boolean boolean47 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (byte) -1, 0, strArray46);
        boolean boolean48 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 0, (int) '#', strArray46);
        java.lang.Object obj49 = doubleMetaphone38.encode((java.lang.Object) "hi!");
        doubleMetaphone38.maxCodeLen = (short) 0;
        int int54 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone38, "", "");
        int int55 = doubleMetaphone38.maxCodeLen;
        int int56 = doubleMetaphone38.maxCodeLen;
        int int59 = org.apache.commons.codec.language.SoundexUtils.difference((org.apache.commons.codec.StringEncoder) doubleMetaphone38, "hi!H hi!\000", "\000hi!H hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone38);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "H" + "'", obj49, "H");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }
}

