package org.apache.commons.compress.archivers.tar;

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
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray7, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100 });
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray4, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray8, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray4, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid octal digit at position 1 in 'd'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray9, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray7, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray7, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray7, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray4, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray9, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray8, 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray2, (int) (byte) 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 99, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) -1, byteArray8, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray1, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray9, 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray8, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray7, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass14 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray1, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 99, byteArray2, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, 99, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 1, byteArray2, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray9, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(100L, byteArray4, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(10L, byteArray2, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 60 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray7, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray8, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass15 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray2, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray7, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray2, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray2, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray2, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1 });
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (-1));
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
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass14 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray8, (int) (short) 0, (int) ' ');
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray2, 99, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 1");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray8, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 5");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray2, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray8, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 150 out of bounds for length 5");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray8, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray9, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray9, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', 99);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, (int) (short) -1, (int) (byte) 1);
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
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray7, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray9, (int) 'a', 10);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 100, byteArray9, 0, (int) (byte) 1);
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
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray8, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray9, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 105 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray7, 0, (int) (byte) 1);
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
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray8, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 134 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray8, (int) (short) 0, 100);
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
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray6, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray8, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(100L, byteArray8, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray7, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-1), byteArray8, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray9, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) '#');
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray8, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) -1, byteArray7, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -2");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray7, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray2, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray8, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) ' ');
        java.lang.Class<?> wildcardClass23 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (short) 10, (int) (byte) 10);
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
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray9, (int) '#', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 5");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray9, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1L, byteArray9, (int) '4', (int) (short) 0);
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
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray9, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length 0");
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
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass24 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray7, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 99, byteArray2, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray2, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(1L, byteArray8, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid octal digit at position 1 in 'd'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass16 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray9, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray7, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray9, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.Class<?> wildcardClass24 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass20 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray8, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -3");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray9, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray9, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) '4');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(520L, byteArray8, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray8, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray7, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass14 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray9, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) ' ', 1);
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray9, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray9, (int) (short) 1, 100);
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray9, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray8, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray2, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 10, byteArray9, 100, 0);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 32, length 5");
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
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass25 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray9, (int) (short) 100, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 35, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) ' ', 1);
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
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 52, length 5");
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
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray8, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -3");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray9, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 104, (byte) 105, (byte) 33, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray7, (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 6");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray8, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass21 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(1L, byteArray9, (-1), (int) (byte) 1);
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(100L, byteArray7, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray7, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length 0");
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(520L, byteArray7, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 42 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 10, (int) '#');
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (short) -1, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 32, 0);
        java.lang.Class<?> wildcardClass32 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, 99, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray2, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 0, byteArray9, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray7, (int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 0, byteArray9, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray8, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 1, byteArray7, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray8, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray1, (int) '4', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray8, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray8, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray7, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
            long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray9, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 100, length 5");
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uffffd" + "'", str26, "\uffffd");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
            long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 99, byteArray2, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray8, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 0, byteArray9, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -4 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray7, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 100, (int) (byte) 1);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(520L, byteArray1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 104, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray7, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray9, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (-1), (int) ' ');
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray8, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 100, (int) '4');
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray8, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        java.lang.Class<?> wildcardClass23 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray9, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray9, (-1), (int) (byte) -1);
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
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray9, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray8, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray9, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 5");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray9, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass18 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray9, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 28 out of bounds for length 5");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray2, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray9, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -2");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray9, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
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
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) '4', byteArray7, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray9, 100, 10);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray8, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((-1L), byteArray9, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 5");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 99, byteArray2, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 1");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
            java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 99, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, (int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid octal digit at position 0 in '?d'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray8, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray8, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 259L + "'", long22 == 259L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray8, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) -1, (int) ' ');
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
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray3, 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        java.lang.Class<?> wildcardClass22 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 35, (-1));
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray9, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray7, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray9, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 127 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray9, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(465L, byteArray9, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -1");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, (int) '4', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray9, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, (int) (byte) 100);
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray2, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray2, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass19 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray8, 1, (int) '#');
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
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray9, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 84 out of bounds for length 5");
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
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray9, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 97, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray9, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 35, byteArray9, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray9, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 151 out of bounds for length 5");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray7, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray9, (int) (short) 100, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray10, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 1 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 259L + "'", long22 == 259L);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 10, byteArray9, (int) '4', (-1));
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) 'a');
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(465L, byteArray8, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray9, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray9, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 55, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray8, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray9, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray11, (int) (short) 10, (int) ' ');
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
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray8, (-1), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray9, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray10, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray8, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 128 out of bounds for length 5");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 35, byteArray9, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray9, 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((-1L), byteArray9, 31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 125 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = byteArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 100, (-1));
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
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray7, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray9, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray10, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\uffffd" + "'", str28, "\uffffd");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 100, byteArray9, 10, (-1));
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray7, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray9, 2, 0);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) '4', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray2, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray1, 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 0, byteArray9, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray2, 99, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 132 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray8, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray9, (int) (short) 0, (int) '4');
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
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray9, (int) (short) 10, 100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray8, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, 0);
        java.lang.Class<?> wildcardClass20 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray8, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 5");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray9, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray9, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 466L + "'", long6 == 466L);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32, byteArray7, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray9, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 84 out of bounds for length 5");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length 0");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray9, 0, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass18 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 1");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 1, byteArray9, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray7, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 198 out of bounds for length 6");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 32, byteArray9, 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 32, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, 99, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 466L + "'", long6 == 466L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 31, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-1), byteArray9, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 31, byteArray8, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 131 out of bounds for length 5");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 31, byteArray9, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -1");
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
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray6, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 466L + "'", long7 == 466L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) ' ', (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 32, byteArray9, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 100, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (-1), 2);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray2, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 2, byteArray9, 1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (short) 100);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, 99);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray9, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 99=143 will not fit in octal number buffer of length -2");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), 52);
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
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 35, byteArray8, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray9, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -3");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((-1L), byteArray1, 99, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 99, byteArray10, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray9, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 5");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray9, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 67 out of bounds for length 5");
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 32);
        java.lang.Class<?> wildcardClass23 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(100L, byteArray7, 99, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 32, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray9, (int) (short) 100, (int) '4');
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray7, 99, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 10, byteArray10, 99, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 5");
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray7, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 100, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray9, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 5");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 100, 52);
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
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 32, byteArray8, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray8, 0, 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass23 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 259L + "'", long22 == 259L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 10, byteArray9, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 10, byteArray3, 99, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 1");
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
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, (int) (byte) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 31, byteArray8, (int) '#', 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(469L, byteArray9, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length -2");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray9, (int) (byte) 1, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffffd" + "'", str30, "\uffffd");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        byte[] byteArray0 = null;
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(469L, byteArray9, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length -1");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 52, byteArray7, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 82 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray9, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
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
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray8, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -2");
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray2, (int) (byte) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray7, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 99, byteArray9, (int) (short) 1, 99);
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
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 32, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) '#', 0);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray10, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -2");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(259L, byteArray10, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 259=403 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray9, 99, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray8, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 100, (int) (byte) 1);
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
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) ' ', byteArray9, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 84 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 31, byteArray10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length 0");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, 0, 1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(259L, byteArray9, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) ' ', byteArray9, 32, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 5");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray9, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 48, (byte) 32, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 100, byteArray8, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (short) -1, (int) '#');
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
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray9, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 52, byteArray7, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) ' ', (int) (byte) 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray9, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray8, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 100, byteArray2, 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 100, byteArray8, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 99, byteArray7, (int) '#', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 10 });
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 52, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass21 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 10, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) -1, byteArray2, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray10, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray10, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 466L + "'", long6 == 466L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray9, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 62 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray3, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 2=2 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 99, (-1));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 10, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 32, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray8, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 5");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray9, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 191 out of bounds for length 5");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray9, 0, 97);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) '#');
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 52, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        byte[] byteArray1 = null;
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray8, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 32, byteArray3, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray9, (int) (short) 1, 32);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray8, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 31=37 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(10L, byteArray9, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray12, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32, byteArray8, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray9, (-1), 35);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffffd" + "'", str30, "\uffffd");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 104, (byte) 105, (byte) 33, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray8, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray9, (int) (short) 0, 52);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray9, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uffffd" + "'", str32, "\uffffd");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) '#', 31);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass27 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, 100, 31);
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 'a', byteArray8, 10, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 1, (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, 0);
        java.lang.Class<?> wildcardClass31 = byteArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray11, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 5");
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
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 31, byteArray10, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\uffffd" + "'", str28, "\uffffd");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray9, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray9, (int) (byte) -1, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray9, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 5");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray3, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 0, byteArray2, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray8, 52, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 150 out of bounds for length 5");
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 31, 2);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(520L, byteArray9, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 520=1010 will not fit in octal number buffer of length -1");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray8, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 5");
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
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
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
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 100, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 100, length 5");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        java.lang.String str4 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (-1), 0);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 1, (int) (byte) 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid octal digit at position 0 in 'd'");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray8, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 99, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass36 = byteArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray8, 35, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray8, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 94 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 99, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(469L, byteArray9, 10, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 'a', byteArray10, 99, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 106 out of bounds for length 5");
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
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray7, (-1), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray9, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 95 out of bounds for length 5");
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 31, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray8, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10=12 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 100, byteArray10, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((-1L), byteArray3, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 1, byteArray1, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

