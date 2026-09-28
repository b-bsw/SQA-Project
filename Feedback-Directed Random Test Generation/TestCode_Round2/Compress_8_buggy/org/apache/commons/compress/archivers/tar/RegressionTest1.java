package org.apache.commons.compress.archivers.tar;

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
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 52, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        byte[] byteArray1 = null;
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray1, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray9, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray9, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-2), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (-2), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 466L + "'", long7 == 466L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray9, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray8, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray3, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 466=722 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 50 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray8, (int) (byte) 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 41 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray2, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 31, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray3, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray8, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray7, (int) (short) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray10, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(466L, byteArray10, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 50, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray9, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 52, byteArray9, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 35, byteArray2, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray9, 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray2, 31, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 0, (int) (short) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 97, byteArray9, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray11, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray9, 99, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray9, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 32, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(469L, byteArray2, (int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray2, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray8, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray8, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(469L, byteArray2, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray9, (int) ' ', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray7, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray9, 99, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray3, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray1, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass27 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 52, byteArray2, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1 });
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray8, (-2), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 52, byteArray9, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(465L, byteArray2, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 0);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 99, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray8, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray8, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 62 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-2), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\377d" + "'", str22, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (byte) 10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(520L, byteArray10, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 151 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\377d" + "'", str28, "\377d");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray8, 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray2, (int) (short) -1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray9, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 35, byteArray2, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray10, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-2), byteArray9, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray9, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray9, 52, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray7, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 99, (-1));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 32, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass10 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray9, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray8, 99, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\377d" + "'", str30, "\377d");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray7, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 1, (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray8, 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray2, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) '#', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 97, byteArray9, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray9, (int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 35, byteArray1, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray8, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 52, byteArray2, (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray12, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(1L, byteArray10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 10);
        java.lang.Class<?> wildcardClass30 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\377d" + "'", str26, "\377d");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\377d" + "'", str29, "\377d");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(520L, byteArray8, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 0, byteArray2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray2, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 134 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32, byteArray9, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass14 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray9, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray3, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 52, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray10, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray10, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 50, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 35, byteArray9, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\377d" + "'", str26, "\377d");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\377d" + "'", str29, "\377d");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray8, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\377" + "'", str22, "\377");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray9, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259L + "'", long24 == 259L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259L + "'", long25 == 259L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(466L, byteArray8, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray8, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 97, byteArray8, 97, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray2, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 32, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) (byte) 1, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray9, 99, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        byte[] byteArray1 = null;
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray1, 52, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray3, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray9, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(466L, byteArray8, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) 1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.Class<?> wildcardClass33 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 469L + "'", long31 == 469L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 469L + "'", long32 == 469L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 32, (int) (byte) 0);
        java.lang.Class<?> wildcardClass41 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray9, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass23 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray8, 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(469L, byteArray10, 98, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(469L, byteArray9, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray9, (int) (short) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 259=403 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray5, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0 });
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 35, byteArray7, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray8, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 97, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray9, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray7, (int) (short) 1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 1);
        java.lang.Class<?> wildcardClass22 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\377" + "'", str21, "\377");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 35, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (int) (short) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (-2), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray2, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray8, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 98, byteArray2, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray9, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray2, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(520L, byteArray7, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) (byte) 1, (int) (short) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray9, 32, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 0, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray9, 31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray7, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray8, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (byte) 10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray10, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\377d" + "'", str28, "\377d");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray9, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 35, length 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray3, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray7, 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '#', 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray11, (int) (short) -1, (int) (short) -1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.Class<?> wildcardClass37 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2) + "'", int35 == (-2));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 0, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray9, 99, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray9, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray7, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray9, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 98, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 48, (byte) 32, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (-2), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(465L, byteArray9, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 98, byteArray1, 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 2, (int) (byte) -1);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray10, 32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray8, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray2, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 31, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray9, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 466=722 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray9, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 97, byteArray1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(466L, byteArray7, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 466=722 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass16 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(100L, byteArray1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray9, (-2), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) '4', (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 2, (int) (byte) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 1, 32);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray11, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-2), byteArray11, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\377d" + "'", str25, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray9, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray7, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray9, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98=142 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) 0, (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray10, 99, (int) (byte) -1);
        java.lang.Class<?> wildcardClass32 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 98 + "'", int31 == 98);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (-2), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) '4', (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 2, (int) (byte) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 1, 32);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray11, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray11, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\377d" + "'", str25, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 1, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 10, 0);
        java.lang.Class<?> wildcardClass35 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, (int) (byte) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 32, (int) (byte) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(414L, byteArray3, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-2), byteArray8, 2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 99, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 31, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 32, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 32);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 31, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\377d" + "'", str26, "\377d");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\377d" + "'", str29, "\377d");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 1, byteArray9, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray8, (int) '4', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 82 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 52, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray8, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray7, 2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray10, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 50, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 97, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray3, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray9, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray9, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 0, byteArray1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) '#', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 98, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259L + "'", long24 == 259L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259L + "'", long25 == 259L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray9, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(465L, byteArray10, (int) (short) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        java.lang.Class<?> wildcardClass24 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray9, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray8, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray7, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray9, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray8, (int) 'a', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 193 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) 'a', (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray9, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 32, byteArray12, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(520L, byteArray8, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 85 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray9, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray9, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass18 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray7, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(469L, byteArray2, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray2, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 84 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray9, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray10, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray10, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray9, (-2), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (-2), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\377d" + "'", str30, "\377d");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, 97, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray7, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray10, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray9, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(465L, byteArray8, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray2, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 2, byteArray9, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259L + "'", long24 == 259L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 99, byteArray1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (-1));
        java.lang.Class<?> wildcardClass22 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray2, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray8, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass21 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.Class<?> wildcardClass29 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 31, byteArray3, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray10, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 62 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray10, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray7, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass28 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\377d" + "'", str26, "\377d");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray9, 31, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray8, 98, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\377" + "'", str22, "\377");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray9, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray7, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray10, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass19 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray9, (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 32, byteArray2, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) ' ', (int) (byte) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 97, (-2));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray9, 99, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray8, 1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray3, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 48 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(466L, byteArray8, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray8, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 1, (int) '#');
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) (short) 0, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray11, 99, (int) (byte) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray11, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\377d" + "'", str35, "\377d");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass25 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray9, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray8, (int) (byte) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) 1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 8, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 469L + "'", long31 == 469L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 469L + "'", long32 == 469L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 52, byteArray10, (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray6, 98, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 466L + "'", long7 == 466L);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 2, byteArray7, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\377d" + "'", str16, "\377d");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (byte) 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 35, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass29 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\377d" + "'", str22, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray7, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray8, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray3, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 28 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray12, 32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 41 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 32);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, 97, 0);
        java.lang.Class<?> wildcardClass38 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray8, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (-2), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray9, 99, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray8, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 52, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) (short) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray9, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray7, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 1, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 10, 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 100 at offset 0 in 'd' len=1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray9, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 97, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259L + "'", long24 == 259L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259L + "'", long25 == 259L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray9, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray8, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray12, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 35, byteArray7, 2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray8, 2, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 52, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(1L, byteArray9, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray3, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray7, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray8, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) (short) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) 0, (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray10, 99, (int) (byte) -1);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass35 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 98 + "'", int31 == 98);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\377d" + "'", str34, "\377d");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray9, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray9, 31, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray3, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass22 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 31, byteArray8, (int) (byte) 0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray9, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 2, byteArray9, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 8, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 2);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\377d" + "'", str31, "\377d");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 465L + "'", long32 == 465L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray12, (int) (short) -1, (int) (short) -1);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 31, byteArray12, (int) 'a', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 97, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray9, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray10, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(414L, byteArray10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 414=636 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) (byte) 1, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (byte) 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray9, (int) (byte) 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (-2), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray7, (int) (short) 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 259=403 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '#', byteArray7, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 52, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray9, 8, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 38 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass24 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 259L + "'", long22 == 259L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259L + "'", long23 == 259L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray7, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray9, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray9, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 194 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(48L, byteArray7, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 48=60 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 52, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 35, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray8, (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 49, (byte) 52, (byte) 49 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (int) (byte) 10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (short) 10);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (short) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 32, byteArray10, 31, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) ' ', (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 8, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32, byteArray8, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray1, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray9, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, (int) (byte) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 32, (int) (byte) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray3, 0, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray3, 8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray1, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray10, 8, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray10, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 52, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (short) 10);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray10, 0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray10, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 28 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray8, 99, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(414L, byteArray10, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(48L, byteArray9, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 48=60 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 6, byteArray7, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 32, byteArray12, 97, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray8, (int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray8, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 55, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\377d" + "'", str22, "\377d");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray8, 31, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray9, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 98, byteArray8, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray3, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray3, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray8, (int) (short) 10, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 35, byteArray8, 31, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass26 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 31, byteArray7, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 10, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray9, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray9, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray10, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 85 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray10, 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) 1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 98, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\377d" + "'", str27, "\377d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 469L + "'", long31 == 469L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 469L + "'", long32 == 469L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 97, byteArray8, 8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(310L, byteArray1, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 310=466 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray3, (int) (byte) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray8, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 98, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) '4', (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 2, (int) (byte) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 1, 32);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray11, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray11, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\377d" + "'", str25, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 97);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 1, (int) '#');
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) (short) 0, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray11, 99, (int) (byte) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray11, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 98 + "'", int32 == 98);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\377d" + "'", str35, "\377d");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray2, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-2), byteArray1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 100, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray12, 6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 99, (-1));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 32, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(520L, byteArray9, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 97, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray9, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 0, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray9, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 52, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte -1 at offset 0 in '?' len=1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 8, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray10, 99, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (-1));
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray9, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray9, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\377d" + "'", str23, "\377d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray7, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 34, byteArray9, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 97, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray9, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(414L, byteArray9, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 414=636 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray9, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(520L, byteArray9, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\377d" + "'", str32, "\377d");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 31, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 100 at offset 0 in 'd' len=1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray8, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 67 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray8, 99, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 52, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 31, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray2, (-1), 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray9, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(469L, byteArray3, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 466L + "'", long7 == 466L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 466L + "'", long8 == 466L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 100, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray7, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray7, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray8, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray12, (int) (short) -1, (int) (short) -1);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(520L, byteArray12, (int) (byte) 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 52, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray10, (int) (short) -1, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 2, byteArray10, (int) (short) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray7, 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray2, 6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98=142 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray10, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (byte) 10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, (int) (byte) 1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (short) 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, 8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\377d" + "'", str28, "\377d");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 469L + "'", long32 == 469L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 469L + "'", long33 == 469L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 469L + "'", long37 == 469L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray3, 31, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 48 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\377d" + "'", str24, "\377d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377", byteArray9, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 1, byteArray2, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (-2), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 1, (-1));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 10, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray10, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\377d", byteArray10, (int) '4', (int) (byte) 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 2, (int) (byte) 100);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, (int) (short) 1, (int) (short) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray10, 32, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 414L + "'", long27 == 414L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray9, 98, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(310L, byteArray9, 52, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(414L, byteArray7, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 414=636 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray1, (int) '#', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

