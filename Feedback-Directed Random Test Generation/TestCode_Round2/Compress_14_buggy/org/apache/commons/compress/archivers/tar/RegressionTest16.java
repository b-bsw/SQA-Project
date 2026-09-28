package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray5, (-7), 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (byte) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 51);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray7, 28, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 110L + "'", long24 == 110L);
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 100, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 10, byteArray8, (int) (byte) 0, 5);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray8, 46, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 49, (byte) 50 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 243L + "'", long26 == 243L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 243L + "'", long27 == 243L);
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray4, 1, (-1));
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, 9, (-3));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 40, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) ' ', 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 86, byteArray4, 90, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray5, 30, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 50, (int) (byte) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 0, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 10, (int) (byte) 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(380L, byteArray7, 44, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 0);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (byte) 1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 84, byteArray7, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (byte) 0, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, (int) (byte) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, 97, (-1));
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 46, byteArray8, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 46=56 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 96 + "'", int27 == 96);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 400L + "'", long28 == 400L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 400L + "'", long32 == 400L);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) '4');
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (short) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 10, (-1));
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, 4);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 0, (int) (short) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 3, byteArray9, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 6, byteArray9, 29, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 51, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 400L + "'", long25 == 400L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 400L + "'", long26 == 400L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 400L + "'", long27 == 400L);
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray8, 4, (-3));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(92L, byteArray8, (int) (byte) 1, 91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 400L + "'", long23 == 400L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 400L + "'", long24 == 400L);
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray5, (-2), (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 30);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 37, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 86, byteArray4, (int) (byte) 100, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(400L, byteArray7, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 46, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 92, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("h", byteArray7, (int) '4', (-9));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 43 + "'", int25 == 43);
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, 29);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, 8, (-4));
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray6, (-5), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\nd" + "'", str19, "\nd");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 110L + "'", long24 == 110L);
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 6, byteArray7, (int) (byte) 10, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 400L + "'", long24 == 400L);
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) '4');
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray9, 0, 2);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 1, (-1));
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (byte) 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray9, 29, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(302L, byteArray9, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 302=456 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) ' ', (-3));
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 49, (byte) 50, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray7, 50, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 0);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (byte) 1, (-4));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray7, (int) (byte) 1, 0);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) -1, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3) + "'", int23 == (-3));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 400L + "'", long29 == 400L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 400L + "'", long30 == 400L);
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 0, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(250L, byteArray6, (-2), 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 93, byteArray7, 7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, 3);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray6, 98, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 2);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-3), (-6));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray8, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 348L + "'", long20 == 348L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-9) + "'", int25 == (-9));
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 86, byteArray5, 94, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 1, (int) (short) 1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(99L, byteArray8, (int) ' ', 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray7, 31, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 348L + "'", long19 == 348L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 348L + "'", long25 == 348L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-5), byteArray4, (int) '#', 86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray5, 44, (-7));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 50);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\nd" + "'", str23, "\nd");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 100);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray7, 10, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 348L + "'", long19 == 348L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 348L + "'", long22 == 348L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 348L + "'", long23 == 348L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 348L + "'", long24 == 348L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 348L + "'", long28 == 348L);
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 52, byteArray6, 44, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray7, (int) (short) 1, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 97, (-4));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 93 + "'", int29 == 93);
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray1, 86, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 51, (-4));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass26 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 49);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray6, (int) (byte) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\nd" + "'", str24, "\nd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(293L, byteArray6, 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 293=445 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 29, byteArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 376L + "'", long7 == 376L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 376L + "'", long8 == 376L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray5, (-2), (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 110L + "'", long26 == 110L);
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 1, (int) (byte) -1);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) (short) 1, (int) (byte) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 90, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 110L + "'", long24 == 110L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 110L + "'", long28 == 110L);
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (short) 1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (short) 1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 93, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (byte) 1, (-4));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray8, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 47, byteArray8, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 8, byteArray4, 84, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 9, byteArray6, 43, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (-3), (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 100);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray7, 6, (-4));
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 40, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray8, 4, (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray8, 32, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) '4');
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 50, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray9, 97, (int) (short) 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray9, (-3), 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300L + "'", long18 == 300L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300L + "'", long22 == 300L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-3) + "'", int28 == (-3));
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(400L, byteArray7, (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 30, byteArray6, 32, 86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 10, (int) (short) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 2, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-6), byteArray8, 25, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -6=1777777777777777777772 will not fit in octal number buffer of length -10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 348L + "'", long20 == 348L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 765L + "'", long8 == 765L);
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray5, 44, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\nd" + "'", str18, "\nd");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) 'a', 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 25, byteArray1, 50, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 1, (int) (short) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, 2);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (-1), (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 38, byteArray6, 28, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 38=46 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (byte) -1, (-2));
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, 95, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 95 + "'", int21 == 95);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 10, (int) (short) 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (-5));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 93, byteArray8, 8, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 93=135 will not fit in octal number buffer of length -9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 348L + "'", long20 == 348L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 348L + "'", long27 == 348L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) -1, (-2));
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, 95, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray6, 40, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 95 + "'", int22 == 95);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (short) 1, (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 110L + "'", long24 == 110L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) '#');
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray6, (-3), (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4) + "'", int17 == (-4));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 9);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (-4), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) 'a');
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 200L + "'", long15 == 200L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dd" + "'", str18, "dd");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 200L + "'", long21 == 200L);
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 1, (int) (short) 1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (int) (byte) 10);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, 50);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 7, byteArray8, 25, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray7, 0, 4);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 46, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 46 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 52, (byte) 48, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 280L + "'", long22 == 280L);
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray5, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, 97);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray5, 97, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, 52);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 49, (byte) 50, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 96 + "'", int26 == 96);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 99L + "'", long27 == 99L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "12" + "'", str30, "12");
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 30, byteArray6, 29, 91);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 97);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray7, (int) (byte) -1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 43, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 400L + "'", long23 == 400L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-5) + "'", int26 == (-5));
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 6, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, 96, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray8, (int) (byte) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (-5), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (-3), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 1, (int) (short) 1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 98, 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 28, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("12", byteArray6, (int) 'a', 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 98, byteArray4, 86, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 37, byteArray7, 93, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 37=45 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 84, byteArray7, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 84=124 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 37, byteArray4, (int) (short) 10, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 2);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, (int) (short) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 52, byteArray8, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 348L + "'", long20 == 348L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 348L + "'", long23 == 348L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 28, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -6 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(127L, byteArray5, 10, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 49, (byte) 50, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 99L + "'", long23 == 99L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 99L + "'", long24 == 99L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 99L + "'", long25 == 99L);
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 32, 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 348L + "'", long18 == 348L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 348L + "'", long24 == 348L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 348L + "'", long28 == 348L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 348L + "'", long29 == 348L);
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 96, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray8, 91, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 381L + "'", long21 == 381L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 381L + "'", long25 == 381L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 381L + "'", long26 == 381L);
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray7, 37, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 50);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray7, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(376L, byteArray8, 1, 4);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(380L, byteArray8, 25, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 53, (byte) 55, (byte) 48, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 188L + "'", long20 == 188L);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (-1), (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(10L, byteArray7, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 512L + "'", long8 == 512L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 512L + "'", long12 == 512L);
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 1, (int) (short) 1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 0);
        boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray8, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 404L + "'", long27 == 404L);
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 1, (-4));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3) + "'", int22 == (-3));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 400L + "'", long23 == 400L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, 50);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 51, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray5, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 3, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 100 at offset 1 in '?d' len=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(400L, byteArray7, 40, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) '4');
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass22 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) '4');
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (short) 1);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray10, 9, (-4));
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray10, (int) '4', (int) (short) 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray10, 4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(188L, byteArray10, 92, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 188=274 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 48 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d" + "'", str13, "d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
    }
}

