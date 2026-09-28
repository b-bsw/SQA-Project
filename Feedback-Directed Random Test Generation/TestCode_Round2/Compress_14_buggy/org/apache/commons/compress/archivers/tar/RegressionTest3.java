package org.apache.commons.compress.archivers.tar;

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
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 99, byteArray8, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray4, (int) (byte) 0, 2);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 2, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 50, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray3, 47, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-2), byteArray4, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (short) 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (short) 10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 49, byteArray8, 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray8, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 54, (byte) 49, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300L + "'", long17 == 300L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray1, 50, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray7, 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 48 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 2, byteArray6, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 46 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray4, (int) (byte) 100, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray4, (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 50, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300L + "'", long15 == 300L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (byte) 1, (-4));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray8, (int) (short) 100, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray7, 51, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 150 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray5, (int) (byte) -1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 10 at offset 0 in '?d{NUL}' len=3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 51, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray4, 2, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', (int) (short) -1);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray2, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 6, byteArray6, (int) (byte) 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 6=6 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 200L + "'", long16 == 200L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 200L + "'", long17 == 200L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 97, byteArray7, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (-3), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 3, byteArray4, 47, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 144 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray7, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 51, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, (-2), (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(200L, byteArray4, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray6, 6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300L + "'", long15 == 300L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray5, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(200L, byteArray5, 9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 200=310 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, (-2), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray4, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 10, byteArray7, 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 100 at offset 1 in '?d' len=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) 'a', 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray7, 4, (-3));
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray6, 97, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 141 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 10, byteArray6, 49, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 50, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (-3), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, (int) (byte) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, 99, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 104, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 3, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 50, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass25 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass16 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) (short) 1, (int) (byte) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 9, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = byteArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 3, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (-3), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) '4');
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray7, (int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray5, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 512=1000 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray6, 4, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 4, byteArray5, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 9, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(92L, byteArray8, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 92=134 will not fit in octal number buffer of length -1");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 10, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass16 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (byte) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(92L, byteArray7, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 92=134 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, 51, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 99, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray5, 8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 49, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, (int) (byte) 0, (int) (byte) 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 6, byteArray8, (int) '4', 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(92L, byteArray6, (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 51, (-4));
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (-3), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 47 + "'", int24 == 47);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (short) 1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, (int) (short) 1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
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
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(10L, byteArray4, 3, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (-3), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray7, 2, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-4), byteArray6, 9, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 200L + "'", long18 == 200L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 200L + "'", long19 == 200L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray3, (-2), (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 2, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3) + "'", int11 == (-3));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 512L + "'", long7 == 512L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass16 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(376L, byteArray2, 6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray7, (-3), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 49, (byte) 50 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 47, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 3, byteArray6, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray5, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 200L + "'", long15 == 200L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, 1, (-1));
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 9, (-3));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(11L, byteArray5, 4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray1, 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) 'a', 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray7, 4, (-3));
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -4 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (byte) 10, (-1));
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(348L, byteArray4, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 348=534 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 49, byteArray7, 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, 47, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 54, (byte) 49, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 51, byteArray6, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray6, 47, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (byte) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, 0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, 50);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 99, byteArray6, (-3), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray6, 31, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 5");
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
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(99L, byteArray1, 49, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray5, (int) (byte) 1, 2);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 50, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(400L, byteArray6, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 400=620 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray4, (int) (byte) 1, 2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 50, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 92L + "'", long12 == 92L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray5, (int) '4', (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray7, 49, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray4, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray6, (-2), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 50, byteArray5, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
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
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 104, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 0, 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 2, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 100);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray5, 50, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray5, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) '4');
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 97, byteArray7, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 51, byteArray6, 47, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray6, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 200L + "'", long16 == 200L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray7, 31, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 2, byteArray5, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-3), byteArray6, 49, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray6, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 99, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 100, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -4");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', (int) (short) -1);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray2, (int) '#', 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 84 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray4, 51, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '#', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 1, (int) (short) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 1, 2);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray5, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, 1, (-1));
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, 9, (-3));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray5, 1, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11L + "'", long13 == 11L);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray6, 50, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray7, 49, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        java.lang.Class<?> wildcardClass16 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 50, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray5, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray7, 50, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray5, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 82 out of bounds for length 3");
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
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) (short) 1, (int) (byte) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(99L, byteArray7, (int) (byte) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 3, byteArray8, (-4), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 3=3 will not fit in octal number buffer of length -6");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray5, 4, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 50, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray6, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 6, byteArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
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
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(348L, byteArray6, 9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 348=534 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 200L + "'", long16 == 200L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 200L + "'", long17 == 200L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-3), byteArray6, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -3=1777777777777777777775 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray7, 0, 2);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 1, (-1));
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 1, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(11L, byteArray5, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 3");
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
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray6, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(348L, byteArray6, 49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 348=534 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) '4');
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 50, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray9, 97, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 10, byteArray9, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(348L, byteArray6, 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 45 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray7, (-3), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
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
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray6, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(376L, byteArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 376=570 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) (short) 1, (int) (byte) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray7, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray5, (int) (byte) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray5, (-2), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray6, 49, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 50, (int) (byte) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 0, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(200L, byteArray7, (-4), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
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
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, 51, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray5, (int) (byte) 1, 2);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray5, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 92L + "'", long13 == 92L);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(99L, byteArray6, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) (short) 1, (int) (byte) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 51, byteArray7, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 0, byteArray5, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
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
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 2, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -2 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 348L + "'", long18 == 348L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray7, 47, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -1");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray4, (int) (byte) 100, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass18 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray4, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 0, byteArray6, 51, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray4, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 97, byteArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '4', (int) (short) -1);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray3, 51, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray3, 99, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray5, (int) (byte) 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray7, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-2), byteArray7, 49, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 51, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(99L, byteArray6, 99, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (-2), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-2), byteArray7, (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 50);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 51, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray7, (-4), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray7, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 6, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 2, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray6, (int) '#', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 100, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray5, (int) (byte) -1, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(400L, byteArray5, (int) (byte) 1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(11L, byteArray5, (int) (byte) -1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray7, 0, 2);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) -1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray4, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 8, byteArray5, (int) (byte) -1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray7, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 0, 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) ' ', (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 0, byteArray7, (int) '4', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 58 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray6, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 376L + "'", long7 == 376L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) (short) 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 10, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (byte) 10, (-1));
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 6, byteArray7, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 50, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -4 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
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
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 4, byteArray5, 100, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 150 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 51, byteArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 51=63 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray7, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 50);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(92L, byteArray7, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 92=134 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 348L + "'", long23 == 348L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray5, 10, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 38 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 6, byteArray5, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 6=6 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(400L, byteArray6, (-2), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 400=620 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray6, (int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, 10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(381L, byteArray5, 31, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 381=575 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray5, (-3), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray5, (int) (byte) 0, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(11L, byteArray6, 8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 100, byteArray5, 31, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(512L, byteArray7, (int) (short) -1, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (byte) 1, (-4));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(92L, byteArray8, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        byte[] byteArray2 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 3, byteArray2, (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 53 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 31, byteArray4, 4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 38 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 127L + "'", long11 == 127L);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '4', (int) (short) -1);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray3, 51, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray3, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 51 + "'", int6 == 51);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 50 + "'", int10 == 50);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray5, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 3");
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
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(300L, byteArray7, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 300=454 will not fit in octal number buffer of length 0");
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray6, (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray6, (-2), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 55, (byte) 55, (byte) 55, (byte) 55, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 9, byteArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray7, 6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-2), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray7, 99, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(200L, byteArray5, (-3), 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 3");
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
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 10, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass18 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray8, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(300L, byteArray8, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 300=454 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 31, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) 'a', 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 49, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray5, 9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(127L, byteArray6, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 127=177 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) 'a');
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 100, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 1, (int) (short) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 1, 2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (-2), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 50, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 10, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 0, byteArray7, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 150 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray6, 3, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 9, byteArray6, 99, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 9=11 will not fit in octal number buffer of length -6");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) -1, byteArray6, (int) (byte) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray5, (int) '4', (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (-3), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 2, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray7, (int) (short) -1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 28 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
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
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 1, (-1));
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray8, 0, 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 31);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 51, byteArray8, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 51=63 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300L + "'", long15 == 300L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 2);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-3), byteArray8, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -3=1777777777777777777775 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 104, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(110L, byteArray6, (-3), 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 45 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 9, byteArray7, 99, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 9=11 will not fit in octal number buffer of length -1");
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
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 100, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 31, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (-4), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 51, byteArray6, 49, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 51=63 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray6, 51, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 400L + "'", long23 == 400L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray6, (int) 'a', 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 145 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 8, byteArray6, 31, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 376L + "'", long7 == 376L);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 1, 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass21 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (byte) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 9, byteArray5, (int) (byte) 0, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
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
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray4, 4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray7, (int) (byte) 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray5, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) ' ', byteArray7, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray6, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 100);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray6, 50, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(300L, byteArray6, 4, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 50 + "'", int28 == 50);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray6, 99, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray1, 31, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 512=1000 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray5, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 50);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 51, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(400L, byteArray7, (int) (byte) 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 400=620 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) -1, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray5, (-3), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 50);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 51, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) -1, byteArray7, (-4), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (short) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 50);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 348L + "'", long22 == 348L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray6, 0, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray6, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 3");
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
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(99L, byteArray1, 8, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 6, byteArray8, 6, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 50);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray7, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray7, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray4, (-3), (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(11L, byteArray1, 49, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(381L, byteArray6, (-3), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray6, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 48, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 2, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 400L + "'", long17 == 400L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(100L, byteArray4, (int) (byte) 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray6, 31, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray7, 50, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray5, 6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray5, (int) (short) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray1, 99, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) -1, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (-3), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 51, byteArray6, 47, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 51=63 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray6, 10, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 3");
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
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray5, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray6, (int) (byte) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 348L + "'", long18 == 348L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        byte[] byteArray1 = new byte[] {};
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 0, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (byte) 1, (int) (short) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray5, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray6, 9, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (-4), byteArray1, 3, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -4");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(200L, byteArray7, 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 200=310 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray6, (int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (byte) 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray6, 1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '4', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 31, byteArray2, 6, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 99, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 2, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray7, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 348L + "'", long23 == 348L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 3, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray5, (-3), (-1));
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 3, byteArray5, 2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray6, 51, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 3, byteArray6, (int) (short) -1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 3");
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
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, 8, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 10, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray5, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 102 out of bounds for length 3");
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray5, (int) (byte) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 4, byteArray5, 31, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 4=4 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 0, 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 6, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray8, (-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(765L, byteArray6, (int) ' ', (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 765=1375 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray7, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300L + "'", long16 == 300L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray4, (int) (short) 0, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
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
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray5, 31, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray6, (int) (short) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 5");
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
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(400L, byteArray5, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 400=620 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 100, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (short) 10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 49, byteArray8, 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-4), byteArray8, (-4), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 54, (byte) 49, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300L + "'", long17 == 300L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, 51, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray6, (int) (byte) 0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 0, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 31);
        java.lang.Class<?> wildcardClass22 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass20 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 50, (int) (byte) -1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 0, (int) (byte) 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray7, (int) (byte) 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 400L + "'", long22 == 400L);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(376L, byteArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 376=570 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 50, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray8, 2, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300L + "'", long17 == 300L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 1, (int) (short) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, 2);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
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
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray4, (int) (byte) 1, 2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 92L + "'", long12 == 92L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 10, (int) (byte) 0);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 1);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray4, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray6, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 55, (byte) 55, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, (int) ' ', (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(99L, byteArray7, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) 'a');
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray5, 51, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 110L + "'", long13 == 110L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray6, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray7, 97, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, 9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) 1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 104, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) -1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 4, byteArray5, 29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 125 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, (-2), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 97, byteArray4, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray7, 49, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.Class<?> wildcardClass8 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, 51, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 3");
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
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray6, 99, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray5, (int) (byte) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 110L + "'", long17 == 110L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray5, (int) (byte) 1, 2);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, (int) (short) 10, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 50, (byte) 32 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 92L + "'", long16 == 92L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray5, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) 'a', 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray9, 4, (-3));
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray9, 9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(127L, byteArray9, 0, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 49, byteArray7, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 1, (int) (short) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, 2);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray6, (int) '#', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2) + "'", int17 == (-2));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 10, (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(200L, byteArray7, 1, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 46 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 348L + "'", long23 == 348L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 348L + "'", long24 == 348L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 29, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 50, (int) (byte) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray5, (int) (short) 0, (int) (byte) 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 1, (int) (byte) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) -1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (short) 10);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (byte) 1, 1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 31, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 110L + "'", long20 == 110L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray6, (int) '4', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 110L + "'", long23 == 110L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, 51, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 110L + "'", long14 == 110L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray5, (-3), (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(381L, byteArray5, 31, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 77 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 110L + "'", long16 == 110L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 3, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-4), byteArray6, (-3), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 3");
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 50, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray8, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300L + "'", long17 == 300L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300L + "'", long21 == 300L);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray4, (int) (byte) 0, 2);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 29, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 49, (byte) 50, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 99L + "'", long19 == 99L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 5");
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
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray3, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 8, byteArray6, 31, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 10);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (-3), (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray7, (-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) (short) 10);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(99L, byteArray6, (-4), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray6, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray7, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 97, byteArray6, 9, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (int) (byte) 1, (int) (short) 1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (short) 1, 2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.Class<?> wildcardClass13 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 52, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) -1, 0);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray7, 0, 2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray7, (-4), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 381L + "'", long15 == 381L);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(200L, byteArray6, (int) (short) 0, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray5, (int) (short) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) '4');
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 50, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray9, 97, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(765L, byteArray9, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 765=1375 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 1);
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray4, 2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 8, byteArray4, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(400L, byteArray8, 3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 400=620 will not fit in octal number buffer of length 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 0, (byte) 100, (byte) 50, (byte) 48 });
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 512L + "'", long6 == 512L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 0);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (byte) 1, (-4));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray8, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 1, 50);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray6, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 1, (int) (short) 1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, 2);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (-1), (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(376L, byteArray6, (int) (short) 100, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 110L + "'", long4 == 110L);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) -1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray5, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
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
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" ", byteArray6, 0, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 32, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(127L, byteArray6, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 200L + "'", long20 == 200L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) (byte) 10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 31, byteArray6, 3, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(11L, byteArray7, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 400L + "'", long15 == 400L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray3, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 9, byteArray7, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (byte) 0, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray6, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 110L + "'", long7 == 110L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 110L + "'", long8 == 110L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 200L + "'", long20 == 200L);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(348L, byteArray1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 348=534 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray6, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 49, (byte) 32, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, (int) (byte) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 10, (int) (byte) 0);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(100L, byteArray4, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 110L + "'", long12 == 110L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, (int) (byte) -1);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) 'a', 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray7, 4, (-3));
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 400L + "'", long16 == 400L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) -1 };
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, 0);
        boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 10, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray8, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, 97, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '4', byteArray1, 6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 10, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(92L, byteArray5, (-1), (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 92=134 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 110L + "'", long18 == 110L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-3), 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 100, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 400L + "'", long19 == 400L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 400L + "'", long20 == 400L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 400L + "'", long21 == 400L);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(127L, byteArray6, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 127=177 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 2, byteArray6, 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 50, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 49, byteArray8, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 49=61 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300L + "'", long17 == 300L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 50 + "'", int20 == 50);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300L + "'", long21 == 300L);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray5, (int) (short) 0, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 29, byteArray5, 8, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 3");
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
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(92L, byteArray7, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 92=134 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 400L + "'", long18 == 400L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 1, byteArray8, 0, 2);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray8, 47, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 75 out of bounds for length 5");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 8, byteArray6, 47, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 400L + "'", long11 == 400L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) '4');
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (byte) 10, (-1));
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 4);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, 8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 400L + "'", long13 == 400L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, 51);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 49, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 110L + "'", long5 == 110L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 110L + "'", long9 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\nd" + "'", str12, "\nd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 51);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray5, (-3), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\nd" + "'", str13, "\nd");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 100, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 9);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
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
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(512L, byteArray5, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 512=1000 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 47);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(11L, byteArray6, (int) (short) 100, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 400L + "'", long14 == 400L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, (int) (short) 1, (int) (byte) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray6, 9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 0);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (byte) 1, (-4));
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray7, 8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 400L + "'", long24 == 400L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 0, (int) (byte) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 1, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(92L, byteArray6, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 196 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, (int) '4');
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 49, byteArray7, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 49=61 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray5, (int) (byte) 0, 2);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("1 ", byteArray5, (int) 'a', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) '4');
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 400L + "'", long9 == 400L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 400L + "'", long10 == 400L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d" + "'", str13, "d");
    }
}

