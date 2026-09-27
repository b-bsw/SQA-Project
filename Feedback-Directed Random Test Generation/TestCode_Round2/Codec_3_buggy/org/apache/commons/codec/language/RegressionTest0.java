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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = doubleMetaphone0.encode((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = doubleMetaphone0.encode((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass2 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.Class<?> wildcardClass5 = doubleMetaphone0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult6 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = doubleMetaphoneResult4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.encode("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = doubleMetaphone0.encode((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String[] strArray13 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (-1), strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone5 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int6 = doubleMetaphone5.maxCodeLen;
        java.lang.String str8 = doubleMetaphone5.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone5.isDoubleMetaphoneEqual("H", "H", true);
        int int13 = doubleMetaphone5.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone5.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult15.append("\000", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        int int7 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone4 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str6 = doubleMetaphone4.doubleMetaphone("hi!");
        doubleMetaphone4.setMaxCodeLen((-1));
        java.lang.String str10 = doubleMetaphone4.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "H");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        java.lang.Class<?> wildcardClass12 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        java.lang.Class<?> wildcardClass18 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.appendPrimary("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000a", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.encode("");
        doubleMetaphone0.maxCodeLen = (short) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = doubleMetaphone0.encode("H");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\000a4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String[] strArray10 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (byte) 1, (int) (byte) -1, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = doubleMetaphone0.encode(obj5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append("\000", "A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        boolean boolean21 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str23 = doubleMetaphone17.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult25 = doubleMetaphone17.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult25.append("H", "\000a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) "\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        java.lang.String str14 = doubleMetaphone11.doubleMetaphone("");
        boolean boolean18 = doubleMetaphone11.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str21 = doubleMetaphone11.doubleMetaphone("H", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean14 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "", true);
        boolean boolean17 = doubleMetaphone9.isDoubleMetaphoneEqual("A", "H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int7 = doubleMetaphone6.maxCodeLen;
        boolean boolean10 = doubleMetaphone6.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str12 = doubleMetaphone6.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone6.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult14.append('\000');
        doubleMetaphoneResult14.append('a');
        doubleMetaphoneResult14.append("", "\000");
        java.lang.String str22 = doubleMetaphoneResult14.getPrimary();
        doubleMetaphoneResult14.append("4");
        doubleMetaphoneResult14.appendPrimary("hi!");
        boolean boolean27 = doubleMetaphoneResult14.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a" + "'", str22, "\000a");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        java.lang.Class<?> wildcardClass15 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass14 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.append("\000a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("hi!", false);
        int int17 = doubleMetaphone10.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone10.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = doubleMetaphone0.encode((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult15.append("\0004");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String[] strArray10 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (short) 10, (int) (byte) -1, strArray10);
        java.lang.Class<?> wildcardClass13 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        char char12 = doubleMetaphone0.charAt("\0004", (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        java.lang.String str13 = doubleMetaphone10.doubleMetaphone("");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("hi!", false);
        int int17 = doubleMetaphone10.maxCodeLen;
        boolean boolean21 = doubleMetaphone10.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str23 = doubleMetaphone10.encode("4");
        doubleMetaphone10.setMaxCodeLen((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H" + "'", str16, "H");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean13 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str15 = doubleMetaphone9.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone9.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult17.append('\000');
        doubleMetaphoneResult17.append('a');
        java.lang.String str22 = doubleMetaphoneResult17.getAlternate();
        doubleMetaphoneResult17.appendAlternate("H");
        doubleMetaphoneResult17.appendAlternate('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a" + "'", str22, "\000a");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (byte) 1, (int) 'i', strArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) (short) 0, (-1), strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append("", "\000a4h");
        doubleMetaphoneResult10.appendAlternate("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("");
        boolean boolean20 = doubleMetaphone13.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str22 = doubleMetaphone13.doubleMetaphone("");
        int int23 = doubleMetaphone13.maxCodeLen;
        java.lang.Class<?> wildcardClass24 = doubleMetaphone13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000");
        java.lang.Class<?> wildcardClass11 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        java.lang.String str7 = doubleMetaphone0.encode("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("hi!", false);
        int int15 = doubleMetaphone8.maxCodeLen;
        boolean boolean19 = doubleMetaphone8.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str21 = doubleMetaphone8.encode("4");
        doubleMetaphone8.setMaxCodeLen((int) (byte) 1);
        int int24 = doubleMetaphone8.maxCodeLen;
        java.lang.String str26 = doubleMetaphone8.encode("\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult18.append('\000');
        doubleMetaphoneResult18.append('a');
        doubleMetaphoneResult18.append("", "\000");
        java.lang.String str26 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append("4");
        doubleMetaphoneResult18.appendPrimary("hi!");
        boolean boolean31 = doubleMetaphoneResult18.isComplete();
        doubleMetaphoneResult18.appendAlternate("\000a\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a" + "'", str26, "\000a");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = doubleMetaphone0.encode((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 10, (int) '#', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendAlternate('\000');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000" + "'", str16, "\000\000");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        boolean boolean3 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aA");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        java.lang.String str17 = doubleMetaphone14.doubleMetaphone("");
        boolean boolean21 = doubleMetaphone14.isDoubleMetaphoneEqual("H", "H", true);
        int int22 = doubleMetaphone14.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone14.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str26 = doubleMetaphone14.encode("H");
        char char29 = doubleMetaphone14.charAt("hi!", (int) (short) 0);
        char char32 = doubleMetaphone14.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = doubleMetaphone0.encode((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + 'h' + "'", char29 == 'h');
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '\000' + "'", char32 == '\000');
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\000a4 ", (int) (byte) 1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray25);
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (byte) 1, (int) 'i', strArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = doubleMetaphone0.encode((java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.appendAlternate('\000');
        java.lang.String str18 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#H" + "'", str18, "#H");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 4;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        int int13 = doubleMetaphone11.getMaxCodeLen();
        char char16 = doubleMetaphone11.charAt("\000a", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append('h', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.appendPrimary("\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000a4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        doubleMetaphoneResult8.appendPrimary('#');
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a\000a" + "'", str20, "\000a\000a");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = doubleMetaphone0.encode(obj9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult19.append("H", "\000a");
        doubleMetaphoneResult19.append("4");
        doubleMetaphoneResult19.append('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String[] strArray9 = new java.lang.String[] { "4#", "\000", "\000", "\000#", "\000a\000a", "4" };
        boolean boolean10 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000#", (int) ' ', (int) 'h', strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4#", "\000", "\000", "\000#", "\000a\000a", "4" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = doubleMetaphone0.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone6 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int7 = doubleMetaphone6.maxCodeLen;
        boolean boolean11 = doubleMetaphone6.isDoubleMetaphoneEqual("H", "\000a", true);
        int int12 = doubleMetaphone6.maxCodeLen;
        int int13 = doubleMetaphone6.maxCodeLen;
        doubleMetaphone6.setMaxCodeLen((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = doubleMetaphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "H");
        int int12 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        boolean boolean19 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone7 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int8 = doubleMetaphone7.maxCodeLen;
        boolean boolean11 = doubleMetaphone7.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str13 = doubleMetaphone7.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone7.new DoubleMetaphoneResult(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("4#");
        doubleMetaphoneResult8.appendAlternate("\000#");
        java.lang.Class<?> wildcardClass30 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000ah", "4");
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        java.lang.Class<?> wildcardClass23 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA\000" + "'", str22, "\000aA\000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char13 = doubleMetaphone10.charAt("", (int) (byte) 10);
        java.lang.String str15 = doubleMetaphone10.doubleMetaphone("H");
        int int16 = doubleMetaphone10.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult((int) 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String[] strArray13 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean14 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray13);
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray13);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) 'a', strArray13);
        java.lang.Class<?> wildcardClass17 = strArray13.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.appendPrimary('h');
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000a");
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.appendAlternate("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        java.lang.String str15 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\000" + "'", str15, "\000\000");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char13 = doubleMetaphone10.charAt("", (int) (byte) 10);
        java.lang.String str15 = doubleMetaphone10.doubleMetaphone("H");
        char char18 = doubleMetaphone10.charAt("", 1);
        int int19 = doubleMetaphone10.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone10.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone10.new DoubleMetaphoneResult(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.append("hi!");
        java.lang.String str23 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4" + "'", str19, "\000a4");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str18 = doubleMetaphoneResult17.getAlternate();
        java.lang.String str19 = doubleMetaphoneResult17.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000ah", "\000\0004#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        java.lang.Class<?> wildcardClass14 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.append('4', '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("4#");
        java.lang.String str28 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("hi!", "\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000a4h" + "'", str28, "\000a4h");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("a", (int) (byte) 0, (int) '\000', strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendPrimary("\000a\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = doubleMetaphone0.doubleMetaphone("4\000a", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate('#');
        doubleMetaphoneResult7.appendAlternate("\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass8 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        java.lang.String str21 = doubleMetaphoneResult20.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        int int22 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int24 = doubleMetaphone23.maxCodeLen;
        boolean boolean27 = doubleMetaphone23.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str29 = doubleMetaphone23.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult31 = doubleMetaphone23.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult31.append('\000');
        doubleMetaphoneResult31.append('a');
        java.lang.String str36 = doubleMetaphoneResult31.getAlternate();
        doubleMetaphoneResult31.appendPrimary("H");
        doubleMetaphoneResult31.append('h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) 'h');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\000a" + "'", str36, "\000a");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000aHa", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AH" + "'", str19, "AH");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.encode("H");
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ", false);
        int int9 = doubleMetaphone0.maxCodeLen;
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "4");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000a4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('h');
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        char char20 = doubleMetaphone0.charAt("\000aa4", (int) 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult9.append("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) ' ', (int) '\000', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        char char17 = doubleMetaphone0.charAt("\000aA", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone0.new DoubleMetaphoneResult(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("A", "A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4h" + "'", str21, "\000a4h");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        doubleMetaphone0.maxCodeLen = 'i';
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.String str12 = doubleMetaphone0.encode("a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "H4a\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        boolean boolean17 = doubleMetaphone13.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str19 = doubleMetaphone13.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone13.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult21.append('\000');
        doubleMetaphoneResult21.append('a');
        doubleMetaphoneResult21.appendAlternate("\000a");
        doubleMetaphoneResult21.append("A", "hi!");
        java.lang.String str31 = doubleMetaphoneResult21.getPrimary();
        doubleMetaphoneResult21.append("\000ah", "4");
        java.lang.String str35 = doubleMetaphoneResult21.getPrimary();
        doubleMetaphoneResult21.append('\000');
        java.lang.String str38 = doubleMetaphoneResult21.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000aA" + "'", str31, "\000aA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\000aA\000" + "'", str35, "\000aA\000");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\000a\000a" + "'", str38, "\000a\000a");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        int int15 = doubleMetaphone10.getMaxCodeLen();
        boolean boolean18 = doubleMetaphone10.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str20 = doubleMetaphone10.doubleMetaphone("A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) "A");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "A" + "'", str20, "A");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        java.lang.Class<?> wildcardClass13 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        doubleMetaphoneResult8.append("\000a\000", "\000a4 ");
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000a4 ", "\000\000");
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphoneResult7.append('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("H", "\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000" + "'", str17, "\000\000\000");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.appendAlternate('\000');
        java.lang.String str16 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000\000" + "'", str16, "\000\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000" + "'", str17, "\000\000");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.appendPrimary("\000aA");
        doubleMetaphoneResult8.appendAlternate('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("H", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("4\000a", "\000aAi", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone9 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int10 = doubleMetaphone9.maxCodeLen;
        boolean boolean13 = doubleMetaphone9.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str15 = doubleMetaphone9.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone9.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult17.append('\000');
        doubleMetaphoneResult17.append('a');
        doubleMetaphoneResult17.append("", "\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        doubleMetaphone0.maxCodeLen = (short) 100;
        java.lang.String str15 = doubleMetaphone0.encode("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.append("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 1, (int) ' ', strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a4", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        char char26 = doubleMetaphone0.charAt("\000a4", (int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = doubleMetaphoneResult11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H4a" + "'", str16, "H4a");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4", "a4\000a", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4" + "'", str21, "\000a4");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000", true);
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append("\000a4", "\000\000");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000a" + "'", str24, "\000a\000a");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("\000aa");
        java.lang.Class<?> wildcardClass25 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.String str16 = doubleMetaphone0.encode("\000\000\000");
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000aHa", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AH" + "'", str19, "AH");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\0004", (int) '\000');
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("#H", "\000aa4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.appendPrimary("\000aA");
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000aa");
        int int18 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("H4a", "\000aA\000", true);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append("\000a4", "\000\000");
        java.lang.Class<?> wildcardClass24 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append("\000\0004#", "4##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000a4 ", "4#4");
        doubleMetaphoneResult10.appendPrimary(' ');
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        boolean boolean15 = doubleMetaphone11.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str17 = doubleMetaphone11.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult19 = doubleMetaphone11.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult19.append('\000');
        doubleMetaphoneResult19.append('a');
        doubleMetaphoneResult19.append("", "\000");
        java.lang.String str27 = doubleMetaphoneResult19.getPrimary();
        doubleMetaphoneResult19.append("4");
        doubleMetaphoneResult19.append(' ');
        java.lang.String str32 = doubleMetaphoneResult19.getPrimary();
        doubleMetaphoneResult19.append("\000");
        doubleMetaphoneResult19.appendPrimary('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000a" + "'", str27, "\000a");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\000a4 " + "'", str32, "\000a4 ");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        int int12 = doubleMetaphone10.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone10.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult14.append('\000', '#');
        java.lang.String str18 = doubleMetaphoneResult14.getAlternate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("");
        boolean boolean15 = doubleMetaphone8.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone8.new DoubleMetaphoneResult((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) -1, (int) (short) 100, strArray14);
        java.lang.Class<?> wildcardClass18 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000aAi");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        java.lang.String str15 = doubleMetaphone0.encode("\000#");
        int int16 = doubleMetaphone0.maxCodeLen;
        int int17 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendAlternate("\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult18.append('\000');
        java.lang.String str21 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append("4");
        java.lang.String str24 = doubleMetaphoneResult18.getAlternate();
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) str24);
        java.lang.String str28 = doubleMetaphone0.doubleMetaphone("a", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\0004" + "'", str24, "\0004");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A" + "'", str28, "A");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "H" };
        boolean boolean6 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", (-1), (int) (byte) 0, strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "H" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\000a", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String[] strArray16 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray16);
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray16);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) 'a', strArray16);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) (short) 10, (int) (short) 10, strArray16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('#');
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000#" + "'", str16, "\000#");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        doubleMetaphoneResult10.append("H");
        boolean boolean16 = doubleMetaphoneResult10.isComplete();
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult16.append("\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        int int15 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = doubleMetaphone0.doubleMetaphone("\000a4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.append("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult14.appendAlternate("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) '#', 100, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a", (int) (short) -1, 100, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendAlternate("a4\000a");
        doubleMetaphoneResult8.append("4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        int int7 = doubleMetaphone0.getMaxCodeLen();
        char char10 = doubleMetaphone0.charAt("\0004", (int) '\000');
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000ah");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.doubleMetaphone("");
        boolean boolean22 = doubleMetaphone15.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str24 = doubleMetaphone15.doubleMetaphone("\000a");
        boolean boolean28 = doubleMetaphone15.isDoubleMetaphoneEqual("H", "A", true);
        char char31 = doubleMetaphone15.charAt("\000a4h", (-1));
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone15.new DoubleMetaphoneResult((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "A" + "'", str24, "A");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate('i');
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.appendPrimary("4##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult12.append("\000a");
        doubleMetaphoneResult12.appendPrimary("\000aAi");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        boolean boolean21 = doubleMetaphone17.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str23 = doubleMetaphone17.doubleMetaphone("");
        doubleMetaphone17.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone17.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult27.append('#', '4');
        doubleMetaphoneResult27.appendPrimary(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000a\000\000", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        java.lang.String str18 = doubleMetaphone15.doubleMetaphone("");
        doubleMetaphone15.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone15.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean23 = doubleMetaphoneResult22.isComplete();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        char char20 = doubleMetaphone0.charAt("H4a", (int) (byte) -1);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000a\000");
        java.lang.String str23 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a\0004" + "'", str23, "\000a\0004");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        java.lang.String str19 = doubleMetaphone0.encode("\000a\000");
        doubleMetaphone0.setMaxCodeLen(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        char char19 = doubleMetaphone0.charAt("4", (int) (short) 10);
        java.lang.String str21 = doubleMetaphone0.encode("\000aHa");
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AH" + "'", str21, "AH");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult9 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult9.appendPrimary('i');
        doubleMetaphoneResult9.appendAlternate("\000aHa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000ah");
        java.lang.Class<?> wildcardClass20 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append("4##");
        java.lang.String str26 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000aHa" + "'", str26, "\000aHa");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('h', '4');
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\0004" + "'", str19, "\000a\0004");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendAlternate('\000');
        java.lang.Class<?> wildcardClass12 = doubleMetaphoneResult7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("");
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendPrimary('a');
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\0004a" + "'", str18, "\0004a");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.append("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("hi!", false);
        java.lang.String str16 = doubleMetaphone8.doubleMetaphone("A");
        java.lang.String str18 = doubleMetaphone8.doubleMetaphone("\000a");
        int int19 = doubleMetaphone8.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone8.new DoubleMetaphoneResult((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone8.new DoubleMetaphoneResult((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        java.lang.Class<?> wildcardClass6 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone11 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int12 = doubleMetaphone11.maxCodeLen;
        int int13 = doubleMetaphone11.getMaxCodeLen();
        char char16 = doubleMetaphone11.charAt("\000a", (int) (byte) 10);
        java.lang.String str18 = doubleMetaphone11.doubleMetaphone("H");
        int int19 = doubleMetaphone11.getMaxCodeLen();
        java.lang.String str21 = doubleMetaphone11.encode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        java.lang.String str14 = doubleMetaphoneResult13.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        java.lang.String str18 = doubleMetaphoneResult10.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        doubleMetaphone0.setMaxCodeLen(0);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        boolean boolean16 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str18 = doubleMetaphone12.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone12.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.append('\000');
        doubleMetaphoneResult20.append('a');
        doubleMetaphoneResult20.appendAlternate("\000a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        int int5 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "a4\000a");
        char char14 = doubleMetaphone0.charAt("4H", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + 'H' + "'", char14 == 'H');
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char20 = doubleMetaphone0.charAt("#", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.Class<?> wildcardClass8 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "\000aa4");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('a', 'h');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult14.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('4');
        doubleMetaphoneResult7.append(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        int int6 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult8.appendPrimary("\000a\0004");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000", "A");
        doubleMetaphoneResult8.append(' ', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000\0004#", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("A", (int) 'h', (int) '\000', strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, 4, strArray17);
        java.lang.Class<?> wildcardClass22 = strArray17.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append("");
        doubleMetaphoneResult10.appendAlternate("\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str12 = doubleMetaphone0.encode("H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.append("4##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000a\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        char char20 = doubleMetaphone0.charAt("H4a", (int) (byte) -1);
        int int21 = doubleMetaphone0.maxCodeLen;
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("#", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = doubleMetaphone0.encode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a4");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass10 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = 'h';
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\0004");
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.appendPrimary("\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        boolean boolean15 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aHa");
        doubleMetaphoneResult8.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str14 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        doubleMetaphoneResult12.appendAlternate('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        char char20 = doubleMetaphone0.charAt("H4a", (int) (byte) -1);
        boolean boolean24 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "a4\000a", false);
        boolean boolean28 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000aA\000", true);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone29 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int30 = doubleMetaphone29.maxCodeLen;
        java.lang.String str32 = doubleMetaphone29.doubleMetaphone("");
        java.lang.String str35 = doubleMetaphone29.doubleMetaphone("hi!", false);
        java.lang.String str37 = doubleMetaphone29.doubleMetaphone("A");
        java.lang.String str39 = doubleMetaphone29.doubleMetaphone("\000a");
        int int40 = doubleMetaphone29.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult42 = doubleMetaphone29.new DoubleMetaphoneResult((int) 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = doubleMetaphone0.encode((java.lang.Object) 'h');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\000' + "'", char20 == '\000');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "H" + "'", str35, "H");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "A" + "'", str37, "A");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "A" + "'", str39, "A");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.append('i', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String[] strArray10 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean11 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray10);
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA", 0, (int) '4', strArray10);
        java.lang.Class<?> wildcardClass13 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\0004" + "'", str24, "\000a\0004");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendPrimary("\000a4");
        doubleMetaphoneResult7.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('\000');
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000a\000");
        doubleMetaphoneResult8.appendPrimary('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult20.append('a', '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        java.lang.String[] strArray27 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray27);
        boolean boolean29 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray27);
        boolean boolean30 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) strArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("a4\000a", (int) ' ', 97, strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        doubleMetaphone0.maxCodeLen = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str12 = doubleMetaphone0.encode("\0004");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("");
        java.lang.String str19 = doubleMetaphone13.doubleMetaphone("hi!", false);
        java.lang.String str22 = doubleMetaphone13.doubleMetaphone("\000\000\000", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) str22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "H" + "'", str19, "H");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        int int20 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "\000");
        java.lang.String[] strArray25 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray25);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) (short) 10, (int) (byte) -1, strArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        doubleMetaphoneResult4.appendAlternate('#');
        doubleMetaphoneResult4.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        doubleMetaphone0.maxCodeLen = (short) -1;
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000\000");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "\000aa4");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphoneResult13.append(' ', 'H');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult7.appendPrimary("\000a\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "H");
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\0004", true);
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.maxCodeLen = 105;
        doubleMetaphone0.maxCodeLen = (short) 100;
        char char24 = doubleMetaphone0.charAt("AH", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'H' + "'", char24 == 'H');
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult18.append('\000');
        java.lang.String str21 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append("4");
        java.lang.String str24 = doubleMetaphoneResult18.getAlternate();
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) str24);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 100);
        java.lang.String str28 = doubleMetaphoneResult27.getPrimary();
        doubleMetaphoneResult27.append("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\0004" + "'", str24, "\0004");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean12 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray11);
        boolean boolean13 = org.apache.commons.codec.language.DoubleMetaphone.contains("4", (int) (short) 0, 97, strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("H");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str10 = doubleMetaphone0.encode("");
        java.lang.String str12 = doubleMetaphone0.encode("\0004a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("\000a4h", (int) '4');
        int int12 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((-1));
        int int15 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = doubleMetaphone0.encode("\000aAi");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        java.lang.String str11 = doubleMetaphoneResult8.getAlternate();
        boolean boolean12 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String[] strArray22 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", 1, (int) ' ', strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a", (int) (byte) 10, (int) 'i', strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", 0, (int) (byte) 1, strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000a", 10, (int) (short) 100, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("hi!", (int) (short) 1, (int) (short) -1, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 1, end 0, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        java.lang.Class<?> wildcardClass6 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H");
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendPrimary("\000aAi");
        doubleMetaphoneResult8.appendAlternate("\000aHa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        doubleMetaphone10.setMaxCodeLen(100);
        boolean boolean21 = doubleMetaphone10.isDoubleMetaphoneEqual("\000a", "H");
        java.lang.Object obj22 = doubleMetaphone0.encode((java.lang.Object) "H");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone23 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int24 = doubleMetaphone23.maxCodeLen;
        java.lang.String str26 = doubleMetaphone23.doubleMetaphone("");
        java.lang.String str29 = doubleMetaphone23.doubleMetaphone("hi!", false);
        int int30 = doubleMetaphone23.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) int30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "" + "'", obj22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "H" + "'", str29, "H");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = (short) 1;
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "A", true);
        java.lang.Class<?> wildcardClass15 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "#\000");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        char char9 = doubleMetaphone0.charAt("4", (int) (byte) 1);
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA", "\000a4 ");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        char char18 = doubleMetaphone0.charAt("\000\000\000", 0);
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getAlternate();
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('\000');
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('a', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a\000" + "'", str17, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.append('4', '4');
        java.lang.Class<?> wildcardClass22 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000");
        doubleMetaphone0.maxCodeLen = 'a';
        int int15 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        boolean boolean15 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("\000aHa");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000a\000a" + "'", str20, "\000a\000a");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000\000");
        doubleMetaphone0.maxCodeLen = 'a';
        char char17 = doubleMetaphone0.charAt("\000\000", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = (byte) 0;
        doubleMetaphone0.maxCodeLen = 105;
        doubleMetaphone0.maxCodeLen = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str8 = doubleMetaphoneResult7.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        char char8 = doubleMetaphone0.charAt("", 1);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        int int15 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000\000");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone19 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int20 = doubleMetaphone19.maxCodeLen;
        java.lang.String str22 = doubleMetaphone19.doubleMetaphone("");
        boolean boolean26 = doubleMetaphone19.isDoubleMetaphoneEqual("H", "H", true);
        int int27 = doubleMetaphone19.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult29 = doubleMetaphone19.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult29.appendPrimary('\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        char char18 = doubleMetaphone0.charAt("\000a", 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult20.append("\000a4 ");
        boolean boolean23 = doubleMetaphoneResult20.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        doubleMetaphone0.maxCodeLen = 0;
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aA", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append("\000a\0004");
        doubleMetaphoneResult8.appendAlternate("\000aA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(97);
        doubleMetaphoneResult15.appendAlternate(' ');
        doubleMetaphoneResult15.appendAlternate("AH");
        doubleMetaphoneResult15.appendAlternate("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a\0004" + "'", str22, "\000a\0004");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) -1, (int) (short) 100, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aAi", 35, (int) 'h', strArray17);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        java.lang.String str9 = doubleMetaphone0.encode("\000aA\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', 'a');
        java.lang.String str14 = doubleMetaphoneResult10.getPrimary();
        doubleMetaphoneResult10.append('a', 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        java.lang.String str15 = doubleMetaphone0.encode("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("4##", (int) (short) 10);
        int int20 = doubleMetaphone0.maxCodeLen;
        java.lang.Class<?> wildcardClass21 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        char char9 = doubleMetaphone0.charAt("\000a4", (int) '\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(32);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult11 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        doubleMetaphoneResult11.appendPrimary('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000ah");
        int int20 = doubleMetaphone0.maxCodeLen;
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000a 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphone0.maxCodeLen = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone8 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int9 = doubleMetaphone8.maxCodeLen;
        java.lang.String str11 = doubleMetaphone8.doubleMetaphone("");
        java.lang.String str14 = doubleMetaphone8.doubleMetaphone("hi!", false);
        int int15 = doubleMetaphone8.maxCodeLen;
        boolean boolean19 = doubleMetaphone8.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str21 = doubleMetaphone8.encode("4");
        doubleMetaphone8.setMaxCodeLen((int) (byte) 1);
        int int24 = doubleMetaphone8.maxCodeLen;
        java.lang.String str26 = doubleMetaphone8.encode("\000");
        boolean boolean29 = doubleMetaphone8.isDoubleMetaphoneEqual("4#", "\000aHa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = doubleMetaphone0.encode((java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "H" + "'", str14, "H");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aHa");
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("\000a4h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        java.lang.String str7 = doubleMetaphone0.encode("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000h", "\000a\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 32;
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append('h', 'H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        java.lang.String str17 = doubleMetaphone0.encode("a4\000a");
        java.lang.String str19 = doubleMetaphone0.encode("\000a\000");
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "\0004");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult24 = doubleMetaphone0.new DoubleMetaphoneResult(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("4##", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000a 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000a");
        doubleMetaphoneResult8.appendAlternate('i');
        java.lang.String str29 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a4 " + "'", str24, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a\0004" + "'", str29, "\000a\0004");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('h', 'a');
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        java.lang.Class<?> wildcardClass21 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000ah" + "'", str20, "\000ah");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (-1), (int) (short) 1, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) -1, (int) (short) 100, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4#", 0, (-1), strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        doubleMetaphoneResult13.appendAlternate('4');
        java.lang.String str16 = doubleMetaphoneResult13.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4 ", (-1), (int) '#', strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = (byte) 1;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\0004", false);
        int int21 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        doubleMetaphone0.maxCodeLen = 'a';
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aA\000", "A");
        java.lang.String str11 = doubleMetaphone0.encode("hi!");
        java.lang.Object obj13 = doubleMetaphone0.encode((java.lang.Object) "\000a4H");
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "A" + "'", obj13, "A");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "A" + "'", str15, "A");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.appendPrimary('\000');
        doubleMetaphoneResult10.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str2 = doubleMetaphone0.doubleMetaphone("hi!");
        doubleMetaphone0.setMaxCodeLen((-1));
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("\000");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aHa", "\000a44", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4h", "\000a4");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone13 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int14 = doubleMetaphone13.maxCodeLen;
        java.lang.String str16 = doubleMetaphone13.doubleMetaphone("");
        java.lang.String str18 = doubleMetaphone13.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone13.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult20.append("\000a", "4");
        java.lang.String str24 = doubleMetaphoneResult20.getAlternate();
        java.lang.String str25 = doubleMetaphoneResult20.getAlternate();
        doubleMetaphoneResult20.appendAlternate('i');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = doubleMetaphone0.encode((java.lang.Object) 'i');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4" + "'", str25, "4");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        char char16 = doubleMetaphone0.charAt("\000aA\000", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000a4h", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getAlternate();
        doubleMetaphoneResult4.append('i', '\000');
        doubleMetaphoneResult4.append('a', '\000');
        doubleMetaphoneResult4.append('h');
        doubleMetaphoneResult4.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('4', 'a');
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('\000');
        java.lang.Class<?> wildcardClass26 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("\000a#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\0004" + "'", str16, "\0004");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000a4 ", "4#4");
        doubleMetaphoneResult10.append("a", "\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aH\000", true);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("H4a\000");
        doubleMetaphoneResult8.append("a4\000a", "\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "", true);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000a\000");
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.append("4#");
        doubleMetaphoneResult8.appendAlternate("\000#");
        doubleMetaphoneResult8.appendPrimary("# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult16.appendPrimary("\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        int int14 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.append(" Ai", "4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        doubleMetaphoneResult10.appendAlternate("4");
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append('\000', '#');
        doubleMetaphoneResult10.append("\000a4 ", "4#4");
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendPrimary("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 10;
        doubleMetaphone0.maxCodeLen = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        doubleMetaphoneResult8.append('a', 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        boolean boolean6 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\0004");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        int int15 = doubleMetaphone0.maxCodeLen;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.encode("\000aAi");
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000ah");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a4 ", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone15 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int16 = doubleMetaphone15.maxCodeLen;
        boolean boolean19 = doubleMetaphone15.isDoubleMetaphoneEqual("hi!", "");
        int int20 = doubleMetaphone15.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone15.new DoubleMetaphoneResult((int) (byte) -1);
        char char25 = doubleMetaphone15.charAt("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphone15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'i' + "'", char25 == 'i');
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.append("", "\000a\000a");
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append('\000');
        java.lang.Class<?> wildcardClass27 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.appendAlternate("#H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('a');
        java.lang.String str24 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\000\000" + "'", str24, "\000a\000\000");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        boolean boolean12 = doubleMetaphoneResult7.isComplete();
        doubleMetaphoneResult7.append('\000', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        java.lang.String str9 = doubleMetaphoneResult4.getPrimary();
        doubleMetaphoneResult4.appendPrimary("4#");
        doubleMetaphoneResult4.appendAlternate('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        doubleMetaphoneResult8.appendPrimary("\000a\000\000");
        doubleMetaphoneResult8.appendAlternate('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult20 = doubleMetaphone0.new DoubleMetaphoneResult(1);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        java.lang.String str24 = doubleMetaphone0.doubleMetaphone("#\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append("H", "\000a");
        doubleMetaphoneResult8.append("4");
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("H");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append("4\000a");
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a4" + "'", str14, "\000a4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a4H" + "'", str19, "\000a4H");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a4H" + "'", str22, "\000a4H");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        doubleMetaphoneResult8.append("\000aA", "\000a4h");
        doubleMetaphoneResult8.append("", "\000a\000a");
        boolean boolean23 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("4H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.append('a', 'h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a", "4#4", false);
        java.lang.String str23 = doubleMetaphone0.doubleMetaphone("4#4", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary('h');
        doubleMetaphoneResult8.appendAlternate('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        doubleMetaphone0.setMaxCodeLen((int) (short) 1);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aa", false);
        java.lang.String str25 = doubleMetaphone0.doubleMetaphone("\000a44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "A" + "'", str25, "A");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str13 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate("H4a");
        java.lang.Class<?> wildcardClass16 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000");
        java.lang.String str24 = doubleMetaphoneResult8.getAlternate();
        boolean boolean25 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4 " + "'", str21, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\000a\0004" + "'", str24, "\000a\0004");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        doubleMetaphoneResult8.append('h', 'a');
        doubleMetaphoneResult8.appendAlternate('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("H");
        java.lang.String str21 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("4##", "");
        doubleMetaphoneResult10.append("\000a#", "\000aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        char char12 = doubleMetaphone0.charAt("\000aa4", (int) (byte) 10);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("", (int) (byte) 10);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("H");
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.encode("\000aA");
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4", "a");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a#", "\000a\000");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\000' + "'", char3 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000", false);
        doubleMetaphone0.maxCodeLen = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        int int17 = doubleMetaphone0.maxCodeLen;
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.maxCodeLen = 0;
        int int14 = doubleMetaphone0.maxCodeLen;
        java.lang.String str16 = doubleMetaphone0.encode("\000aAi");
        doubleMetaphone0.maxCodeLen = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = doubleMetaphone0.doubleMetaphone("\000aAh", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append("4##");
        doubleMetaphoneResult8.appendAlternate("4hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        boolean boolean10 = doubleMetaphoneResult7.isComplete();
        java.lang.String str11 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendAlternate('4');
        doubleMetaphoneResult7.appendPrimary("\000aH\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append('4');
        doubleMetaphoneResult8.appendAlternate("\000a4h");
        doubleMetaphoneResult8.append("\000\000\000", "\000\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        doubleMetaphone0.maxCodeLen = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = doubleMetaphone0.doubleMetaphone("#\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult10.append('#', '4');
        doubleMetaphoneResult10.appendPrimary(' ');
        doubleMetaphoneResult10.append('4');
        java.lang.String str18 = doubleMetaphoneResult10.getPrimary();
        java.lang.Class<?> wildcardClass19 = doubleMetaphoneResult10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "# 4" + "'", str18, "# 4");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a');
        java.lang.String str20 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000aa" + "'", str20, "\000aa");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.appendPrimary("\000a4");
        doubleMetaphoneResult8.append("\000a44", "\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.append("\000a");
        java.lang.String str25 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str26 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000a4h" + "'", str25, "\000a4h");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\000a\0004" + "'", str26, "\000a\0004");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen(0);
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4 ", "\000ah");
        java.lang.String str15 = doubleMetaphone0.encode("\000#");
        int int16 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) 'i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000a4h" + "'", str21, "\000a4h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a4h" + "'", str22, "\000a4h");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('\000', 'h');
        java.lang.String str18 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str19 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000ah" + "'", str18, "\000ah");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\000" + "'", str19, "\000a\000");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean18 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray17);
        boolean boolean19 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (short) 10, (int) (short) 10, strArray17);
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", (int) 'i', 4, strArray17);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aHa", (int) '#', 100, strArray17);
        java.lang.Class<?> wildcardClass22 = strArray17.getClass();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.setMaxCodeLen((int) 'h');
        doubleMetaphone0.maxCodeLen = 0;
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("a4\000a", "\000aAh", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendPrimary("\000\000\000");
        doubleMetaphoneResult7.appendPrimary("\000aa");
        doubleMetaphoneResult7.appendAlternate("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.appendAlternate("H");
        doubleMetaphoneResult7.appendAlternate('\000');
        doubleMetaphoneResult7.appendPrimary("#H");
        doubleMetaphoneResult7.appendAlternate('a');
        java.lang.String str16 = doubleMetaphoneResult7.getPrimary();
        doubleMetaphoneResult7.appendPrimary('h');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#H" + "'", str16, "#H");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4", (int) '#', (int) (short) 0, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        java.lang.String str17 = doubleMetaphone0.encode("\000a4h");
        java.lang.String str19 = doubleMetaphone0.encode("aH");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000ahi", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a");
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "A", true);
        char char16 = doubleMetaphone0.charAt("\000a4h", (-1));
        int int17 = doubleMetaphone0.maxCodeLen;
        int int18 = doubleMetaphone0.getMaxCodeLen();
        java.lang.Class<?> wildcardClass19 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult(100);
        boolean boolean14 = doubleMetaphoneResult13.isComplete();
        doubleMetaphoneResult13.append("\000a\0004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.append('\000', '#');
        java.lang.String str8 = doubleMetaphoneResult4.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\000" + "'", str8, "\000");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000', '#');
        java.lang.String str14 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary(' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000#" + "'", str14, "\000#");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        char char7 = doubleMetaphone0.charAt("", (int) (byte) 100);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4h", false);
        java.lang.String str12 = doubleMetaphone0.encode("4#");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            doubleMetaphoneResult16.appendAlternate("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 0);
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        char char13 = doubleMetaphone0.charAt("\000\000\000", (int) (byte) -1);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        int int16 = doubleMetaphone14.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone14.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult18.append('\000', '#');
        java.lang.String str22 = doubleMetaphoneResult18.getAlternate();
        doubleMetaphoneResult18.append('i', '\000');
        doubleMetaphoneResult18.append('a', '\000');
        doubleMetaphoneResult18.append('h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = doubleMetaphone0.encode((java.lang.Object) 'h');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#" + "'", str22, "#");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        int int11 = doubleMetaphone0.getMaxCodeLen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        doubleMetaphoneResult8.append(' ', '4');
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendPrimary("\000a#\000");
        java.lang.String str30 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str31 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a4 " + "'", str30, "\000a4 ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000a4 " + "'", str31, "\000a4 ");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\000" + "'", str17, "\000\000\000");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        java.lang.String str14 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\000a" + "'", str14, "\000a");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = doubleMetaphone0.encode("\000a");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        int int16 = doubleMetaphone0.getMaxCodeLen();
        char char19 = doubleMetaphone0.charAt("4", (int) (short) 10);
        java.lang.String str21 = doubleMetaphone0.encode("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult23 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 1);
        boolean boolean26 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah4", "\000aAi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A" + "'", str21, "A");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        java.lang.String str15 = doubleMetaphone0.doubleMetaphone("\000\0004#");
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult16 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        java.lang.String str20 = doubleMetaphone17.doubleMetaphone("");
        boolean boolean24 = doubleMetaphone17.isDoubleMetaphoneEqual("H", "H", true);
        int int25 = doubleMetaphone17.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult27 = doubleMetaphone17.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str29 = doubleMetaphone17.encode("H");
        java.lang.String str31 = doubleMetaphone17.doubleMetaphone("A");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult33 = doubleMetaphone17.new DoubleMetaphoneResult((int) 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult33);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "A" + "'", str31, "A");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendAlternate("4#");
        java.lang.String str20 = doubleMetaphoneResult8.getAlternate();
        boolean boolean21 = doubleMetaphoneResult8.isComplete();
        java.lang.String str22 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\000\0004#" + "'", str20, "\000\0004#");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000\0004#" + "'", str22, "\000\0004#");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphoneResult7.append("\000a", "4");
        java.lang.String str11 = doubleMetaphoneResult7.getAlternate();
        java.lang.String str12 = doubleMetaphoneResult7.getAlternate();
        doubleMetaphoneResult7.appendAlternate(" Ai");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String[] strArray22 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray22);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray22);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\0004", 4, (int) (byte) 10, strArray22);
        boolean boolean26 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000ah", (int) (short) 0, (int) 'h', strArray22);
        boolean boolean27 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000aA\000", 35, 105, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a 4", (int) (byte) 0, (int) (short) -1, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        doubleMetaphoneResult10.append("H", "\000a4");
        doubleMetaphoneResult10.appendAlternate('i');
        java.lang.String str22 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('i');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.appendPrimary("");
        boolean boolean9 = doubleMetaphoneResult4.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a4", false);
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        boolean boolean16 = doubleMetaphoneResult8.isComplete();
        java.lang.String str17 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000a" + "'", str17, "\000a");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000\000A");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.append(' ');
        doubleMetaphoneResult8.appendAlternate("\0004");
        java.lang.String str23 = doubleMetaphoneResult8.getPrimary();
        boolean boolean24 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000a4 " + "'", str23, "\000a4 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("hi!", "hi!");
        doubleMetaphoneResult8.appendAlternate("");
        doubleMetaphoneResult8.appendAlternate('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean15 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray14);
        boolean boolean16 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray14);
        boolean boolean17 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray14);
        java.lang.Class<?> wildcardClass18 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.append("A", "hi!");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("\000ah", "4");
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary('\000');
        doubleMetaphoneResult8.append('4', 'a');
        java.lang.String str28 = doubleMetaphoneResult8.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000aA" + "'", str18, "\000aA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000aA\000" + "'", str22, "\000aA\000");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\000a\000a" + "'", str28, "\000a\000a");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.appendAlternate('a');
        doubleMetaphoneResult8.appendAlternate('h');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        int int13 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult(35);
        int int16 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray20);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (-1), (int) '#', strArray20);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a\000", 100, 0, strArray20);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", 97, (int) (byte) 10, strArray20);
        boolean boolean25 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4\000", 10, 4, strArray20);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        char char17 = doubleMetaphone0.charAt("4a4\000", (-1));
        java.lang.String str19 = doubleMetaphone0.encode("\000ahi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AH" + "'", str19, "AH");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.maxCodeLen = '#';
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("4#4", "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen(0);
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        int int12 = doubleMetaphone0.maxCodeLen;
        java.lang.String str14 = doubleMetaphone0.encode("AH");
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("\000ah", "4#4i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("4##", (int) (short) 10);
        int int20 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphone0.maxCodeLen = 'h';
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) '#');
        doubleMetaphoneResult10.appendPrimary("4#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("H", false);
        java.lang.String str17 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        boolean boolean21 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a 4", "", true);
        java.lang.Class<?> wildcardClass22 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "A" + "'", str17, "A");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        java.lang.Object obj10 = doubleMetaphone0.encode((java.lang.Object) "\000a");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult(0);
        java.lang.String str14 = doubleMetaphone0.doubleMetaphone("\000a4#");
        java.lang.String str16 = doubleMetaphone0.encode("\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "A" + "'", obj10, "A");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "A" + "'", str14, "A");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        char char19 = doubleMetaphone0.charAt("#H", (int) 'h');
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000\000\000", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = doubleMetaphone0.doubleMetaphone("4#", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphoneResult10.append("\000", "H");
        java.lang.String str14 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append('#');
        java.lang.String str17 = doubleMetaphoneResult10.getAlternate();
        java.lang.String str18 = doubleMetaphoneResult10.getAlternate();
        doubleMetaphoneResult10.append("H");
        doubleMetaphoneResult10.append(' ', 'i');
        java.lang.String str24 = doubleMetaphoneResult10.getAlternate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) -1);
        char char10 = doubleMetaphone0.charAt("hi!", (int) (byte) 1);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult12 = doubleMetaphone0.new DoubleMetaphoneResult((int) '\000');
        int int13 = doubleMetaphone0.getMaxCodeLen();
        int int14 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'i' + "'", char10 == 'i');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.append("\000");
        doubleMetaphoneResult8.appendPrimary("hi!");
        doubleMetaphoneResult8.appendAlternate('4');
        doubleMetaphoneResult8.appendAlternate("\000a4");
        java.lang.String str29 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000a\0004" + "'", str29, "\000a\0004");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = (-1);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a\000A", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str8 = doubleMetaphone0.encode("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a4 ");
        java.lang.Object obj12 = doubleMetaphone0.encode((java.lang.Object) "\000a4h");
        int int13 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "A" + "'", obj12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        int int8 = doubleMetaphone0.getMaxCodeLen();
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000\000\000", false);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000#", "\000a4 ");
        java.lang.Class<?> wildcardClass17 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.append("\000a\000\000", "\000a\000");
        doubleMetaphoneResult8.appendAlternate("4#4");
        doubleMetaphoneResult8.append('a', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone12 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int13 = doubleMetaphone12.maxCodeLen;
        boolean boolean16 = doubleMetaphone12.isDoubleMetaphoneEqual("hi!", "");
        int int17 = doubleMetaphone12.getMaxCodeLen();
        boolean boolean21 = doubleMetaphone12.isDoubleMetaphoneEqual("H4a", "\000a4", false);
        int int22 = doubleMetaphone12.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = doubleMetaphone0.encode((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        doubleMetaphone0.maxCodeLen = 'a';
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000a");
        int int13 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) ' ');
        int int16 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000a\000");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) '4');
        doubleMetaphoneResult21.appendAlternate("# 4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "A" + "'", str12, "A");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult7.append(' ');
        doubleMetaphoneResult7.append("hi!i", "H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        doubleMetaphoneResult8.append("\000a", "hi!");
        doubleMetaphoneResult8.appendAlternate("\000a4");
        doubleMetaphoneResult8.append('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('\000', '\000');
        doubleMetaphoneResult8.append('4', 'a');
        boolean boolean22 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendPrimary('H');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String[] strArray19 = new java.lang.String[] { "\000a", "H", "\000a", "" };
        boolean boolean20 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000", (int) (short) 1, (int) (byte) 100, strArray19);
        boolean boolean21 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4h", (int) 'a', (int) (byte) 10, strArray19);
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", (int) (short) 1, (int) 'a', strArray19);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H4a\000", (int) (short) -1, (int) '4', strArray19);
        boolean boolean24 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000a4H", (int) (short) -1, (int) (short) 100, strArray19);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\000a", "H", "\000a", "" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult2 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.append("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult14 = doubleMetaphone0.new DoubleMetaphoneResult((-1));
        char char17 = doubleMetaphone0.charAt("H", (int) (byte) 100);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult4 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 10);
        doubleMetaphoneResult4.appendAlternate("\000ah");
        doubleMetaphoneResult4.append(' ', ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "\000a", true);
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("A");
        doubleMetaphone0.setMaxCodeLen(4);
        doubleMetaphone0.setMaxCodeLen((int) (short) 100);
        boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "", true);
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000ah");
        int int20 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        int int23 = doubleMetaphone0.maxCodeLen;
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("4#4i", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.append('#');
        doubleMetaphoneResult8.append('\000');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000A", " Ai", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        boolean boolean18 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "H");
        int int19 = doubleMetaphone0.getMaxCodeLen();
        java.lang.String str22 = doubleMetaphone0.doubleMetaphone("\000a4 ", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "A" + "'", str22, "A");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        boolean boolean18 = doubleMetaphone14.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str20 = doubleMetaphone14.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult22.append('\000');
        doubleMetaphoneResult22.append('a');
        doubleMetaphoneResult22.append("", "\000");
        java.lang.String str30 = doubleMetaphoneResult22.getPrimary();
        doubleMetaphoneResult22.append("4");
        doubleMetaphoneResult22.append(' ');
        doubleMetaphoneResult22.appendAlternate("\0004");
        doubleMetaphoneResult22.append(' ', '4');
        doubleMetaphoneResult22.append(' ');
        doubleMetaphoneResult22.appendPrimary("\000a#\000");
        java.lang.String str44 = doubleMetaphoneResult22.getPrimary();
        doubleMetaphoneResult22.appendPrimary('h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a" + "'", str30, "\000a");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\000a4 " + "'", str44, "\000a4 ");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        int int5 = doubleMetaphone0.getMaxCodeLen();
        int int6 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean10 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000a", "", true);
        doubleMetaphone0.setMaxCodeLen((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("4#", "\000aa4", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendPrimary("A");
        doubleMetaphoneResult8.append('i', 'i');
        doubleMetaphoneResult8.append("4");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate('h');
        doubleMetaphoneResult8.appendPrimary('a');
        doubleMetaphoneResult8.appendAlternate("4hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("\000a");
        java.lang.String str18 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\000a" + "'", str18, "\000a");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("\000a");
        doubleMetaphoneResult8.appendPrimary('\000');
        boolean boolean20 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.maxCodeLen = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.append('i', 'i');
        doubleMetaphoneResult10.appendPrimary("\000aa4");
        boolean boolean17 = doubleMetaphoneResult10.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        doubleMetaphoneResult8.append("", "\000");
        java.lang.String str16 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append("4");
        java.lang.String str19 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append('4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\000a" + "'", str16, "\000a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000a\0004" + "'", str19, "\000a\0004");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("a", "\000a\000\000");
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("A", "\000a4H");
        char char18 = doubleMetaphone0.charAt("\000\000A", (int) (byte) 10);
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.append("\000aH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("\000a4\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        java.lang.String str15 = doubleMetaphone0.encode("\000");
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000a#", true);
        java.lang.String str20 = doubleMetaphone0.doubleMetaphone("\000#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean15 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000\000", "A", true);
        java.lang.String str18 = doubleMetaphone0.doubleMetaphone("\000aH\000", false);
        int int19 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "A" + "'", str18, "A");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual(" Ai", "H4a", true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone10 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int11 = doubleMetaphone10.maxCodeLen;
        boolean boolean14 = doubleMetaphone10.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str16 = doubleMetaphone10.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult18 = doubleMetaphone10.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult18.append('\000');
        java.lang.String str21 = doubleMetaphoneResult18.getPrimary();
        doubleMetaphoneResult18.append("4");
        java.lang.String str24 = doubleMetaphoneResult18.getAlternate();
        java.lang.Object obj25 = doubleMetaphone0.encode((java.lang.Object) str24);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone26 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int27 = doubleMetaphone26.maxCodeLen;
        boolean boolean30 = doubleMetaphone26.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str32 = doubleMetaphone26.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult34 = doubleMetaphone26.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult34.appendPrimary(' ');
        doubleMetaphoneResult34.appendPrimary("A");
        doubleMetaphoneResult34.append('h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = doubleMetaphone0.encode((java.lang.Object) 'h');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\0004" + "'", str24, "\0004");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "" + "'", obj25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        char char4 = doubleMetaphone0.charAt("hi!", (int) (byte) 100);
        int int5 = doubleMetaphone0.maxCodeLen;
        char char8 = doubleMetaphone0.charAt("", 0);
        int int9 = doubleMetaphone0.maxCodeLen;
        java.lang.String str11 = doubleMetaphone0.encode("\000a4h");
        int int12 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        char char13 = doubleMetaphone0.charAt("\000a4", (int) '\000');
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone14 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int15 = doubleMetaphone14.maxCodeLen;
        boolean boolean18 = doubleMetaphone14.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str20 = doubleMetaphone14.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult22 = doubleMetaphone14.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult22.append('\000');
        doubleMetaphoneResult22.append('a');
        doubleMetaphoneResult22.append("", "\000");
        java.lang.String str30 = doubleMetaphoneResult22.getPrimary();
        doubleMetaphoneResult22.append("4");
        doubleMetaphoneResult22.appendPrimary("hi!");
        doubleMetaphoneResult22.append("\000a\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = doubleMetaphone0.encode((java.lang.Object) doubleMetaphoneResult22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000a" + "'", str30, "\000a");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendPrimary("H");
        doubleMetaphoneResult8.appendAlternate("4");
        doubleMetaphoneResult8.append('a', 'h');
        java.lang.String str21 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary(' ');
        doubleMetaphoneResult8.appendAlternate('\000');
        doubleMetaphoneResult8.append("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000aHa" + "'", str21, "\000aHa");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        boolean boolean11 = doubleMetaphoneResult10.isComplete();
        doubleMetaphoneResult10.appendAlternate('a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.setMaxCodeLen((int) (byte) 10);
        int int5 = doubleMetaphone0.maxCodeLen;
        int int6 = doubleMetaphone0.getMaxCodeLen();
        doubleMetaphone0.maxCodeLen = (short) 10;
        java.lang.String str11 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str13 = doubleMetaphone0.encode("\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        doubleMetaphoneResult13.appendAlternate("\000a4");
        boolean boolean16 = doubleMetaphoneResult13.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "", true);
        java.lang.String str7 = doubleMetaphone0.encode("hi!");
        int int8 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("4##", "\000", true);
        int int13 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4\000", "4");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("4H", "A", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "H" + "'", str7, "H");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.appendAlternate("\000");
        doubleMetaphoneResult8.appendAlternate("\000a");
        boolean boolean18 = doubleMetaphoneResult8.isComplete();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = 4;
        doubleMetaphone0.maxCodeLen = 'i';
        java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000a\000a");
        java.lang.Class<?> wildcardClass20 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "A" + "'", str19, "A");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.append(' ', '#');
        java.lang.Class<?> wildcardClass17 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str9 = doubleMetaphone0.doubleMetaphone("");
        int int10 = doubleMetaphone0.maxCodeLen;
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("H");
        doubleMetaphone0.maxCodeLen = (short) -1;
        doubleMetaphone0.setMaxCodeLen((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = doubleMetaphone0.doubleMetaphone("\000aa\000", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'a');
        java.lang.String str16 = doubleMetaphone0.doubleMetaphone("\000", false);
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone17 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int18 = doubleMetaphone17.maxCodeLen;
        char char21 = doubleMetaphone17.charAt("hi!", (int) (byte) 100);
        int int22 = doubleMetaphone17.maxCodeLen;
        int int23 = doubleMetaphone17.getMaxCodeLen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: DoubleMetaphone encode parameter is not of type String");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str5 = doubleMetaphone0.encode("hi!");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "\000", "hi!", "\000", "\000" };
        boolean boolean22 = org.apache.commons.codec.language.DoubleMetaphone.contains("", 0, (int) '\000', strArray21);
        boolean boolean23 = org.apache.commons.codec.language.DoubleMetaphone.contains("H", (int) (byte) -1, (int) (byte) 100, strArray21);
        java.lang.Object obj24 = doubleMetaphone0.encode((java.lang.Object) "H");
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone(" Ah");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "\000", "hi!", "\000", "\000" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.maxCodeLen = ' ';
        int int6 = doubleMetaphone0.maxCodeLen;
        int int7 = doubleMetaphone0.maxCodeLen;
        java.lang.String str9 = doubleMetaphone0.encode("\000#");
        java.lang.String str12 = doubleMetaphone0.doubleMetaphone("\000ahi", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AH" + "'", str12, "AH");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        boolean boolean13 = doubleMetaphoneResult8.isComplete();
        boolean boolean14 = doubleMetaphoneResult8.isComplete();
        doubleMetaphoneResult8.append("");
        doubleMetaphoneResult8.append("\0004", "\000aA");
        doubleMetaphoneResult8.append("\000ah", "4H");
        doubleMetaphoneResult8.append("\000\000");
        doubleMetaphoneResult8.append("\000aa\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        int int9 = doubleMetaphone0.getMaxCodeLen();
        int int10 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        int int9 = doubleMetaphone0.maxCodeLen;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        doubleMetaphoneResult8.append('a');
        java.lang.String str13 = doubleMetaphoneResult8.getAlternate();
        doubleMetaphoneResult8.appendAlternate("H");
        doubleMetaphoneResult8.appendPrimary('4');
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.appendAlternate("\000a4\000");
        java.lang.String str22 = doubleMetaphoneResult8.getPrimary();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000a" + "'", str13, "\000a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\000a4" + "'", str22, "\000a4");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String[] strArray3 = null;
        boolean boolean4 = org.apache.commons.codec.language.DoubleMetaphone.contains("\000\000", (int) 'h', 32, strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        int int7 = doubleMetaphone0.maxCodeLen;
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        java.lang.String str13 = doubleMetaphone0.encode("4");
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int16 = doubleMetaphone0.maxCodeLen;
        boolean boolean19 = doubleMetaphone0.isDoubleMetaphoneEqual("\0004", "\000aHa");
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a4", "\000ah", false);
        java.lang.String str26 = doubleMetaphone0.doubleMetaphone("\000a\000", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "A" + "'", str26, "A");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        char char11 = doubleMetaphone0.charAt("hi!", (int) 'a');
        java.lang.String str13 = doubleMetaphone0.encode("\000");
        doubleMetaphone0.maxCodeLen = 4;
        java.lang.Class<?> wildcardClass16 = doubleMetaphone0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        java.lang.String str12 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.append('a', '\000');
        doubleMetaphoneResult8.appendPrimary("\000a");
        doubleMetaphoneResult8.appendPrimary('i');
        doubleMetaphoneResult8.append("\000a4 ", "\000a4h");
        java.lang.Class<?> wildcardClass23 = doubleMetaphoneResult8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\000" + "'", str12, "\000");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        int int2 = doubleMetaphone0.getMaxCodeLen();
        char char5 = doubleMetaphone0.charAt("\000a", (int) (byte) 10);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult7 = doubleMetaphone0.new DoubleMetaphoneResult(10);
        char char10 = doubleMetaphone0.charAt(" Ai", (-1));
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000aa", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "A" + "'", str13, "A");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        doubleMetaphone0.setMaxCodeLen(100);
        int int9 = doubleMetaphone0.maxCodeLen;
        doubleMetaphone0.setMaxCodeLen((int) '#');
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\000", "\000a");
        char char17 = doubleMetaphone0.charAt("hi!", (-1));
        int int18 = doubleMetaphone0.getMaxCodeLen();
        boolean boolean22 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a 4", false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str8 = doubleMetaphone0.doubleMetaphone("A");
        java.lang.String str10 = doubleMetaphone0.doubleMetaphone("\000a");
        int int11 = doubleMetaphone0.maxCodeLen;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult13 = doubleMetaphone0.new DoubleMetaphoneResult((int) 'h');
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult15 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A" + "'", str8, "A");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A" + "'", str10, "A");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        boolean boolean4 = doubleMetaphone0.isDoubleMetaphoneEqual("hi!", "");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("");
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult8 = doubleMetaphone0.new DoubleMetaphoneResult(4);
        doubleMetaphoneResult8.append('\000');
        java.lang.String str11 = doubleMetaphoneResult8.getPrimary();
        doubleMetaphoneResult8.appendPrimary("");
        doubleMetaphoneResult8.append('h');
        doubleMetaphoneResult8.appendAlternate(' ');
        doubleMetaphoneResult8.appendPrimary('#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000" + "'", str11, "\000");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("hi!", false);
        doubleMetaphone0.setMaxCodeLen((int) (short) 10);
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        java.lang.String str13 = doubleMetaphone0.doubleMetaphone("\000a\0004", true);
        boolean boolean16 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "4H");
        boolean boolean20 = doubleMetaphone0.isDoubleMetaphoneEqual("\000aa", "# 4", false);
        boolean boolean23 = doubleMetaphone0.isDoubleMetaphoneEqual("\000a\0004", "\000a\000A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        int int1 = doubleMetaphone0.maxCodeLen;
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean7 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "H", true);
        int int8 = doubleMetaphone0.getMaxCodeLen();
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult10 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 0);
        java.lang.String str12 = doubleMetaphone0.encode("H");
        char char15 = doubleMetaphone0.charAt("hi!", (int) (short) 0);
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult17 = doubleMetaphone0.new DoubleMetaphoneResult((int) (byte) 100);
        doubleMetaphone0.maxCodeLen = (byte) 100;
        org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult21 = doubleMetaphone0.new DoubleMetaphoneResult((int) ' ');
        int int22 = doubleMetaphone0.maxCodeLen;
        char char25 = doubleMetaphone0.charAt("\000ah", (int) (short) 10);
        java.lang.String str27 = doubleMetaphone0.encode("aH");
        char char30 = doubleMetaphone0.charAt("\000\000A", (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'h' + "'", char15 == 'h');
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '\000' + "'", char25 == '\000');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "A" + "'", str27, "A");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }
}

