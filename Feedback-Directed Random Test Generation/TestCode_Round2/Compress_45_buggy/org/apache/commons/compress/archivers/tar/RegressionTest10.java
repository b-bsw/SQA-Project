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
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) (short) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray5, 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 32, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.Class<?> wildcardClass12 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 367L + "'", long11 == 367L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 3, (int) (short) 1);
        int int22 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray8, (int) (byte) 0, 4);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray32, (int) (byte) 0);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) ' ', (-1));
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray50 = new byte[] { (byte) 10 };
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding59 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 1, (int) (byte) 1, zipEncoding59);
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) (byte) 0, (int) (byte) -1, zipEncoding59);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 2, (int) (short) 0, zipEncoding59);
        byte[] byteArray66 = new byte[] { (byte) 10 };
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray66);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, (int) (short) -1, (int) (short) 0, zipEncoding70);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding74 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, (int) 'a', (int) (byte) -1, zipEncoding74);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) 'a', (int) (short) 0, zipEncoding74);
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray32, (int) (short) 0, 1, zipEncoding74);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (-1), (int) (byte) 0, zipEncoding74);
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long82 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray8, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 320L + "'", long46 == 320L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\001" + "'", str60, "\001");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(zipEncoding74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 276L + "'", long79 == 276L);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, 0, 1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (-1));
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray8, 2, (int) (byte) 1);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 1, (int) (short) 1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (-1));
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\n", byteArray8, 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(208L, byteArray8, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray7, 4, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 3, zipEncoding41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 48, (byte) 32, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (short) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 1, byteArray7, 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 49, (byte) 32, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(204L, byteArray6, 6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 204=314 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, (int) (byte) -1, zipEncoding31);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (short) 0, zipEncoding31);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, (int) (byte) 1, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 310L + "'", long35 == 310L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 5, (int) (short) -1);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(10L, byteArray7, (int) (byte) 0, 5);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) ' ', (-1));
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray50, 0, 0);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray50, 1, 3);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long67 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray66);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) ' ', (-1));
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray75);
        byte[] byteArray83 = new byte[] { (byte) 10 };
        long long84 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray83);
        byte[] byteArray89 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding92 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray89, 1, (int) (byte) 1, zipEncoding92);
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray83, (int) (byte) 0, (int) (byte) -1, zipEncoding92);
        java.lang.String str95 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 2, (int) (short) 0, zipEncoding92);
        java.lang.String str96 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, (int) '#', (-1), zipEncoding92);
        java.lang.String str97 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 0, (int) (short) -1, zipEncoding92);
        java.lang.String str98 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (short) -1, zipEncoding92);
        java.lang.Class<?> wildcardClass99 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 48, (byte) 49, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 227L + "'", long40 == 227L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 320L + "'", long54 == 320L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 365L + "'", long67 == 365L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 320L + "'", long79 == 320L);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 10L + "'", long84 == 10L);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "\001" + "'", str93, "\001");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 365L + "'", long8 == 365L);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray41 = new byte[] { (byte) 100 };
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) ' ', (-1));
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 2, (int) (short) 0, zipEncoding73);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray47, (int) '#', (-1), zipEncoding73);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) (byte) 100, (int) (byte) -1, zipEncoding73);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) '#', (int) (byte) -1, zipEncoding73);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\n\n\n\ufffd", byteArray7, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 310L + "'", long37 == 310L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 365L + "'", long48 == 365L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 320L + "'", long60 == 320L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\n", byteArray6, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray46, (int) (byte) 0);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) ' ', (-1));
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        byte[] byteArray64 = new byte[] { (byte) 10 };
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding73 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, 1, (int) (byte) 1, zipEncoding73);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, (int) (byte) 0, (int) (byte) -1, zipEncoding73);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, 2, (int) (short) 0, zipEncoding73);
        byte[] byteArray80 = new byte[] { (byte) 10 };
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray80);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding84 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) (short) -1, (int) (short) 0, zipEncoding84);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, (int) 'a', (int) (byte) -1, zipEncoding88);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) 'a', (int) (short) 0, zipEncoding88);
        int int91 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray46, (int) (short) 0, 1, zipEncoding88);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 4, (int) (byte) 10, zipEncoding88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 310L + "'", long36 == 310L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 320L + "'", long60 == 320L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\001" + "'", str74, "\001");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 10L + "'", long81 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (byte) -1, 0);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 1, (int) (short) 0);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (-1));
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (short) -1, (int) (short) 0);
        int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray60, (int) (short) 0, (int) (byte) 1);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray74 = new byte[] { (byte) 10 };
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray74);
        byte[] byteArray80 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray80, 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) (byte) 0, (int) (byte) -1, zipEncoding83);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 0, (int) (short) 0, zipEncoding83);
        int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray51, (int) (short) 1, (int) (byte) 1, zipEncoding83);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, 1, zipEncoding83);
        int int89 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray7, 2, (int) (byte) -1, zipEncoding83);
        // The following exception was thrown during execution in test generation
        try {
            long long92 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 320L + "'", long37 == 320L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 310L + "'", long70 == 310L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\001" + "'", str84, "\001");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\n" + "'", str88, "\n");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(190L, byteArray6, (int) ' ', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 320L + "'", long44 == 320L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 320L + "'", long45 == 320L);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(366L, byteArray2, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 366=556 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '4', (-1), zipEncoding37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) ' ', (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (short) -1, (int) (short) 0, zipEncoding23);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) 'a', (int) (byte) -1, zipEncoding27);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 2, (int) (byte) 1, zipEncoding27);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) (short) 0, 0);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (short) -1, (int) (short) 0, zipEncoding40);
        int int42 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray11, 0, (-1), zipEncoding40);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray11, 1, 2);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 3, 0);
        int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(402L, byteArray11, 1, 4);
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray11, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) '#', byteArray11, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 133 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 54, (byte) 50, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 220L + "'", long43 == 220L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 201L + "'", long47 == 201L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 196L + "'", long54 == 196L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 5, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(550L, byteArray6, (-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 3);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (byte) 0, 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 320L + "'", long21 == 320L);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, 0);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) ' ', (-1));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray27, 2);
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 2, 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray27, (int) (short) 0, 4);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray27, 3, (int) '#');
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray46 = null;
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) ' ', (-1));
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) 1, zipEncoding71);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 2, (int) (short) 0, zipEncoding71);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (short) 1, (int) (byte) 0, zipEncoding71);
        int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d\001\001", byteArray27, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (byte) 10, zipEncoding71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 320L + "'", long31 == 320L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 320L + "'", long58 == 320L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\001" + "'", str72, "\001");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n03 d", byteArray8, 0, (int) (byte) 1, zipEncoding13);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 2, byteArray8, 3, 2);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 50, (byte) 32, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipEncoding13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) (short) -1);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) ' ', (-1));
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray27 = new byte[] { (byte) 10 };
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, 1, (int) (byte) 1, zipEncoding36);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) (byte) 0, (int) (byte) -1, zipEncoding36);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 2, (int) (short) 0, zipEncoding36);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 1, zipEncoding36);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(220L, byteArray5, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 220=334 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 320L + "'", long23 == 320L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\001" + "'", str37, "\001");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "d" + "'", str40, "d");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 865L + "'", long41 == 865L);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, 0, 1);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) -1, (int) (short) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray22, (int) (short) 0, (int) (byte) 1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) 1, zipEncoding45);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) 0, (int) (byte) -1, zipEncoding45);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 0, (int) (short) 0, zipEncoding45);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, (int) (short) 0, zipEncoding45);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (-1));
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (short) -1, (int) (short) 0);
        int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray60, (int) (short) 0, (int) (byte) 1);
        long long70 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, 1, (int) (byte) 1, zipEncoding78);
        int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray60, 0, (-1), zipEncoding78);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 5, (int) (byte) -1, zipEncoding78);
        long long82 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            long long88 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 365L + "'", long7 == 365L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 310L + "'", long32 == 310L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\001" + "'", str46, "\001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 158L + "'", long50 == 158L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 310L + "'", long70 == 310L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\001" + "'", str79, "\001");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 158L + "'", long82 == 158L);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) -1, (int) (short) 0, zipEncoding19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) 'a', (int) (byte) -1, zipEncoding23);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 2, (int) (byte) 1, zipEncoding23);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, 0);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (short) -1, (int) (short) 0, zipEncoding36);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (-1), zipEncoding36);
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean41 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 220L + "'", long39 == 220L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 220L + "'", long43 == 220L);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        byte[] byteArray1 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ufffd", byteArray1, 0, (int) (byte) 10, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(402L, byteArray7, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 640L + "'", long12 == 640L);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) (short) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray25 = new byte[] { (byte) 10 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (short) -1, (int) (short) 0, zipEncoding29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) 'a', (int) (byte) -1, zipEncoding33);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\n", byteArray6, 0, (int) (short) 10, zipEncoding33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 590L + "'", long21 == 590L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) 1);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 0, (int) (byte) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, (int) (byte) 1, zipEncoding48);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray30, 0, (-1), zipEncoding48);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 1, zipEncoding48);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\001" + "'", str49, "\001");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "d" + "'", str51, "d");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray7, 3, 1);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) ' ', (-1));
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray56, 0, 0);
        int int66 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray56, 1, 3);
        byte[] byteArray70 = new byte[] { (byte) 10 };
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding74 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (short) -1, (int) (short) 0, zipEncoding74);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) 'a', (int) (byte) -1, zipEncoding78);
        int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray56, (int) (byte) 1, 0, zipEncoding78);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 1, (-1), zipEncoding78);
        long long82 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long83 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean84 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 320L + "'", long60 == 320L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 190L + "'", long82 == 190L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 190L + "'", long83 == 190L);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (-1));
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 3);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 0, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 1);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 'a', byteArray7, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (int) (short) 0);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray8, 3, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(311L, byteArray8, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 311=467 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 55, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(183L, byteArray7, (int) (short) 0, 4);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 50, (byte) 54, (byte) 55, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(48L, byteArray7, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 48=60 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, (int) (short) -1);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray26 = new byte[] { (byte) 10 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 1, (int) (byte) 1, zipEncoding35);
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) (byte) 0, (int) (byte) -1, zipEncoding35);
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 2, (int) (short) 0, zipEncoding35);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, 1, zipEncoding35);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 0, 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 320L + "'", long22 == 320L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\001" + "'", str36, "\001");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 865L + "'", long40 == 865L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        boolean boolean42 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 0);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray18, (int) (short) 0, (int) (byte) 1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, (int) (short) 1, (int) (byte) 1, zipEncoding41);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (-1));
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray68 = new byte[] { (byte) 10 };
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding77 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, 1, (int) (byte) 1, zipEncoding77);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, (int) (byte) 0, (int) (byte) -1, zipEncoding77);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 2, (int) (short) 0, zipEncoding77);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) '#', (-1), zipEncoding77);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 100, (int) (short) -1, zipEncoding77);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray9, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 310L + "'", long28 == 310L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 365L + "'", long52 == 365L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 320L + "'", long64 == 320L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\001" + "'", str78, "\001");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (int) (byte) -1);
        boolean boolean44 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 0);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, 3);
        boolean boolean49 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 4, (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\ndd" + "'", str47, "\ndd");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 320L + "'", long50 == 320L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, (int) (byte) 1, zipEncoding6);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (byte) -1, 0);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray18, (int) (short) 1, (int) (short) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray18, (int) (short) 1, 4);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) ' ', (-1));
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) (short) -1, (int) (short) 0);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray40, (int) (short) 0, (int) (byte) 1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray40);
        byte[] byteArray54 = new byte[] { (byte) 10 };
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding63 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 1, (int) (byte) 1, zipEncoding63);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) (byte) 0, (int) (byte) -1, zipEncoding63);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 0, (int) (short) 0, zipEncoding63);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 3, 2, zipEncoding63);
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 2, (int) (short) 0, zipEncoding63);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray3, (-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 11L + "'", long8 == 11L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 48, (byte) 48, (byte) 48, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 320L + "'", long25 == 320L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 310L + "'", long50 == 310L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 10L + "'", long55 == 10L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\001" + "'", str64, "\001");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "0 " + "'", str67, "0 ");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, 0, 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray10, 1, 3);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 2, (int) (short) 0, zipEncoding52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) '#', (-1), zipEncoding52);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 0, (int) (short) -1, zipEncoding52);
        int int60 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, 4);
        boolean boolean62 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, 1);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, (int) (byte) 0, (int) ' ');
        int int68 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000dd", byteArray10, 2, (int) (short) -1);
        int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(180L, byteArray10, (int) (byte) 1, 4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 50, (byte) 54, (byte) 52, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 365L + "'", long27 == 365L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 320L + "'", long39 == 320L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (-1));
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) (short) -1, (int) (short) 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray24, (int) (short) 0, (int) (byte) 1);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 1, (int) (byte) 1, zipEncoding42);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray24, 0, (-1), zipEncoding42);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 5, 0, zipEncoding42);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 0, byteArray7, (int) (short) 0, 4);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(367L, byteArray7, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 108 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\001" + "'", str43, "\001");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 276L + "'", long49 == 276L);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) ' ', (-1));
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray54);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, 1, (int) (byte) 1, zipEncoding71);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (byte) 0, (int) (byte) -1, zipEncoding71);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 2, (int) (short) 0, zipEncoding71);
        byte[] byteArray78 = new byte[] { (byte) 10 };
        long long79 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray78);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, (int) (short) -1, (int) (short) 0, zipEncoding82);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding86 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray78, (int) 'a', (int) (byte) -1, zipEncoding86);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, (int) 'a', (int) (short) 0, zipEncoding86);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 100, (int) (byte) 0, zipEncoding86);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 'a', byteArray6, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 97=141 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 320L + "'", long58 == 320L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\001" + "'", str72, "\001");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 10L + "'", long79 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(zipEncoding86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 0);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, (int) (byte) 1);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        long long39 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, 2, (int) (short) 0, zipEncoding52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) '#', (-1), zipEncoding52);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding52);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (int) (byte) -1, zipEncoding52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 365L + "'", long27 == 365L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 320L + "'", long39 == 320L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, (int) ' ', (-1));
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray27);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (byte) 0, (int) (byte) -1, zipEncoding44);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 2, (int) (short) 0, zipEncoding44);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) '#', (-1), zipEncoding44);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0, zipEncoding44);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, 1, (int) (byte) -1);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(186L, byteArray8, (int) (byte) 1, 4);
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long60 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 50, (byte) 55, (byte) 50, (byte) 32, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 365L + "'", long19 == 365L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 320L + "'", long31 == 320L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 640L + "'", long53 == 640L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 542L + "'", long57 == 542L);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, (int) (short) 0, zipEncoding25);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (short) -1, (int) (short) 0, zipEncoding36);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) 'a', (int) (byte) -1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', (int) (short) 0, zipEncoding40);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray8, 3, 1);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) ' ', (-1));
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray57, 0, 0);
        int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray57, 1, 3);
        byte[] byteArray71 = new byte[] { (byte) 10 };
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray71);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) (short) -1, (int) (short) 0, zipEncoding75);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) 'a', (int) (byte) -1, zipEncoding79);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray57, (int) (byte) 1, 0, zipEncoding79);
        int int82 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 1, (-1), zipEncoding79);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(365L, byteArray8, (int) (short) 0, 5);
        boolean boolean87 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 1);
        long long88 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 53, (byte) 53, (byte) 53, (byte) 32, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 320L + "'", long61 == 320L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L + "'", long72 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 191L + "'", long88 == 191L);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 3);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 1);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 1);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 3, (int) (byte) 1);
        boolean boolean30 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) (short) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(542L, byteArray6, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 51, (byte) 54, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) '#', 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(244L, byteArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 39 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 0, (int) (short) 1);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 10, 0);
        java.lang.Class<?> wildcardClass32 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) ' ', (-1));
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (short) -1, (int) (short) 0);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray46, (int) (short) 0, (int) (byte) 1);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 0, (int) (short) 0, zipEncoding69);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray37, (int) (short) 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, (int) (byte) -1, zipEncoding69);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long79 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 320L + "'", long26 == 320L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 310L + "'", long56 == 310L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray10, (int) (short) 1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 3, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, 5);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray36, (int) (byte) 0);
        boolean boolean40 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray36, (int) (byte) 1);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, (int) ' ', (-1));
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray55);
        byte[] byteArray63 = new byte[] { (byte) 10 };
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray63);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding72 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray69, 1, (int) (byte) 1, zipEncoding72);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, (int) (byte) 0, (int) (byte) -1, zipEncoding72);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray55, 2, (int) (short) 0, zipEncoding72);
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) '#', (-1), zipEncoding72);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (short) -1, (int) (short) 0, zipEncoding72);
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (short) 1, 2, zipEncoding72);
        int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (int) (byte) 1, zipEncoding72);
        boolean boolean81 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, 3);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) ' ', byteArray10, 2, 3);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n03 d", byteArray10, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 100, (byte) 52, (byte) 48, (byte) 32, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 367L + "'", long14 == 367L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 365L + "'", long26 == 365L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 365L + "'", long27 == 365L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 365L + "'", long47 == 365L);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 320L + "'", long59 == 320L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\001" + "'", str73, "\001");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\nd" + "'", str78, "\nd");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 5 + "'", int84 == 5);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 232L + "'", long85 == 232L);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray8, 1, 3);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(3L, byteArray8, (int) (byte) 1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 241L + "'", long22 == 241L);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 0, (-1));
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\n", byteArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(231L, byteArray8, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 231=347 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) 'a', (int) (byte) -1, zipEncoding24);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 2, (int) (byte) 1, zipEncoding24);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str5 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 0, (int) (byte) 1);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 1, (int) (byte) 1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (byte) 0, (int) (byte) -1, zipEncoding40);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 0, (int) (short) 0, zipEncoding40);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, (int) (short) 1, (int) (byte) 1, zipEncoding40);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 0, byteArray8, 0, 5);
        long long48 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 0, (byte) 32, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 310L + "'", long27 == 310L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\001" + "'", str41, "\001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 276L + "'", long48 == 276L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 276L + "'", long49 == 276L);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 10, (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray33, (int) (byte) 0);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray33, (int) (byte) 1);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, (int) ' ', (-1));
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray52);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 2, (int) (short) 0, zipEncoding69);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) '#', (-1), zipEncoding69);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) -1, (int) (short) 0, zipEncoding69);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) 1, 2, zipEncoding69);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\0000", byteArray6, (int) ' ', (int) (short) 10, zipEncoding69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 34 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 365L + "'", long23 == 365L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 365L + "'", long24 == 365L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 365L + "'", long44 == 365L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 320L + "'", long56 == 320L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\nd" + "'", str75, "\nd");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 1, 0);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 365L + "'", long8 == 365L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 365L + "'", long9 == 365L);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, 2);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "dd" + "'", str39, "dd");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray7, (int) (short) 1, 4);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) -1);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, (int) (byte) -1);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean48 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray46, (int) (byte) 0);
        boolean boolean50 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray46, (int) (byte) 1);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, (int) ' ', (-1));
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray65);
        byte[] byteArray73 = new byte[] { (byte) 10 };
        long long74 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray73);
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray79, 1, (int) (byte) 1, zipEncoding82);
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray73, (int) (byte) 0, (int) (byte) -1, zipEncoding82);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, 2, (int) (short) 0, zipEncoding82);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) '#', (-1), zipEncoding82);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (short) -1, (int) (short) 0, zipEncoding82);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) 1, 2, zipEncoding82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 3, (int) '4', zipEncoding82);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 48, (byte) 48, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 186L + "'", long21 == 186L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 365L + "'", long36 == 365L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 365L + "'", long37 == 365L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 365L + "'", long57 == 365L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 320L + "'", long69 == 320L);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 10L + "'", long74 == 10L);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\001" + "'", str83, "\001");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\nd" + "'", str88, "\nd");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (short) 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 1);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 3, 0, zipEncoding17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipEncoding17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, 2);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(183L, byteArray7, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 183=267 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 310L + "'", long22 == 310L);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray25, 0, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray25, 1, 3);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) ' ', (-1));
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 2, (int) (short) 0, zipEncoding67);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) '#', (-1), zipEncoding67);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) -1, zipEncoding67);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0, zipEncoding67);
        boolean boolean75 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 4);
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0 ", byteArray8, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(232L, byteArray8, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 232=350 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 365L + "'", long42 == 365L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 320L + "'", long54 == 320L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 320L + "'", long76 == 320L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) ' ', (-1));
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (short) -1, (int) (short) 0);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, (int) (short) 0, (int) (byte) 1);
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding44 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, 1, (int) (byte) 1, zipEncoding44);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (byte) 0, (int) (byte) -1, zipEncoding44);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 0, (int) (short) 0, zipEncoding44);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray5, 3, (int) (short) 0, zipEncoding44);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid byte 10 at offset 1 in '0?' len=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 310L + "'", long31 == 310L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\001" + "'", str45, "\001");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) 'a', (int) (byte) -1, zipEncoding24);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 2, (int) (byte) 1, zipEncoding24);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 0, 0);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) ' ', (-1));
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray38);
        byte[] byteArray46 = new byte[] { (byte) 10 };
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding55 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray52, 1, (int) (byte) 1, zipEncoding55);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (byte) 0, (int) (byte) -1, zipEncoding55);
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 2, (int) (short) 0, zipEncoding55);
        byte[] byteArray62 = new byte[] { (byte) 10 };
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) -1, (int) (short) 0, zipEncoding66);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding70 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) 'a', (int) (byte) -1, zipEncoding70);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, (int) 'a', (int) (short) 0, zipEncoding70);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d\n\n\n", byteArray8, 2, 2, zipEncoding70);
        int int76 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0 ", byteArray8, 4, (int) (byte) 0);
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 220L + "'", long30 == 220L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\001" + "'", str56, "\001");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(zipEncoding70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 320L + "'", long77 == 320L);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n03 d", byteArray8, 0, (int) (byte) 1, zipEncoding13);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (-1));
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray24);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray24, 0, 0);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, (int) ' ', (int) (short) 0);
        int int37 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\nd", byteArray24, 3, 2);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray45, 0, 1);
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) ' ', (-1));
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (short) -1, (int) (short) 0);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray61, (int) (short) 0, (int) (byte) 1);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray75 = new byte[] { (byte) 10 };
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray75);
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding84 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray81, 1, (int) (byte) 1, zipEncoding84);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) (byte) 0, (int) (byte) -1, zipEncoding84);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 0, (int) (short) 0, zipEncoding84);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray45, 3, (int) (short) 0, zipEncoding84);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray24, 100, 0, zipEncoding84);
        java.lang.String str90 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, 2, zipEncoding84);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray8, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipEncoding13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 320L + "'", long28 == 320L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 365L + "'", long46 == 365L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 310L + "'", long71 == 310L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L + "'", long76 == 10L);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\001" + "'", str85, "\001");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\n\n" + "'", str90, "\n\n");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(402L, byteArray1, (int) (byte) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (byte) 10, (-1));
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 3);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray8, (int) (byte) 0, 5);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 0, (int) (byte) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray44 = new byte[] { (byte) 10 };
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 1, (int) (byte) 1, zipEncoding53);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray44, (int) (byte) 0, (int) (byte) -1, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, 0, (int) (short) 0, zipEncoding53);
        int int57 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, 4, zipEncoding53);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray8, 4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long63 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray8, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 48 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 183L + "'", long21 == 183L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\001" + "'", str54, "\001");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, (int) (short) 1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 3, 1);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 5);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 3);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 1);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, 5);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) ' ', (-1));
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray35, (int) (byte) 0, (int) (short) 0);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) ' ', (-1));
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, (int) (short) -1, (int) (short) 0);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray61, (int) (short) 0, (int) (byte) 1);
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray61);
        byte[] byteArray75 = new byte[] { (byte) 10 };
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray75);
        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding84 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray81, 1, (int) (byte) 1, zipEncoding84);
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) (byte) 0, (int) (byte) -1, zipEncoding84);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray61, 0, (int) (short) 0, zipEncoding84);
        int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray52, (int) (short) 1, (int) (byte) 1, zipEncoding84);
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) 1, (int) (byte) 1, zipEncoding84);
        // The following exception was thrown during execution in test generation
        try {
            int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000d\001\n\ufffd", byteArray8, (int) '#', (int) (byte) 0, zipEncoding84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 35 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 367L + "'", long12 == 367L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 367L + "'", long18 == 367L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001d\001\n\ufffd" + "'", str25, "\001d\001\n\ufffd");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 367L + "'", long26 == 367L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 310L + "'", long71 == 310L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L + "'", long76 == 10L);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\001" + "'", str85, "\001");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "d" + "'", str89, "d");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, (int) (byte) 0);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray41, (int) (byte) 0);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) ' ', (-1));
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray59 = new byte[] { (byte) 10 };
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding68 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray65, 1, (int) (byte) 1, zipEncoding68);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (byte) 0, (int) (byte) -1, zipEncoding68);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, 2, (int) (short) 0, zipEncoding68);
        byte[] byteArray75 = new byte[] { (byte) 10 };
        long long76 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray75);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) (short) -1, (int) (short) 0, zipEncoding79);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding83 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str84 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) 'a', (int) (byte) -1, zipEncoding83);
        java.lang.String str85 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) 'a', (int) (short) 0, zipEncoding83);
        int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray41, (int) (short) 0, 1, zipEncoding83);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d", byteArray6, (int) (short) 1, (int) (short) 10, zipEncoding83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 320L + "'", long28 == 320L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 320L + "'", long55 == 320L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 10L + "'", long60 == 10L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\001" + "'", str69, "\001");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 10L + "'", long76 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(zipEncoding83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, 2);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(268L, byteArray7, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 268=414 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 310L + "'", long35 == 310L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dd" + "'", str40, "dd");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 310L + "'", long41 == 310L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 310L + "'", long42 == 310L);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 0, (-1));
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(231L, byteArray2, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 231=347 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (short) -1, (int) (short) 0);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray34, (int) (short) 0, (int) (byte) 1);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray48 = new byte[] { (byte) 10 };
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray48);
        byte[] byteArray54 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding57 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str58 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray54, 1, (int) (byte) 1, zipEncoding57);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, (int) (byte) 0, (int) (byte) -1, zipEncoding57);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 0, (int) (short) 0, zipEncoding57);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray25, (int) (short) 1, (int) (byte) 1, zipEncoding57);
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (byte) 0, (int) (short) 0, zipEncoding57);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(757L, byteArray7, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 197 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 310L + "'", long44 == 310L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\001" + "'", str58, "\001");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (byte) 0, (int) (short) 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(183L, byteArray7, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 183=267 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 320L + "'", long19 == 320L);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) -1, (int) (short) 0, zipEncoding21);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) 'a', (int) (byte) -1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 2, (int) (byte) 1, zipEncoding25);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (short) 0, 0);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (short) -1, (int) (short) 0, zipEncoding38);
        int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, (-1), zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int44 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray9, 1, 2);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 3, 0);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(293L, byteArray9, 6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 49, (byte) 32, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 220L + "'", long41 == 220L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 201L + "'", long45 == 201L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 201L + "'", long49 == 201L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 201L + "'", long50 == 201L);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) -1, byteArray7, 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 640L + "'", long10 == 640L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 640L + "'", long11 == 640L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 640L + "'", long12 == 640L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (short) -1, (int) (short) 0, zipEncoding20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) 'a', (int) (byte) -1, zipEncoding24);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 2, (int) (byte) 1, zipEncoding24);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 0, 0);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) -1, (int) (short) 0, zipEncoding37);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (-1), zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int43 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray8, 1, 2);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 49, (byte) 32, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 220L + "'", long40 == 220L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 201L + "'", long44 == 201L);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 2, byteArray7, 2, (int) (byte) 1);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 1);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(201L, byteArray7, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 201=311 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 50, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) ' ', (-1));
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray25, 0, 0);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray25, 1, 3);
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray41);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, (int) ' ', (-1));
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray50);
        byte[] byteArray58 = new byte[] { (byte) 10 };
        long long59 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray58);
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding67 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray64, 1, (int) (byte) 1, zipEncoding67);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray58, (int) (byte) 0, (int) (byte) -1, zipEncoding67);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray50, 2, (int) (short) 0, zipEncoding67);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray41, (int) '#', (-1), zipEncoding67);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 0, (int) (short) -1, zipEncoding67);
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0, zipEncoding67);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding76 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, 3, zipEncoding76);
        int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(367L, byteArray8, (int) (byte) 0, 4);
        long long81 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long82 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        java.lang.Class<?> wildcardClass83 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 53, (byte) 53, (byte) 55, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 320L + "'", long29 == 320L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 365L + "'", long42 == 365L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 320L + "'", long54 == 320L);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 10L + "'", long59 == 10L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\001" + "'", str68, "\001");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(zipEncoding76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 4 + "'", int80 == 4);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 293L + "'", long81 == 293L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 293L + "'", long82 == 293L);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 0, (int) (short) 1);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) ' ', (-1));
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray30, (int) (short) 0, (int) (byte) 1);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding48 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, 1, (int) (byte) 1, zipEncoding48);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray30, 0, (-1), zipEncoding48);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 1, (int) (short) 1, zipEncoding48);
        boolean boolean53 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\001" + "'", str49, "\001");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "d" + "'", str51, "d");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 1);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) (short) 0, 5);
        java.lang.Class<?> wildcardClass38 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 1);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean58 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray56, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding61 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n03 d", byteArray56, 0, (int) (byte) 1, zipEncoding61);
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, 0, zipEncoding61);
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.Class<?> wildcardClass66 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 320L + "'", long46 == 320L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(zipEncoding61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 320L + "'", long64 == 320L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 320L + "'", long65 == 320L);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, (int) (byte) -1, zipEncoding31);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (short) 0, zipEncoding31);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean37 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 2);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (byte) 0);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, (int) '#');
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 0, 1);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 310L + "'", long35 == 310L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 311L + "'", long46 == 311L);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding11 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 1, (int) (byte) 1, zipEncoding11);
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 0, (int) (byte) -1, zipEncoding11);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(221L, byteArray2, 6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\001" + "'", str12, "\001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray5, 0, 1);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray5, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 35=43 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 3, (int) (short) 1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 310L + "'", long19 == 310L);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 10, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(48L, byteArray2, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, 0, 1);
        java.lang.Class<?> wildcardClass10 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 5, (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, 4);
        boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 3);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d\n\n\n" + "'", str20, "d\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 640L + "'", long23 == 640L);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) -1, 0);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 1, (int) (short) 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '#', byteArray7, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\nd" + "'", str23, "\nd");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) -1, (int) (short) 0, zipEncoding19);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) 'a', (int) (byte) -1, zipEncoding23);
        int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000dd\n", byteArray2, 0, (int) (byte) -1, zipEncoding23);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, 0, 0);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (short) 0);
        java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 100, (int) (short) -1);
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray6, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 320L + "'", long20 == 320L);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray4, (int) (short) 1, 0);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 100, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray4, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 10, byteArray4, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 126 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 48 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 2, (int) (byte) 1, zipEncoding26);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (-1), zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray10, 1, 2);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 3, 0);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(402L, byteArray10, 1, 4);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long59 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 54, (byte) 50, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 201L + "'", long46 == 201L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 196L + "'", long53 == 196L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) 'a', (int) (byte) -1, zipEncoding10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(293L, byteArray2, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 293=445 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 5, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray6, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 320L + "'", long44 == 320L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 5, byteArray1, (int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (byte) -1);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d\n\n\n", byteArray7, (int) (short) 1, (int) (byte) 1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long51 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(11L, byteArray7, 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 11=13 will not fit in octal number buffer of length -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 320L + "'", long50 == 320L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 320L + "'", long51 == 320L);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 2, (int) (byte) 1, zipEncoding26);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (-1), zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray10, 1, 2);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 3, 0);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(402L, byteArray10, 1, 4);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) ' ', (-1));
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) -1, (int) (short) 0);
        int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray62, (int) (short) 0, (int) (byte) 1);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding80 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray77, 1, (int) (byte) 1, zipEncoding80);
        int int82 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray62, 0, (-1), zipEncoding80);
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (byte) 1, 0, zipEncoding80);
        long long84 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(221L, byteArray10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 54, (byte) 50, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 201L + "'", long46 == 201L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 310L + "'", long72 == 310L);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "\001" + "'", str81, "\001");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 196L + "'", long84 == 196L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 196L + "'", long85 == 196L);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, 0);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) ' ', (-1));
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray28 = new byte[] { (byte) 10 };
        long long29 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray28);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding32 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) (short) -1, (int) (short) 0, zipEncoding32);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, (int) 'a', (int) (byte) -1, zipEncoding36);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, 2, (int) (byte) 1, zipEncoding36);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (short) 0, 0);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (short) -1, (int) (short) 0, zipEncoding49);
        int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray20, 0, (-1), zipEncoding49);
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray20, 1, 2);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 3, 0);
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(402L, byteArray20, 1, 4);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) ' ', (-1));
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray72, (int) (short) -1, (int) (short) 0);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray72, (int) (short) 0, (int) (byte) 1);
        long long82 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray72);
        byte[] byteArray87 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding90 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray87, 1, (int) (byte) 1, zipEncoding90);
        int int92 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray72, 0, (-1), zipEncoding90);
        java.lang.String str93 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 1, 0, zipEncoding90);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\0000", byteArray4, (int) (byte) 100, (int) (byte) 10, zipEncoding90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 102 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 54, (byte) 50, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 220L + "'", long52 == 220L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 201L + "'", long56 == 201L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5 + "'", int62 == 5);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 310L + "'", long82 == 310L);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "\001" + "'", str91, "\001");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray22 = new byte[] { (byte) 10 };
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray28, 1, (int) (byte) 1, zipEncoding31);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (byte) 0, (int) (byte) -1, zipEncoding31);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 0, (int) (short) 0, zipEncoding31);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(0L, byteArray8, (int) (byte) 1, 3);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (byte) 0, 3);
        boolean boolean43 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray8, 3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\001" + "'", str32, "\001");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 310L + "'", long35 == 310L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 1, 2);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray6, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "dd" + "'", str39, "dd");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 310L + "'", long40 == 310L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 310L + "'", long41 == 310L);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 310L + "'", long36 == 310L);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 3, 1);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(542L, byteArray7, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 542=1036 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 310L + "'", long46 == 310L);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(204L, byteArray6, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 204=314 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, 0);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 367L + "'", long13 == 367L);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray15, (int) (byte) 0);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray15, (int) (byte) 1);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 2, (int) (short) 0, zipEncoding51);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) '#', (-1), zipEncoding51);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) -1, (int) (short) 0, zipEncoding51);
        java.lang.String str57 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (short) 1, 2, zipEncoding51);
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray4, (int) (short) 0);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 2, (-1));
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(232L, byteArray4, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 232=350 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 365L + "'", long6 == 365L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 365L + "'", long26 == 365L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 320L + "'", long38 == 320L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\nd" + "'", str57, "\nd");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 365L + "'", long63 == 365L);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray0, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray8, 1, 3);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 4);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 5, byteArray8, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 5=5 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) 1, zipEncoding10);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 0, (int) (byte) -1, zipEncoding10);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1));
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) (byte) 10, (-1));
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray23, 3);
        int int35 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '#', byteArray23, (int) (byte) 0, 5);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        int int39 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000dd\n", byteArray23, 3, (int) (byte) -1);
        byte[] byteArray43 = new byte[] { (byte) 10 };
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding52 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray49, 1, (int) (byte) 1, zipEncoding52);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (byte) 0, (int) (byte) -1, zipEncoding52);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray23, 0, 5, zipEncoding52);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, 1, (int) (short) -1, zipEncoding52);
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 0 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 183L + "'", long36 == 183L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\001" + "'", str53, "\001");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 2, (int) (byte) 1, zipEncoding26);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (-1), zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray10, 1, 2);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray10, 3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (-1), byteArray10, 4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 49, (byte) 48, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 10, (-1));
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, 3);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (byte) 0, 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, (int) (short) 1);
        int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 1);
        int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(283L, byteArray9, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 283=433 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) -1, (int) (short) 0, zipEncoding6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(158L, byteArray2, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 158=236 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 365L + "'", long4 == 365L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) ' ', (-1));
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray18, (int) (short) 0, (int) (byte) 1);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray38, 1, (int) (byte) 1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (byte) 0, (int) (byte) -1, zipEncoding41);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, 0, (int) (short) 0, zipEncoding41);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray9, (int) (short) 1, (int) (byte) 1, zipEncoding41);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (-1));
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray68 = new byte[] { (byte) 10 };
        long long69 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray68);
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding77 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, 1, (int) (byte) 1, zipEncoding77);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray68, (int) (byte) 0, (int) (byte) -1, zipEncoding77);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, 2, (int) (short) 0, zipEncoding77);
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) '#', (-1), zipEncoding77);
        java.lang.String str82 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) (byte) 100, (int) (short) -1, zipEncoding77);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 10 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 310L + "'", long28 == 310L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\001" + "'", str42, "\001");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 365L + "'", long52 == 365L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 320L + "'", long64 == 320L);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\001" + "'", str78, "\001");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        int int12 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray6, (int) (byte) 0, (int) (short) 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray21, 0, 1);
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) ' ', (-1));
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (short) -1, (int) (short) 0);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray37, (int) (short) 0, (int) (byte) 1);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray51 = new byte[] { (byte) 10 };
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, (int) (byte) 1, zipEncoding60);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (byte) 0, (int) (byte) -1, zipEncoding60);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, 0, (int) (short) 0, zipEncoding60);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray21, 3, (int) (short) 0, zipEncoding60);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str78 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) ' ', (-1));
        java.lang.String str81 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray75, (int) (short) -1, (int) (short) 0);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray75, (int) (short) 0, (int) (byte) 1);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray75);
        byte[] byteArray90 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding93 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray90, 1, (int) (byte) 1, zipEncoding93);
        int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray75, 0, (-1), zipEncoding93);
        java.lang.String str96 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 5, (int) (byte) -1, zipEncoding93);
        java.lang.String str97 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) 10, 0, zipEncoding93);
        java.lang.Class<?> wildcardClass98 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 365L + "'", long22 == 365L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 310L + "'", long47 == 310L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\001" + "'", str61, "\001");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 158L + "'", long65 == 158L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 310L + "'", long85 == 310L);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "\001" + "'", str94, "\001");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        byte[] byteArray1 = null;
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) ' ', (-1));
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 10 };
        long long20 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray19);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding28 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, 1, (int) (byte) 1, zipEncoding28);
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, (int) (byte) 0, (int) (byte) -1, zipEncoding28);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, 2, (int) (short) 0, zipEncoding28);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) 'a', (int) (byte) -1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray11, (int) 'a', (int) (short) 0, zipEncoding43);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray11, 3, 1);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) ' ', (-1));
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray60, 0, 0);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray60, 1, 3);
        byte[] byteArray74 = new byte[] { (byte) 10 };
        long long75 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray74);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) (short) -1, (int) (short) 0, zipEncoding78);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding82 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str83 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray74, (int) 'a', (int) (byte) -1, zipEncoding82);
        int int84 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray60, (int) (byte) 1, 0, zipEncoding82);
        int int85 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray11, 1, (-1), zipEncoding82);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray1, (int) '4', (int) (byte) 10, zipEncoding82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 320L + "'", long15 == 320L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001" + "'", str29, "\001");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 320L + "'", long46 == 320L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 320L + "'", long64 == 320L);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 10L + "'", long75 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(zipEncoding82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(" d", byteArray6, 4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 6 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        byte[] byteArray29 = new byte[] { (byte) 10 };
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) (short) -1, (int) (short) 0, zipEncoding33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) 'a', (int) (byte) -1, zipEncoding37);
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) 0, zipEncoding37);
        long long40 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (byte) 1);
        long long45 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 320L + "'", long40 == 320L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 320L + "'", long41 == 320L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\n" + "'", str44, "\n");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 320L + "'", long45 == 320L);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) -1, 0);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 5, 0);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(631L, byteArray6, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 631=1167 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 320L + "'", long18 == 320L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (byte) 1, byteArray2, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1=1 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) ' ', (-1));
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray23, 0, 0);
        int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray23, 1, 3);
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (short) -1, (int) (short) 0, zipEncoding41);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) 'a', (int) (byte) -1, zipEncoding45);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray23, (int) (byte) 1, 0, zipEncoding45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (-1), 5, zipEncoding45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000dd\n", byteArray5, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 5 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 865L + "'", long12 == 865L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 865L + "'", long13 == 865L);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray9, 1, 3);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 2, (int) (short) 0, zipEncoding51);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) '#', (-1), zipEncoding51);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (short) -1, zipEncoding51);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 4);
        long long62 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (short) 1, 6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(865L, byteArray9, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 865=1541 will not fit in octal number buffer of length 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 49, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 365L + "'", long26 == 365L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 320L + "'", long38 == 320L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 3, (int) (short) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray9, (int) (byte) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(221L, byteArray9, 1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 221=335 will not fit in octal number buffer of length 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 48, (byte) 51, (byte) 53, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 367L + "'", long11 == 367L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 367L + "'", long12 == 367L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 367L + "'", long13 == 367L);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean12 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray10, (int) (byte) 1);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, (int) ' ', (-1));
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray29);
        byte[] byteArray37 = new byte[] { (byte) 10 };
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 1, (int) (byte) 1, zipEncoding46);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray37, (int) (byte) 0, (int) (byte) -1, zipEncoding46);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray29, 2, (int) (short) 0, zipEncoding46);
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) '#', (-1), zipEncoding46);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) -1, (int) (short) 0, zipEncoding46);
        int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, 1, (int) (byte) -1);
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(186L, byteArray10, (int) (byte) 1, 4);
        int int61 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("d\n\n\n", byteArray10, 3, (int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 0, byteArray10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 50, (byte) 55, (byte) 50, (byte) 32, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 365L + "'", long21 == 365L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 320L + "'", long33 == 320L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\001" + "'", str47, "\001");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 640L + "'", long55 == 640L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5 + "'", int58 == 5);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, 0);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 5, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str16 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) ' ', (-1));
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, 2, (int) (short) 0, zipEncoding30);
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) '#', (-1), zipEncoding30);
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(402L, byteArray4, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 365L + "'", long5 == 365L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 365L + "'", long35 == 365L);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 2, (int) (byte) 1, zipEncoding26);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (-1), zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray10, 1, 2);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 1, byteArray10, 1, 2);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) ' ', (-1));
        long long63 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray59);
        byte[] byteArray67 = new byte[] { (byte) 10 };
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (short) -1, (int) (short) 0, zipEncoding71);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) 'a', (int) (byte) -1, zipEncoding75);
        int int77 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray59, 2, (int) (byte) 1, zipEncoding75);
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, (int) (short) 0, 0);
        byte[] byteArray84 = new byte[] { (byte) 10 };
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray84);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray84, (int) (short) -1, (int) (short) 0, zipEncoding88);
        int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray59, 0, (-1), zipEncoding88);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 6, (-1), zipEncoding88);
        int int94 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (short) 10, byteArray10, (int) (byte) 0, 5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 48, (byte) 49, (byte) 50, (byte) 0, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 201L + "'", long46 == 201L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 320L + "'", long63 == 320L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 10L + "'", long85 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 5 + "'", int94 == 5);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, 0);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray6, 0, 1);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) ' ', (-1));
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, (int) (short) -1, (int) (short) 0);
        int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray22, (int) (short) 0, (int) (byte) 1);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray22);
        byte[] byteArray36 = new byte[] { (byte) 10 };
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray36);
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding45 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, 1, (int) (byte) 1, zipEncoding45);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray36, (int) (byte) 0, (int) (byte) -1, zipEncoding45);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 0, (int) (short) 0, zipEncoding45);
        int int49 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, 3, (int) (short) 0, zipEncoding45);
        boolean boolean51 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(220L, byteArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 85 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 365L + "'", long7 == 365L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 310L + "'", long32 == 310L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\001" + "'", str46, "\001");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) ' ', (-1));
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        byte[] byteArray18 = new byte[] { (byte) 10 };
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) (short) -1, (int) (short) 0, zipEncoding22);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray18, (int) 'a', (int) (byte) -1, zipEncoding26);
        int int28 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 2, (int) (byte) 1, zipEncoding26);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, (int) (short) 0, 0);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray35, (int) (short) -1, (int) (short) 0, zipEncoding39);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 0, (-1), zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) 1, byteArray10, 1, 2);
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray10, 3, 0);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(402L, byteArray10, 1, 4);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray10, (int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass57 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 54, (byte) 50, (byte) 50, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 320L + "'", long14 == 320L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 220L + "'", long42 == 220L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 201L + "'", long46 == 201L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 196L + "'", long53 == 196L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, 1, (int) (byte) 1, zipEncoding23);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, (int) (byte) 0, (int) (byte) -1, zipEncoding23);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (int) (short) 0, zipEncoding23);
        byte[] byteArray30 = new byte[] { (byte) 10 };
        long long31 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) (short) -1, (int) (short) 0, zipEncoding34);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding38 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str39 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray30, (int) 'a', (int) (byte) -1, zipEncoding38);
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) 0, zipEncoding38);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (int) (byte) -1);
        boolean boolean45 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, (int) (byte) 0);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) ' ', (-1));
        long long57 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray53);
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (byte) 10, (-1));
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str73 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) ' ', (-1));
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (short) -1, (int) (short) 0);
        int int79 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray70, (int) (short) 0, (int) (byte) 1);
        long long80 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        byte[] byteArray85 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding88 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str89 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray85, 1, (int) (byte) 1, zipEncoding88);
        int int90 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray70, 0, (-1), zipEncoding88);
        java.lang.String str91 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, 5, 0, zipEncoding88);
        java.lang.String str92 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (-1), (int) (byte) 0, zipEncoding88);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '4', byteArray6, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 320L + "'", long10 == 320L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\001" + "'", str24, "\001");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(zipEncoding38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 320L + "'", long57 == 320L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 310L + "'", long80 == 310L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\001" + "'", str89, "\001");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, 1, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 0);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 3, (int) (short) 1);
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray9, (int) (byte) 0, 4);
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray33, (int) (byte) 0);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) ' ', (-1));
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray51 = new byte[] { (byte) 10 };
        long long52 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray51);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding60 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str61 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, 1, (int) (byte) 1, zipEncoding60);
        java.lang.String str62 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray51, (int) (byte) 0, (int) (byte) -1, zipEncoding60);
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 2, (int) (short) 0, zipEncoding60);
        byte[] byteArray67 = new byte[] { (byte) 10 };
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray67);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) (short) -1, (int) (short) 0, zipEncoding71);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray67, (int) 'a', (int) (byte) -1, zipEncoding75);
        java.lang.String str77 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) 'a', (int) (short) 0, zipEncoding75);
        int int78 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\ndd", byteArray33, (int) (short) 0, 1, zipEncoding75);
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (-1), (int) (byte) 0, zipEncoding75);
        // The following exception was thrown during execution in test generation
        try {
            int int82 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1, byteArray9, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 48, (byte) 48, (byte) 48, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 320L + "'", long17 == 320L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 320L + "'", long47 == 320L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\001" + "'", str61, "\001");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 10L + "'", long68 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 0, (-1), zipEncoding25);
        long long28 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 310L + "'", long28 == 310L);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 10, (-1));
        boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 3);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 1, 2);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray5, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dd" + "'", str17, "dd");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray7, 3, 1);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (short) -1);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, 3, 2);
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) ' ', (-1));
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) (short) -1, (int) (short) 0);
        int int71 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray62, (int) (short) 0, (int) (byte) 1);
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray62);
        byte[] byteArray76 = new byte[] { (byte) 10 };
        long long77 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray76);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding85 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str86 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray82, 1, (int) (byte) 1, zipEncoding85);
        java.lang.String str87 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray76, (int) (byte) 0, (int) (byte) -1, zipEncoding85);
        java.lang.String str88 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, 0, (int) (short) 0, zipEncoding85);
        boolean boolean90 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray62, (int) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding93 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        java.lang.String str94 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray62, (int) '4', (-1), zipEncoding93);
        // The following exception was thrown during execution in test generation
        try {
            int int95 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\000d\001\n\ufffd", byteArray7, (int) (byte) 100, 4, zipEncoding93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 104 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 190L + "'", long49 == 190L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 190L + "'", long50 == 190L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 310L + "'", long72 == 310L);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 10L + "'", long77 == 10L);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\001" + "'", str86, "\001");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(zipEncoding93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) '4', byteArray2, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 52=64 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray7, 3, 1);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray56, (int) ' ', (-1));
        long long60 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray56);
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray56, 0, 0);
        int int66 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray56, 1, 3);
        byte[] byteArray70 = new byte[] { (byte) 10 };
        long long71 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray70);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding74 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) (short) -1, (int) (short) 0, zipEncoding74);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding78 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str79 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray70, (int) 'a', (int) (byte) -1, zipEncoding78);
        int int80 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray56, (int) (byte) 1, 0, zipEncoding78);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray7, 1, (-1), zipEncoding78);
        // The following exception was thrown during execution in test generation
        try {
            long long84 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 320L + "'", long60 == 320L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 10L + "'", long71 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(zipEncoding78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray23);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) ' ', (-1));
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        byte[] byteArray40 = new byte[] { (byte) 10 };
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 1, (int) (byte) 1, zipEncoding49);
        java.lang.String str51 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, (int) (byte) 0, (int) (byte) -1, zipEncoding49);
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, 2, (int) (short) 0, zipEncoding49);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, (int) '#', (-1), zipEncoding49);
        int int54 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("dd\n", byteArray7, 0, (int) (short) 1, zipEncoding49);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 365L + "'", long24 == 365L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 320L + "'", long36 == 320L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\001" + "'", str50, "\001");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray8, 1, 3);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', 0);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 4);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 4, 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n\n", byteArray8, (int) (short) 10, 5, zipEncoding29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, (int) ' ', (-1));
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray26);
        byte[] byteArray34 = new byte[] { (byte) 10 };
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding43 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray40, 1, (int) (byte) 1, zipEncoding43);
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) (byte) 0, (int) (byte) -1, zipEncoding43);
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 2, (int) (short) 0, zipEncoding43);
        java.lang.String str47 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) '#', (-1), zipEncoding43);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0, zipEncoding43);
        int int51 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray7, 1, (int) (byte) -1);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (byte) -1);
        long long55 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 365L + "'", long18 == 365L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 320L + "'", long30 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\001" + "'", str44, "\001");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 640L + "'", long55 == 640L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 640L + "'", long56 == 640L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding30 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray27, 1, (int) (byte) 1, zipEncoding30);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, (int) (byte) 0, (int) (byte) -1, zipEncoding30);
        java.lang.String str33 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, (int) (short) 0, zipEncoding30);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 1);
        long long36 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 4, byteArray7, 0, 2);
        long long41 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 0, 3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 48, (byte) 52, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\001" + "'", str31, "\001");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 310L + "'", long36 == 310L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 310L + "'", long37 == 310L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 310L + "'", long41 == 310L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "04d" + "'", str44, "04d");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 5, byteArray1, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) -1, (int) (short) 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray8, (int) (short) 0, (int) (byte) 1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray8, 0, 4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(310L, byteArray8, 1, 4);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 1, byteArray8, 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 103 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 48, (byte) 52, (byte) 54, (byte) 54 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 310L + "'", long19 == 310L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 208L + "'", long26 == 208L);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray7, 1, 3);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 4);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 100, (int) (byte) 0);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 241L + "'", long23 == 241L);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) (short) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(220L, byteArray6, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 96 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 32, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 590L + "'", long19 == 590L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 1, (int) (byte) -1);
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) 0, (int) (short) -1);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray5, 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 3, (int) (short) -1);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) 'a', (int) (short) -1);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 48, (byte) 32, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 590L + "'", long18 == 590L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        long long42 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int45 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray7, 3, 1);
        java.lang.String str48 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 1, (int) (short) -1);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray7, 3, 2);
        boolean boolean55 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001d\001\n\ufffd", byteArray7, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 42 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 320L + "'", long42 == 320L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 190L + "'", long49 == 190L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 190L + "'", long50 == 190L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding26 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray23, 1, (int) (byte) 1, zipEncoding26);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) 0, (int) (byte) -1, zipEncoding26);
        java.lang.String str29 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 2, (int) (short) 0, zipEncoding26);
        byte[] byteArray33 = new byte[] { (byte) 10 };
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray33);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding37 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str38 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) (short) -1, (int) (short) 0, zipEncoding37);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding41 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray33, (int) 'a', (int) (byte) -1, zipEncoding41);
        java.lang.String str43 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) 'a', (int) (short) 0, zipEncoding41);
        long long44 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int47 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray9, 3, 1);
        int int50 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n", byteArray9, 2, (int) (short) 1);
        int int53 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) '#', byteArray9, (int) (short) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(268L, byteArray9, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 48, (byte) 52, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001" + "'", str27, "\001");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(zipEncoding41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 320L + "'", long44 == 320L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        boolean boolean19 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        long long22 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long23 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes(208L, byteArray7, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 149 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 310L + "'", long22 == 310L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 310L + "'", long23 == 310L);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 1, (int) (byte) 1, zipEncoding5);
        long long7 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (byte) -1, 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        int int27 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray17, (int) (short) 1, (int) (short) 0);
        int int30 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (byte) 0, byteArray17, (int) (short) 1, 4);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, (int) ' ', (-1));
        java.lang.String str45 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, (int) (short) -1, (int) (short) 0);
        int int48 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray39, (int) (short) 0, (int) (byte) 1);
        long long49 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray39);
        byte[] byteArray53 = new byte[] { (byte) 10 };
        long long54 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray53);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str63 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray59, 1, (int) (byte) 1, zipEncoding62);
        java.lang.String str64 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray53, (int) (byte) 0, (int) (byte) -1, zipEncoding62);
        java.lang.String str65 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray39, 0, (int) (short) 0, zipEncoding62);
        java.lang.String str66 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, 3, 2, zipEncoding62);
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 2, (int) (short) 0, zipEncoding62);
        long long68 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding71 = null;
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) '4', (int) (byte) 0, zipEncoding71);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\001" + "'", str6, "\001");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 48, (byte) 48, (byte) 48, (byte) 32 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 310L + "'", long49 == 310L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\001" + "'", str63, "\001");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0 " + "'", str66, "0 ");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 11L + "'", long68 == 11L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray15);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding24 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray21, 1, (int) (byte) 1, zipEncoding24);
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (byte) 0, (int) (byte) -1, zipEncoding24);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 2, (int) (short) 0, zipEncoding24);
        byte[] byteArray31 = new byte[] { (byte) 10 };
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding35 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str36 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) (short) -1, (int) (short) 0, zipEncoding35);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding39 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str40 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) 'a', (int) (byte) -1, zipEncoding39);
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) 'a', (int) (short) 0, zipEncoding39);
        java.lang.String str44 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (byte) -1);
        boolean boolean46 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (short) 1);
        long long47 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        boolean boolean59 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray57, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding62 = org.apache.commons.compress.archivers.tar.TarUtils.DEFAULT_ENCODING;
        int int63 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\n03 d", byteArray57, 0, (int) (byte) 1, zipEncoding62);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 3, 0, zipEncoding62);
        long long65 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long66 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(196L, byteArray7, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 196=304 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001" + "'", str25, "\001");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(zipEncoding39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 320L + "'", long47 == 320L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zipEncoding62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 320L + "'", long65 == 320L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 320L + "'", long66 == 320L);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) ' ', (-1));
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (short) -1, (int) (short) 0);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray6, (int) (short) 0, (int) (byte) 1);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        byte[] byteArray20 = new byte[] { (byte) 10 };
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str30 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray26, 1, (int) (byte) 1, zipEncoding29);
        java.lang.String str31 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray20, (int) (byte) 0, (int) (byte) -1, zipEncoding29);
        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 0, (int) (short) 0, zipEncoding29);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        long long34 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean36 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 4);
        long long37 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray6, 1);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 2, (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 310L + "'", long16 == 310L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\001" + "'", str30, "\001");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 310L + "'", long33 == 310L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 310L + "'", long34 == 310L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 310L + "'", long37 == 310L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        byte[] byteArray16 = new byte[] { (byte) 10 };
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding25 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str26 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray22, 1, (int) (byte) 1, zipEncoding25);
        java.lang.String str27 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray16, (int) (byte) 0, (int) (byte) -1, zipEncoding25);
        java.lang.String str28 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, 2, (int) (short) 0, zipEncoding25);
        byte[] byteArray32 = new byte[] { (byte) 10 };
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray32);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) (short) -1, (int) (short) 0, zipEncoding36);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str41 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray32, (int) 'a', (int) (byte) -1, zipEncoding40);
        java.lang.String str42 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) 'a', (int) (short) 0, zipEncoding40);
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int46 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 0, byteArray8, 3, 1);
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str60 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) ' ', (-1));
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        int int64 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray57, 0, 0);
        int int67 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray57, 1, 3);
        byte[] byteArray71 = new byte[] { (byte) 10 };
        long long72 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray71);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding75 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str76 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) (short) -1, (int) (short) 0, zipEncoding75);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding79 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str80 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray71, (int) 'a', (int) (byte) -1, zipEncoding79);
        int int81 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray57, (int) (byte) 1, 0, zipEncoding79);
        int int82 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray8, 1, (-1), zipEncoding79);
        long long83 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long84 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        long long85 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes(0L, byteArray8, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 48, (byte) 32, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\001" + "'", str26, "\001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(zipEncoding40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 320L + "'", long43 == 320L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 320L + "'", long61 == 320L);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 10L + "'", long72 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(zipEncoding79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 190L + "'", long83 == 190L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 190L + "'", long84 == 190L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 190L + "'", long85 == 190L);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        java.lang.String str17 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (int) (short) 0);
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 100, (-1));
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str34 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray31, (int) ' ', (-1));
        long long35 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        int int38 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray31, 0, 0);
        int int41 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray31, 1, 3);
        byte[] byteArray45 = new byte[] { (byte) 10 };
        long long46 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray45);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding49 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str50 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) (short) -1, (int) (short) 0, zipEncoding49);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding53 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray45, (int) 'a', (int) (byte) -1, zipEncoding53);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray31, (int) (byte) 1, 0, zipEncoding53);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) 0, (int) (short) -1, zipEncoding53);
        java.lang.String str59 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 10, (int) (byte) 0);
        int int62 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long65 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length -1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 10, (byte) 48, (byte) 51, (byte) 32, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 320L + "'", long35 == 320L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(zipEncoding53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 10 };
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding22 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray19, 1, (int) (byte) 1, zipEncoding22);
        java.lang.String str24 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (byte) 0, (int) (byte) -1, zipEncoding22);
        java.lang.String str25 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, 2, (int) (short) 0, zipEncoding22);
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) ' ', (-1));
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, (int) (short) -1, (int) (short) 0);
        int int55 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray46, (int) (short) 0, (int) (byte) 1);
        long long56 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray46);
        byte[] byteArray60 = new byte[] { (byte) 10 };
        long long61 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray60);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding69 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray66, 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray60, (int) (byte) 0, (int) (byte) -1, zipEncoding69);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray46, 0, (int) (short) 0, zipEncoding69);
        int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray37, (int) (short) 1, (int) (byte) 1, zipEncoding69);
        java.lang.String str74 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (byte) -1, (int) (byte) -1, zipEncoding69);
        boolean boolean76 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, 0);
        java.lang.Class<?> wildcardClass77 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 320L + "'", long9 == 320L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001" + "'", str23, "\001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 320L + "'", long26 == 320L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 320L + "'", long27 == 320L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 310L + "'", long56 == 310L);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 10L + "'", long61 == 10L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\001" + "'", str70, "\001");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, (int) (short) 1, 0);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, 3, 1);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 367L + "'", long11 == 367L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 367L + "'", long15 == 367L);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str8 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) ' ', (-1));
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) ' ', (-1));
        int int23 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray17, (int) (byte) 0, (int) (short) 0);
        long long24 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray17);
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str46 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) ' ', (-1));
        java.lang.String str49 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, (int) (short) -1, (int) (short) 0);
        int int52 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray43, (int) (short) 0, (int) (byte) 1);
        long long53 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray43);
        byte[] byteArray57 = new byte[] { (byte) 10 };
        long long58 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray57);
        byte[] byteArray63 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding66 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray63, 1, (int) (byte) 1, zipEncoding66);
        java.lang.String str68 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray57, (int) (byte) 0, (int) (byte) -1, zipEncoding66);
        java.lang.String str69 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray43, 0, (int) (short) 0, zipEncoding66);
        int int70 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("\001", byteArray34, (int) (short) 1, (int) (byte) 1, zipEncoding66);
        java.lang.String str71 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray17, (int) (short) 1, (int) (byte) 1, zipEncoding66);
        java.lang.String str72 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 0, (int) (byte) -1, zipEncoding66);
        java.lang.String str75 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray5, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long78 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray5, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 320L + "'", long24 == 320L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 310L + "'", long53 == 310L);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\001" + "'", str67, "\001");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "d" + "'", str71, "d");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 1, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) (byte) 0, (int) (short) -1);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray6, 1, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, 3, (int) (short) -1);
        long long19 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray6, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) '#', byteArray6, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 48, (byte) 32, (byte) -1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 590L + "'", long19 == 590L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        long long2 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str6 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (short) -1, (int) (short) 0, zipEncoding5);
        java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) ' ', (-1));
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        java.lang.String str14 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray1, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str11 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) ' ', (-1));
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        int int15 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray8, 0, 0);
        long long16 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray8);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray8, 4);
        int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("0 ", byteArray8, 2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) (short) -1, byteArray8, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1=1777777777777777777777 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 320L + "'", long12 == 320L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 320L + "'", long16 == 320L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        java.lang.String str13 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (short) -1, (int) (short) 0);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray7, (int) (short) 0, (int) (byte) 1);
        long long17 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long18 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray7, 0, 4);
        org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(310L, byteArray7, 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 148 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 48, (byte) 52, (byte) 54, (byte) 54 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 310L + "'", long17 == 310L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 310L + "'", long18 == 310L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str10 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) ' ', (-1));
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray7);
        int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray7, 0, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 0);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, (int) (byte) 0);
        java.lang.String str21 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray7, (int) (byte) 10, (int) (byte) -1);
        boolean boolean23 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray7, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(365L, byteArray7, 5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 320L + "'", long11 == 320L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        byte[] byteArray2 = new byte[] { (byte) 10 };
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray2, (int) (short) 1, 0);
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 109 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str12 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, (int) ' ', (-1));
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("hi!", byteArray9, 0, 0);
        int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 3, byteArray9, 1, 3);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        long long26 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray25);
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.lang.String str37 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, (int) ' ', (-1));
        long long38 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray34);
        byte[] byteArray42 = new byte[] { (byte) 10 };
        long long43 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray42);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.tar.TarUtils.FALLBACK_ENCODING;
        java.lang.String str52 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray48, 1, (int) (byte) 1, zipEncoding51);
        java.lang.String str53 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray42, (int) (byte) 0, (int) (byte) -1, zipEncoding51);
        java.lang.String str54 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray34, 2, (int) (short) 0, zipEncoding51);
        java.lang.String str55 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) '#', (-1), zipEncoding51);
        java.lang.String str56 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, (int) (short) -1, zipEncoding51);
        int int59 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray9, 0, 4);
        boolean boolean61 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray9, 1);
        long long64 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray9, (int) (byte) 0, (int) ' ');
        java.lang.String str67 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 0);
        java.lang.String str70 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray9, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(196L, byteArray9, 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 320L + "'", long13 == 320L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 365L + "'", long26 == 365L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 });
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 320L + "'", long38 == 320L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10 });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\001" + "'", str52, "\001");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }
}

