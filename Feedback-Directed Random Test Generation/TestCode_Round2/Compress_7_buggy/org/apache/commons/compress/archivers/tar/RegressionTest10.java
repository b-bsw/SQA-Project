package org.apache.commons.compress.archivers.tar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, (int) 'a', (int) (byte) 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 10, (-5));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 100, 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) (byte) -1, (-1));
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (short) 0, (int) (byte) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 97, 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (short) 1, (int) 'a');
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, 8, (-2));
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray12, 6, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, 34, (-2));
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 0, 100);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray12, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 465L + "'", long40 == 465L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\uffffd" + "'", str43, "\uffffd");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray8, (int) (short) 10, (-2));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (int) (short) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(186L, byteArray8, (-5), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 186=272 will not fit in octal number buffer of length -6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 2, 29);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 14, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 520L + "'", long10 == 520L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 52, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, (int) (byte) 1, (-12));
        java.lang.Class<?> wildcardClass32 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-11) + "'", int31 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) '4', (int) (byte) 0);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 0, 98);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray11, (int) (byte) 0, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(466L, byteArray11, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 466=722 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 50, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uffffd" + "'", str25, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uffffd" + "'", str32, "\uffffd");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 0, (int) (short) -1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 27, 0);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (-2), 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-5), byteArray11, 49, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 68 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2) + "'", int38 == (-2));
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray7, 0, 5);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 2);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, 9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 35, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00" + "'", str20, "00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00 " + "'", str23, "00 ");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 431L + "'", long24 == 431L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray9, (int) ' ', (int) (byte) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-5), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 0, byteArray7, (-2), 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 88 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray8, 99, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 465=721 will not fit in octal number buffer of length 0");
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
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) '4', (int) (byte) 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 6, byteArray9, 28, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 10, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, (int) '#', 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, (int) (byte) 100, (int) (short) 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray4, (-2), 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray4, (int) (byte) -1, (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 92, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) 'a', 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2) + "'", int25 == (-2));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 6, (int) (byte) -1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(177L, byteArray8, 98, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 195 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 0, (int) (byte) 1);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 27, byteArray9, 8, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uffff" + "'", str32, "\uffff");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 98);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 33, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-2), byteArray9, 33, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -2=1777777777777777777776 will not fit in octal number buffer of length -13");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffffd" + "'", str30, "\uffffd");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 5, (int) (byte) 0);
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
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 10, (int) (byte) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 0, 5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (-2), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 520L + "'", long13 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 520L + "'", long18 == 520L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 520L + "'", long19 == 520L);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, 97, 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 33);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.Class<?> wildcardClass44 = byteArray10.getClass();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 465L + "'", long43 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (byte) 10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, (int) (byte) 1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray10, 20, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 116 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 469L + "'", long32 == 469L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 469L + "'", long36 == 469L);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 52, (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 4, (int) (short) 10);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 520L + "'", long26 == 520L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, 6, (int) (byte) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, 32);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass26 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 520L + "'", long25 == 520L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 10, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) '4', 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) -1, 0);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray10, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 465L + "'", long40 == 465L);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 1, (int) 'a');
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, 8, (-2));
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray11, 6, (int) (short) 0);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, 34, (-2));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) 100, (int) (short) 0);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 95, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray11, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 465L + "'", long43 == 465L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(310L, byteArray9, 26, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 5");
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
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray11, 32, (-2));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 51, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 95, byteArray11, 98, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 110 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 30 + "'", int32 == 30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 28, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        byte[] byteArray1 = null;
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray1, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) '4', (int) (byte) 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 2, (int) (byte) 100);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, 30, 0);
        java.lang.Class<?> wildcardClass36 = byteArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 30 + "'", int35 == 30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00012", byteArray8, 6, (-3));
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 93, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 52, (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 4, (int) (short) 10);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 98);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 520L + "'", long12 == 520L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 520L + "'", long26 == 520L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 4, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 104 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 8, byteArray8, 23, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 115 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '4', (int) (byte) 0);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 98);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 51, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uffffd" + "'", str29, "\uffffd");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 100, 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 10, byteArray8, 14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray8, 27, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length -2");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray9, 95, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 193 out of bounds for length 5");
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
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray9, 99, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray9, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid octal digit at position 0 in '?1??'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 10, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(466L, byteArray9, 2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 30, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 33, (-3));
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-6), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray9, (int) (short) 10, 52);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (short) 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(255L, byteArray8, 0, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 10, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) '4', 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray10, (int) (short) -1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-5) + "'", int39 == (-5));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, (int) (short) -1, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 98, byteArray10, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98=142 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, 33, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 100, byteArray7, 2, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 520L + "'", long19 == 520L);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) '4', (int) (byte) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-4), 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 0, (-1));
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 97);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray10, 31, (int) (byte) -1);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray10, 93, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 100, byteArray10, 26, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 117 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 92 + "'", int28 == 92);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (int) (byte) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(520L, byteArray9, 0, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 21 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 99, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 52, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (byte) 1);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 30, byteArray10, 28, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 45 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 310L + "'", long29 == 310L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 310L + "'", long30 == 310L);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) -1, (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, 31, 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 9, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 31 + "'", int32 == 31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, (int) (short) 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) 'a', (int) (short) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 35, (-1));
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray10, 32, (-5));
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray10, 0, 35);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27 + "'", int32 == 27);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 0, (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 99, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray10, (-11), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-6), byteArray1, 31, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -6=1777777777777777777772 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00012", byteArray9, 6, (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (-4), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 31, byteArray1, (-3), 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 98);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray9, 6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -3");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffffd" + "'", str30, "\uffffd");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, (int) (short) 100);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) (byte) 1, (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) 'a', (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray10, 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 9, byteArray10, 26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 125 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 48, (byte) 48, (byte) 48, (byte) 50 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, 97, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 100, 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 97, (int) (short) 0);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 465L + "'", long39 == 465L);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 6);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 10, (int) (byte) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 28);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uffffd" + "'", str16, "\uffffd");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\uffffd" + "'", str22, "\uffffd");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 3, byteArray8, 14, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 5");
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
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray11, 31, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (-6), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray11, 8, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray1, 20, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray9, (int) (short) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray9, 97, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 10, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) '4', 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 28);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, 33);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray10, (-11), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 87 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\uffffd" + "'", str39, "\uffffd");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (short) 1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) '#', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-3), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray9, (-5), (int) (byte) -1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-6) + "'", int26 == (-6));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, 10, 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) '#', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(191L, byteArray3, (-1), 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 23 out of bounds for length 1");
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
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 1, (int) '#');
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray11, (int) '4', (int) (byte) 0);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 0, 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 98, (int) (byte) 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 35, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray11, 95, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 189 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 10, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) '4', 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(466L, byteArray10, (-12), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 466=722 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 52, 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray10, 0, 5);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 2, (int) (short) -1);
        java.lang.Class<?> wildcardClass34 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 49, (byte) 50 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 243L + "'", long30 == 243L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (short) 100);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, (int) (byte) 1, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 97, (-2));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 30, byteArray8, (int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 51, (byte) 54 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (-1), 0);
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray3, (int) 'a', (int) (byte) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-12), byteArray3, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 199 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(190L, byteArray9, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 5");
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
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray9, 99, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray9, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 0, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 49, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) '4');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass26 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 32, (-5));
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (-3));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 99, (-1));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, 0, 5);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 33, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, 35, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) '4');
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 52, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(465L, byteArray9, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 5");
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
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, 32);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (-4), (-6));
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray8, (int) (byte) -1, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 20, byteArray10, 23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 5");
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
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 2, (int) (short) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray7, 32, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) '#', (int) (byte) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray8, (int) (short) 10, (-2));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (int) (short) -1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 35, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(520L, byteArray8, 4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
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
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray11, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(469L, byteArray11, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uffffd" + "'", str25, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 28, byteArray11, 29, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 61 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uffffd" + "'", str25, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray9, (int) '4', 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 33);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray9, 33, (-4));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray10, 0, 1);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) '#', 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 23, byteArray10, (int) (short) 0, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 23=27 will not fit in octal number buffer of length -8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 259L + "'", long24 == 259L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259L + "'", long25 == 259L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 259L + "'", long26 == 259L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 259L + "'", long27 == 259L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 259L + "'", long28 == 259L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 259L + "'", long32 == 259L);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 2);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 0, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 92, byteArray8, 34, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (short) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 0, 0);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 100, byteArray10, 3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 2);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, (int) (byte) 0, (int) (short) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 6, (int) (byte) -1);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray10, 34, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\uffffd" + "'", str33, "\uffffd");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 465L + "'", long41 == 465L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "d" + "'", str44, "d");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 100, byteArray2, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 130 out of bounds for length 1");
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
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, (int) 'a');
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 8, (-2));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) 'a', 0);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 10, (int) (byte) -1);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 95);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 465L + "'", long32 == 465L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\uffffd" + "'", str41, "\uffffd");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 465L + "'", long42 == 465L);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 28, byteArray8, 52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 59 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) 'a');
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 8, (-2));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) ' ', (int) (byte) 0);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray9, 5, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-4), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (byte) 10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 29);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray10, (int) '4', (-3));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray10, (int) (short) 100, 32);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\uffffd" + "'", str32, "\uffffd");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 49 + "'", int35 == 49);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        byte[] byteArray1 = null;
        int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray1, 95, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 95 + "'", int4 == 95);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray10, 0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uffffd" + "'", str26, "\uffffd");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) 'a');
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(449L, byteArray8, 49, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 144 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 1);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 9, (-1));
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) ' ');
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 31, (-4));
        // The following exception was thrown during execution in test generation
        try {
            long long41 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 98, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uffff" + "'", str29, "\uffff");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\uffffd" + "'", str35, "\uffffd");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, 0, 5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, 2);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 9);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 29, byteArray8, (int) ' ', (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 29=35 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "00" + "'", str21, "00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "00 " + "'", str24, "00 ");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 431L + "'", long25 == 431L);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 1, (int) 'a');
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, 8, (-2));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) 'a', 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray11, (int) (short) 0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 5, byteArray11, (int) (byte) 100, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 48, (byte) 54, (byte) 52, (byte) 32, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 97, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 1, (int) 'a');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (-3), (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 97, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 51, byteArray8, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 51=63 will not fit in octal number buffer of length 0");
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
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (short) 0, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-4), byteArray8, 4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -4=1777777777777777777774 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) '4', (int) (byte) 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 2, (int) (byte) 100);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray10, 3, (int) (byte) 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 1, 0);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 10, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) '4', 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray11, (int) (short) -1, (-4));
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(0L, byteArray11, 27, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 124 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-5) + "'", int40 == (-5));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (short) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray10, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 0, byteArray7, 10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 107 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (byte) 0, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '4', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-2), 0);
        java.lang.Class<?> wildcardClass29 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray13, (int) (byte) -1, (-1));
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray13, (int) (short) 0, (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 97, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (short) 1, (int) 'a');
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, 8, (-2));
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray13, 6, (int) (short) 0);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, 34, (-2));
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray13, (int) (byte) 100, (int) (short) 0);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray13, 0, 3);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray13, (int) (byte) 100, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(520L, byteArray13, 0, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 465L + "'", long41 == 465L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 97, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray8, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, (-1), (int) (short) 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray13, (int) (byte) -1, (-1));
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray13, (int) (short) 0, (int) (byte) -1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 97, 0);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (short) 1, (int) 'a');
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, 8, (-2));
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray13, 6, (int) (short) 0);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray13, 34, (-2));
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray13, (int) (byte) 100, (int) (short) 0);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray13, 0, 3);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray13, (int) (byte) 100, (-2));
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray13, (int) (byte) 1, 27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 95, byteArray13, 34, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 465L + "'", long41 == 465L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (short) 10);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (short) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 29, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '4', byteArray10, (int) (short) 10, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 103 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 310L + "'", long28 == 310L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, 52);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 95);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 32, (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\uffffd" + "'", str21, "\uffffd");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\uffffd" + "'", str24, "\uffffd");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 97, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 98, byteArray9, 26, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 119 out of bounds for length 5");
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
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00012", byteArray10, (-12), 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) 'a', (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) 10, (int) (byte) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 28, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 520L + "'", long13 == 520L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 99, (-1));
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 93, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) 10, (-1));
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 2, (-2));
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 5, (-6));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 520L + "'", long11 == 520L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 97, byteArray8, (int) (short) -1, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -14");
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
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 100, byteArray9, 98, 5);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(414L, byteArray9, 14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 414=636 will not fit in octal number buffer of length 0");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (byte) 10);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 0, (-2));
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray10, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(620L, byteArray10, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 69 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 1, (int) 'a');
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, 8, (-2));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray11, 1, (-2));
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 30, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(465L, byteArray11, 49, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 79 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "d" + "'", str29, "d");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 28 + "'", int39 == 28);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) 'a', (int) (byte) 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 5, 0);
        java.lang.Class<?> wildcardClass13 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 10);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 98, byteArray9, 34, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 97, 0);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 26, 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uffffd" + "'", str26, "\uffffd");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 1, 0);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 10, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) '4', 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray11, (int) (short) -1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray11, (-5), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-5) + "'", int40 == (-5));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 98, byteArray9, (-5), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98=142 will not fit in octal number buffer of length -2");
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
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray0, (-5), 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray8, (int) (short) -1, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, 0, 5);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray8, 28, (int) (byte) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 52, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray9, (-5), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (-1));
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-6) + "'", int26 == (-6));
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, (int) '4', (int) (byte) 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 2, (int) (byte) 100);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 49, byteArray10, 31, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 0, (int) (short) -1);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 1);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 93, byteArray10, 51, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 93=135 will not fit in octal number buffer of length -1");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffff" + "'", str30, "\uffff");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 35, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 23, byteArray9, 100, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 1);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 100, byteArray10, 8, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uffff" + "'", str25, "\uffff");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (byte) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray8, 9, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 8, byteArray10, (-2), 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (short) 10);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 27, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 100, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) 'a', (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 10, (int) (byte) -1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, 0);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, 6, (int) (byte) -1);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 2, 32);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray10, 35, (int) (short) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 93, byteArray10, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 93=135 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 520L + "'", long17 == 520L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 520L + "'", long30 == 520L);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) 0, (int) (byte) 0);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) 'a', 0);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 14, byteArray10, (-2), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 48, (byte) 49, (byte) 54, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 0, 99);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) '4', (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, (int) (short) 10, (int) (short) -1);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray12, (int) (short) 0, (-3));
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray12, 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) ' ', byteArray12, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32=40 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uffffd" + "'", str26, "\uffffd");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (byte) 10, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray9, (-5), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 465L + "'", long13 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) 'a');
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 8, (-2));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) ' ', (int) (byte) 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 51, byteArray9, 28, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 28, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 93, byteArray1, 20, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 93=135 will not fit in octal number buffer of length -4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 9, byteArray7, 100, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 9=11 will not fit in octal number buffer of length -13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(431L, byteArray12, 100, (-11));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 431=657 will not fit in octal number buffer of length -12");
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
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 99, (-1));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 27, byteArray9, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
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
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (-1), (int) (short) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray12, 0, (int) (short) -1);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray12, (int) (short) 100, (int) (short) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (byte) 10, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, (int) '#', (-1));
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, (int) (byte) -1, (int) (byte) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray12, 32, 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray12, 95, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray12, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 93 + "'", int37 == 93);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
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
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 6, 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00 ", byteArray9, 32, (-12));
        java.lang.Class<?> wildcardClass42 = byteArray9.getClass();
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20 + "'", int41 == 20);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, 99);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 0, (-2));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "d" + "'", str26, "d");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(469L, byteArray1, 99, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 469=725 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 1 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 100, 0);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 93, byteArray3, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 93=135 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 98, byteArray8, 9, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 98=142 will not fit in octal number buffer of length -4");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray9, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 99, (-1));
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, 0, 5);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray10, 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '#', (-1));
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (byte) 10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 10, (int) (short) -1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, (int) (byte) 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (-2), 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uffffd" + "'", str26, "\uffffd");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 95, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) -1, byteArray7, 52, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray8, 27, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\uffffd" + "'", str17, "\uffffd");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) '#', (-1));
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray10, 0, 2);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 34, (int) (byte) 0);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(259L, byteArray10, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 208L + "'", long33 == 208L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 10, byteArray10, 0, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(100L, byteArray10, (int) (short) 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 49, (byte) 50 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 99 + "'", int19 == 99);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, (int) (short) -1, 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 465L + "'", long24 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 465L + "'", long25 == 465L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 95, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 27, 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 33, byteArray7, 51, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 146 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 52, 0);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 92, byteArray10, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 40 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 465L + "'", long32 == 465L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 95, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 27, 0);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass30 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 10, 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) '4', 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 28);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, 33);
        java.lang.Class<?> wildcardClass42 = byteArray9.getClass();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\uffffd" + "'", str38, "\uffffd");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "d" + "'", str41, "d");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (byte) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (byte) 0, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray10, (int) (short) 1, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) (byte) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32, byteArray7, 27, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 75 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 520L + "'", long14 == 520L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 520L + "'", long17 == 520L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 0, 99);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (short) 0, (int) (short) -1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 99, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 100, byteArray10, 92, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 189 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2) + "'", int34 == (-2));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 29, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 26, byteArray9, 30, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 26=32 will not fit in octal number buffer of length -1");
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
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) -1, (-1));
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (short) 0, (int) (byte) -1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 97, 0);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 1, (int) 'a');
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 8, (-2));
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray10, 1, (-2));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) -1, byteArray10, 93, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 189 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 465L + "'", long14 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 465L + "'", long32 == 465L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (-1), (int) (short) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-4), (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -12");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 465L + "'", long10 == 465L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '#', (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 29, 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 30, byteArray9, 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 92, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, (int) (short) 0, (-1));
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 99, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, 32, 0);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 1, 29);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00012", byteArray11, (int) ' ', (int) (short) -1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 99 + "'", int20 == 99);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 465L + "'", long33 == 465L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "d" + "'", str36, "d");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 31 + "'", int39 == 31);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 465L + "'", long40 == 465L);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 10, 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) '4', 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 96, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 100, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (byte) 10, 0);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) '#', (-1));
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (byte) -1, (int) (byte) 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray11, 31, 0);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray11, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 20, byteArray1, 51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 20=24 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (-1), 0);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 1, (int) (byte) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, 32, (int) (byte) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray2, 0, (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 98, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(431L, byteArray8, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 431=657 will not fit in octal number buffer of length -3");
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
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
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
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (-5), byteArray8, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 5");
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
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, (int) (short) 0, (int) (byte) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 14, byteArray8, 26, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 124 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, 0);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 35, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 97, byteArray8, 49, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 147 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) 'a', (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 10, (int) (byte) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 0, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray9, 6, (int) (byte) -1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, 32);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(1L, byteArray9, (int) (byte) 10, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 58 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 520L + "'", long16 == 520L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 520L + "'", long26 == 520L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 520L + "'", long27 == 520L);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(466L, byteArray1, (-5), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) 'a', (int) (short) -1);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 92, byteArray7, (-1), 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '#', (int) (byte) 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray9, (int) (short) 10, (-2));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd", byteArray9, 35, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 96, byteArray9, 31, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 10, 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) '#');
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, (int) (byte) 100);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, 2);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray10, (int) (byte) 0, (int) (short) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(10L, byteArray10, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\uffffd" + "'", str33, "\uffffd");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
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
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 51, byteArray10, 2, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) (byte) -1, (-1));
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray11, (int) (short) 0, (int) (byte) -1);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 97, 0);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (int) (short) 1, 0);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 10, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, (int) '4', 0);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00", byteArray11, (int) (short) -1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 10, byteArray11, (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 465L + "'", long37 == 465L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-5) + "'", int40 == (-5));
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) '#', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 10, (int) (short) -1);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 98, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(259L, byteArray9, 100, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 259=403 will not fit in octal number buffer of length -6");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\uffffd" + "'", str27, "\uffffd");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 100, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0", byteArray8, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\uffffd" + "'", str25, "\uffffd");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray1, (-11), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, (int) (short) 100);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 10, 0);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 6, (int) (byte) -1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 32, 0);
        int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, (-4));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 9, byteArray9, 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 9=11 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, (-1));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 6, byteArray7, 97, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 192 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 465L + "'", long23 == 465L);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray7, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 2, (int) (short) 10);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass23 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 465L + "'", long22 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, (-1));
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, 8);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) '#', (int) (byte) 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.Class<?> wildcardClass39 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (-5), byteArray8, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 93 out of bounds for length 5");
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
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 1, (int) (short) 10);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, 0, (int) (short) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 8, 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) ' ', (-6));
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 51, byteArray10, 99, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 193 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 310L + "'", long31 == 310L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 310L + "'", long32 == 310L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (int) (short) 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) '4', (int) (short) -1);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 92, (int) (byte) -1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(10L, byteArray8, 35, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 62 out of bounds for length 5");
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 1, byteArray7, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("00012", byteArray7, 51, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) '4', (int) (short) 0);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 0, 0);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray10, 35, (int) (short) 0);
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 465L + "'", long38 == 465L);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (-1), 0);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, (int) (byte) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray4, 32, (int) (byte) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, 0, (int) (short) 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray4, (-2), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 6, byteArray4, 92, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 6=6 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3) + "'", int19 == (-3));
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '4', (int) (byte) 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 98);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray9, 23, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 120 out of bounds for length 5");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\uffffd" + "'", str30, "\uffffd");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray1, 99, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (-1), (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (short) -1);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray10, (int) (byte) 0, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 52, 0);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray10, (int) (short) -1, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -7");
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) '#', (int) (short) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, 29, 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 1, 4);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 33, byteArray9, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 33=41 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 465L + "'", long17 == 465L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 255L + "'", long27 == 255L);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) (short) -1);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 100, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, 3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray9, (int) '4', 0);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 33);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 31, byteArray9, 51, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray11, (-1), (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, (int) 'a', (int) (short) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 1, byteArray11, 0, 1);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 5, (int) (byte) -1);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray11, 28, (int) (byte) -1);
        int int36 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff", byteArray11, (int) (short) -1, (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 100, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 49, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 465L + "'", long18 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 259L + "'", long25 == 259L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 259L + "'", long26 == 259L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 259L + "'", long30 == 259L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-12) + "'", int36 == (-12));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (-1), (int) (short) 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) -1, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffh", byteArray8, (-3), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray8, (-5), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 465L + "'", long12 == 465L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-4) + "'", int19 == (-4));
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (-1), (int) (short) 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) -1, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 95, 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 33, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 465L + "'", long11 == 465L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 465L + "'", long15 == 465L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 465L + "'", long16 == 465L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 465L + "'", long21 == 465L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 1, byteArray1, (int) (byte) 100, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
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
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 23, byteArray9, 5, 96);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 465L + "'", long26 == 465L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 465L + "'", long27 == 465L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 465L + "'", long28 == 465L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 465L + "'", long29 == 465L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 465L + "'", long30 == 465L);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) -1, (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, (int) (short) 0, (int) (byte) -1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 1, 0);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 10, 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) '4', 0);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 28);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 1, 33);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 1, count 35, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 465L + "'", long34 == 465L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 465L + "'", long35 == 465L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\uffffd" + "'", str38, "\uffffd");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "d" + "'", str41, "d");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) 'a', (int) (short) -1);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, (int) (byte) 10, (int) (byte) -1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray8, 0, 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffffd", byteArray8, 6, (int) (byte) -1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, 32);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 1, 98);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) -1, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 520L + "'", long15 == 520L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 520L + "'", long28 == 520L);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
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
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 30);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 0, count 97, length 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\uffffd" + "'", str38, "\uffffd");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, 99);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 0, (int) (short) -1);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 1);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray9, 9, (-1));
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 0, (int) ' ');
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 97, (int) (byte) 0);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 465L + "'", long19 == 465L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 465L + "'", long20 == 465L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uffffd" + "'", str23, "\uffffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uffff" + "'", str29, "\uffff");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\uffffd" + "'", str35, "\uffffd");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 465L + "'", long36 == 465L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 465L + "'", long40 == 465L);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (-1), (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (int) (short) -1);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, (int) (short) 100, (int) (short) -1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, 0);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, 99);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 1, (int) (byte) 10);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 0, (-2));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\uffff1", byteArray9, 34, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 465L + "'", long31 == 465L);
    }
}

