package org.apache.commons.compress.utils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        long long10 = checksumCalculatingInputStream5.skip((long) (byte) -1);
        checksumCalculatingInputStream5.mark(0);
        long long14 = checksumCalculatingInputStream5.skip((long) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        long long17 = checksumCalculatingInputStream5.skip((long) (short) 0);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        byte[] byteArray6 = checksumCalculatingInputStream4.readAllBytes();
        int int7 = checksumCalculatingInputStream4.available();
        int int8 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        int int10 = checksumCalculatingInputStream4.available();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        long long14 = checksumCalculatingInputStream5.skip(100L);
        checksumCalculatingInputStream5.mark(10);
        int int17 = checksumCalculatingInputStream5.read();
        long long19 = checksumCalculatingInputStream5.skip((long) (short) -1);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = checksumCalculatingInputStream5.transferTo(outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        long long8 = checksumCalculatingInputStream6.skip(100L);
        byte[] byteArray9 = checksumCalculatingInputStream6.readAllBytes();
        long long11 = checksumCalculatingInputStream6.skip((long) (byte) -1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream6.close();
        long long15 = checksumCalculatingInputStream6.skip((long) (short) 0);
        int int16 = checksumCalculatingInputStream6.available();
        int int17 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        boolean boolean19 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (short) 0);
        byte[] byteArray23 = checksumCalculatingInputStream6.readNBytes((int) ' ');
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        byte[] byteArray11 = checksumCalculatingInputStream5.readNBytes((int) '4');
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        int int16 = checksumCalculatingInputStream5.read(byteArray15);
        java.util.zip.Checksum checksum17 = null;
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        int int19 = inputStream18.available();
        boolean boolean20 = inputStream18.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, inputStream18);
        byte[] byteArray22 = checksumCalculatingInputStream21.readAllBytes();
        int int23 = checksumCalculatingInputStream21.read();
        checksumCalculatingInputStream21.close();
        checksumCalculatingInputStream21.close();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = checksumCalculatingInputStream21.read(byteArray27);
        int int29 = checksumCalculatingInputStream5.read(byteArray27);
        boolean boolean30 = checksumCalculatingInputStream5.markSupported();
        int int31 = checksumCalculatingInputStream5.available();
        boolean boolean32 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream33 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray35 = checksumCalculatingInputStream5.readNBytes((int) (short) 100);
        java.lang.Class<?> wildcardClass36 = checksumCalculatingInputStream5.getClass();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        int int11 = checksumCalculatingInputStream5.read();
        long long13 = checksumCalculatingInputStream5.skip((long) (byte) 10);
        byte[] byteArray15 = checksumCalculatingInputStream5.readNBytes((int) (short) 10);
        int int16 = checksumCalculatingInputStream5.available();
        int int17 = checksumCalculatingInputStream5.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream5.close();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        int int6 = inputStream5.available();
        boolean boolean7 = inputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        byte[] byteArray9 = checksumCalculatingInputStream8.readAllBytes();
        int int10 = checksumCalculatingInputStream8.read();
        checksumCalculatingInputStream8.close();
        checksumCalculatingInputStream8.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream8);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream13);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream13);
        checksumCalculatingInputStream13.close();
        int int17 = checksumCalculatingInputStream13.read();
        checksumCalculatingInputStream13.mark((int) 'a');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        long long22 = checksumCalculatingInputStream20.skip((long) (short) 10);
        checksumCalculatingInputStream20.mark(1);
        byte[] byteArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = checksumCalculatingInputStream20.read(byteArray25, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        int int9 = checksumCalculatingInputStream4.read();
        java.util.zip.Checksum checksum10 = null;
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        int int12 = inputStream11.available();
        boolean boolean13 = inputStream11.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum10, inputStream11);
        byte[] byteArray15 = checksumCalculatingInputStream14.readAllBytes();
        int int16 = checksumCalculatingInputStream14.read();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark((int) (byte) 100);
        int int21 = checksumCalculatingInputStream14.read();
        checksumCalculatingInputStream14.mark((-1));
        checksumCalculatingInputStream14.mark((int) (byte) 100);
        int int26 = checksumCalculatingInputStream14.available();
        byte[] byteArray28 = checksumCalculatingInputStream14.readNBytes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int31 = checksumCalculatingInputStream4.read(byteArray28, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 10) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream5.close();
        int int13 = checksumCalculatingInputStream5.available();
        checksumCalculatingInputStream5.mark((int) '#');
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark((int) ' ');
        byte[] byteArray4 = inputStream0.readNBytes((int) (byte) 100);
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) 10);
        inputStream0.mark(0);
        java.util.zip.Checksum checksum10 = null;
        java.util.zip.Checksum checksum11 = null;
        java.util.zip.Checksum checksum12 = null;
        java.util.zip.Checksum checksum13 = null;
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        int int15 = inputStream14.available();
        boolean boolean16 = inputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum13, inputStream14);
        long long19 = checksumCalculatingInputStream17.skip(100L);
        long long21 = checksumCalculatingInputStream17.skip((long) 'a');
        checksumCalculatingInputStream17.close();
        int int23 = checksumCalculatingInputStream17.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream24 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum12, (java.io.InputStream) checksumCalculatingInputStream17);
        long long26 = checksumCalculatingInputStream17.skip(100L);
        long long28 = checksumCalculatingInputStream17.skip((long) (short) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream29 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum11, (java.io.InputStream) checksumCalculatingInputStream17);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream30 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum10, (java.io.InputStream) checksumCalculatingInputStream17);
        byte[] byteArray31 = checksumCalculatingInputStream17.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = inputStream0.readNBytes(byteArray31, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        int int11 = checksumCalculatingInputStream4.read(byteArray10);
        byte[] byteArray13 = checksumCalculatingInputStream4.readNBytes((int) 'a');
        int int14 = checksumCalculatingInputStream4.available();
        byte[] byteArray15 = checksumCalculatingInputStream4.readAllBytes();
        checksumCalculatingInputStream4.close();
        long long18 = checksumCalculatingInputStream4.skip((long) (short) 10);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        byte[] byteArray11 = checksumCalculatingInputStream10.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream10);
        byte[] byteArray14 = checksumCalculatingInputStream12.readNBytes(1);
        int int15 = checksumCalculatingInputStream12.read();
        long long17 = checksumCalculatingInputStream12.skip((long) (byte) 1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        int int6 = inputStream5.available();
        boolean boolean7 = inputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        byte[] byteArray9 = checksumCalculatingInputStream8.readAllBytes();
        int int10 = checksumCalculatingInputStream8.read();
        checksumCalculatingInputStream8.close();
        checksumCalculatingInputStream8.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream8);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream13);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream13);
        checksumCalculatingInputStream13.close();
        int int17 = checksumCalculatingInputStream13.read();
        checksumCalculatingInputStream13.mark((int) 'a');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        long long22 = checksumCalculatingInputStream20.skip((long) (short) 10);
        byte[] byteArray24 = checksumCalculatingInputStream20.readNBytes((int) ' ');
        byte[] byteArray25 = checksumCalculatingInputStream20.readAllBytes();
        checksumCalculatingInputStream20.mark(1);
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream8.close();
        boolean boolean10 = checksumCalculatingInputStream8.markSupported();
        checksumCalculatingInputStream8.close();
        boolean boolean12 = checksumCalculatingInputStream8.markSupported();
        checksumCalculatingInputStream8.close();
        java.lang.Class<?> wildcardClass14 = checksumCalculatingInputStream8.getClass();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        int int1 = inputStream0.available();
        boolean boolean2 = inputStream0.markSupported();
        byte[] byteArray4 = inputStream0.readNBytes((int) (byte) 1);
        byte[] byteArray5 = inputStream0.readAllBytes();
        inputStream0.mark(1);
        byte[] byteArray9 = inputStream0.readNBytes((int) (byte) 100);
        int int10 = inputStream0.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        inputStream4.mark((int) ' ');
        byte[] byteArray8 = inputStream4.readNBytes((int) (byte) 100);
        inputStream4.mark((int) (byte) -1);
        byte[] byteArray12 = inputStream4.readNBytes((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream15.mark((int) (byte) 1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        byte[] byteArray3 = inputStream1.readNBytes(1);
        inputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long8 = checksumCalculatingInputStream6.skip(10L);
        checksumCalculatingInputStream6.mark(100);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (byte) 10);
        long long16 = checksumCalculatingInputStream6.skip(1L);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        boolean boolean9 = checksumCalculatingInputStream5.markSupported();
        long long11 = checksumCalculatingInputStream5.skip((long) (short) -1);
        java.util.zip.Checksum checksum12 = null;
        java.util.zip.Checksum checksum13 = null;
        java.util.zip.Checksum checksum14 = null;
        java.util.zip.Checksum checksum15 = null;
        java.io.InputStream inputStream16 = java.io.InputStream.nullInputStream();
        int int17 = inputStream16.available();
        boolean boolean18 = inputStream16.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum15, inputStream16);
        byte[] byteArray20 = checksumCalculatingInputStream19.readAllBytes();
        int int21 = checksumCalculatingInputStream19.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum14, (java.io.InputStream) checksumCalculatingInputStream19);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream23 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum13, (java.io.InputStream) checksumCalculatingInputStream22);
        checksumCalculatingInputStream23.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream26 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum12, (java.io.InputStream) checksumCalculatingInputStream23);
        byte[] byteArray27 = checksumCalculatingInputStream26.readAllBytes();
        byte[] byteArray29 = checksumCalculatingInputStream26.readNBytes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = checksumCalculatingInputStream5.read(byteArray29, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        long long8 = checksumCalculatingInputStream6.skip(100L);
        long long10 = checksumCalculatingInputStream6.skip((long) 'a');
        checksumCalculatingInputStream6.close();
        int int12 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        int int14 = checksumCalculatingInputStream6.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream15.close();
        boolean boolean17 = checksumCalculatingInputStream15.markSupported();
        int int18 = checksumCalculatingInputStream15.read();
        java.lang.Class<?> wildcardClass19 = checksumCalculatingInputStream15.getClass();
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        inputStream1.mark((int) ' ');
        byte[] byteArray5 = inputStream1.readNBytes((int) ' ');
        int int8 = inputStream0.readNBytes(byteArray5, 0, 0);
        int int9 = inputStream0.available();
        inputStream0.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        byte[] byteArray12 = new byte[] { (byte) 1 };
        int int13 = checksumCalculatingInputStream6.read(byteArray12);
        byte[] byteArray15 = checksumCalculatingInputStream6.readNBytes((int) 'a');
        int int16 = checksumCalculatingInputStream6.available();
        byte[] byteArray17 = checksumCalculatingInputStream6.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream18);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = checksumCalculatingInputStream18.transferTo(outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        int int7 = checksumCalculatingInputStream4.available();
        int int8 = checksumCalculatingInputStream4.read();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = checksumCalculatingInputStream4.readNBytes(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        int int10 = checksumCalculatingInputStream6.available();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream6.mark((int) (byte) 100);
        java.util.zip.Checksum checksum16 = null;
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        int int18 = inputStream17.available();
        boolean boolean19 = inputStream17.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum16, inputStream17);
        long long22 = checksumCalculatingInputStream20.skip(100L);
        long long24 = checksumCalculatingInputStream20.skip((long) 'a');
        int int25 = checksumCalculatingInputStream20.read();
        int int26 = checksumCalculatingInputStream20.read();
        byte[] byteArray27 = checksumCalculatingInputStream20.readAllBytes();
        byte[] byteArray29 = checksumCalculatingInputStream20.readNBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = checksumCalculatingInputStream6.read(byteArray29, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 32) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        checksumCalculatingInputStream7.close();
        checksumCalculatingInputStream7.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream12);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        byte[] byteArray15 = checksumCalculatingInputStream14.readAllBytes();
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        checksumCalculatingInputStream14.close();
        java.lang.Class<?> wildcardClass18 = checksumCalculatingInputStream14.getClass();
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream10);
        checksumCalculatingInputStream11.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream11);
        checksumCalculatingInputStream14.close();
        long long17 = checksumCalculatingInputStream14.skip((long) (byte) 0);
        boolean boolean18 = checksumCalculatingInputStream14.markSupported();
        java.util.zip.Checksum checksum19 = null;
        java.util.zip.Checksum checksum20 = null;
        java.util.zip.Checksum checksum21 = null;
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        int int23 = inputStream22.available();
        boolean boolean24 = inputStream22.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream25 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum21, inputStream22);
        long long27 = checksumCalculatingInputStream25.skip(100L);
        byte[] byteArray28 = checksumCalculatingInputStream25.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream29 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum20, (java.io.InputStream) checksumCalculatingInputStream25);
        byte[] byteArray31 = checksumCalculatingInputStream25.readNBytes(1);
        checksumCalculatingInputStream25.mark((int) '#');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream34 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum19, (java.io.InputStream) checksumCalculatingInputStream25);
        byte[] byteArray36 = checksumCalculatingInputStream34.readNBytes((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int39 = checksumCalculatingInputStream14.read(byteArray36, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        checksumCalculatingInputStream7.close();
        checksumCalculatingInputStream7.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream12);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        byte[] byteArray15 = checksumCalculatingInputStream14.readAllBytes();
        int int16 = checksumCalculatingInputStream14.read();
        java.util.zip.Checksum checksum17 = null;
        java.util.zip.Checksum checksum18 = null;
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        int int20 = inputStream19.available();
        boolean boolean21 = inputStream19.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum18, inputStream19);
        byte[] byteArray23 = checksumCalculatingInputStream22.readAllBytes();
        int int24 = checksumCalculatingInputStream22.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream25 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, (java.io.InputStream) checksumCalculatingInputStream22);
        checksumCalculatingInputStream25.close();
        long long28 = checksumCalculatingInputStream25.skip(10L);
        int int29 = checksumCalculatingInputStream25.read();
        int int30 = checksumCalculatingInputStream25.read();
        checksumCalculatingInputStream25.close();
        java.util.zip.Checksum checksum32 = null;
        java.util.zip.Checksum checksum33 = null;
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        int int35 = inputStream34.available();
        boolean boolean36 = inputStream34.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream37 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum33, inputStream34);
        long long39 = checksumCalculatingInputStream37.skip(100L);
        long long41 = checksumCalculatingInputStream37.skip((long) 'a');
        int int42 = checksumCalculatingInputStream37.read();
        int int43 = checksumCalculatingInputStream37.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream44 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum32, (java.io.InputStream) checksumCalculatingInputStream37);
        int int45 = checksumCalculatingInputStream37.available();
        checksumCalculatingInputStream37.close();
        int int47 = checksumCalculatingInputStream37.read();
        java.util.zip.Checksum checksum48 = null;
        java.util.zip.Checksum checksum49 = null;
        java.io.InputStream inputStream50 = java.io.InputStream.nullInputStream();
        int int51 = inputStream50.available();
        boolean boolean52 = inputStream50.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream53 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum49, inputStream50);
        long long55 = checksumCalculatingInputStream53.skip(100L);
        long long57 = checksumCalculatingInputStream53.skip((long) 'a');
        checksumCalculatingInputStream53.close();
        int int59 = checksumCalculatingInputStream53.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream60 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum48, (java.io.InputStream) checksumCalculatingInputStream53);
        byte[] byteArray64 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        int int65 = checksumCalculatingInputStream60.read(byteArray64);
        int int66 = checksumCalculatingInputStream37.read(byteArray64);
        int int67 = checksumCalculatingInputStream25.read(byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            int int70 = checksumCalculatingInputStream14.read(byteArray64, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [10, 10 + 10) out of bounds for length 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        long long10 = checksumCalculatingInputStream5.skip((long) (byte) -1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream5.close();
        long long14 = checksumCalculatingInputStream5.skip(0L);
        int int15 = checksumCalculatingInputStream5.available();
        java.util.zip.Checksum checksum16 = null;
        java.util.zip.Checksum checksum17 = null;
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        int int19 = inputStream18.available();
        boolean boolean20 = inputStream18.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, inputStream18);
        byte[] byteArray22 = checksumCalculatingInputStream21.readAllBytes();
        int int23 = checksumCalculatingInputStream21.read();
        checksumCalculatingInputStream21.close();
        checksumCalculatingInputStream21.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream26 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum16, (java.io.InputStream) checksumCalculatingInputStream21);
        byte[] byteArray27 = checksumCalculatingInputStream21.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = checksumCalculatingInputStream5.read(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) (byte) 100);
        boolean boolean11 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark(10);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream4.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        int int10 = checksumCalculatingInputStream5.read();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int13 = checksumCalculatingInputStream5.available();
        checksumCalculatingInputStream5.mark((int) (short) 1);
        checksumCalculatingInputStream5.mark((int) (short) -1);
        int int18 = checksumCalculatingInputStream5.available();
        checksumCalculatingInputStream5.close();
        byte[] byteArray21 = checksumCalculatingInputStream5.readNBytes((int) '#');
        long long23 = checksumCalculatingInputStream5.skip(0L);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) (byte) 100);
        boolean boolean11 = checksumCalculatingInputStream4.markSupported();
        byte[] byteArray12 = checksumCalculatingInputStream4.readAllBytes();
        long long14 = checksumCalculatingInputStream4.skip(0L);
        checksumCalculatingInputStream4.mark((int) '4');
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        int int12 = checksumCalculatingInputStream6.available();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        int int15 = checksumCalculatingInputStream6.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream6.mark((int) (short) 100);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        inputStream1.mark((int) ' ');
        byte[] byteArray5 = inputStream1.readNBytes((int) ' ');
        int int8 = inputStream0.readNBytes(byteArray5, 0, 0);
        byte[] byteArray10 = inputStream0.readNBytes((int) (short) 0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        byte[] byteArray6 = checksumCalculatingInputStream4.readAllBytes();
        int int7 = checksumCalculatingInputStream4.available();
        int int8 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        byte[] byteArray11 = checksumCalculatingInputStream4.readNBytes((int) (short) 100);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 10, (byte) 1 };
        int int17 = checksumCalculatingInputStream12.read(byteArray16);
        int int18 = checksumCalculatingInputStream12.read();
        int int19 = checksumCalculatingInputStream12.read();
        java.util.zip.Checksum checksum20 = null;
        java.util.zip.Checksum checksum21 = null;
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        int int23 = inputStream22.available();
        boolean boolean24 = inputStream22.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream25 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum21, inputStream22);
        long long27 = checksumCalculatingInputStream25.skip(100L);
        long long29 = checksumCalculatingInputStream25.skip((long) 'a');
        checksumCalculatingInputStream25.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream31 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum20, (java.io.InputStream) checksumCalculatingInputStream25);
        int int32 = checksumCalculatingInputStream25.available();
        java.util.zip.Checksum checksum33 = null;
        java.util.zip.Checksum checksum34 = null;
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        int int36 = inputStream35.available();
        boolean boolean37 = inputStream35.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream38 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum34, inputStream35);
        long long40 = checksumCalculatingInputStream38.skip(100L);
        long long42 = checksumCalculatingInputStream38.skip((long) 'a');
        int int43 = checksumCalculatingInputStream38.read();
        int int44 = checksumCalculatingInputStream38.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream45 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum33, (java.io.InputStream) checksumCalculatingInputStream38);
        int int46 = checksumCalculatingInputStream38.available();
        checksumCalculatingInputStream38.close();
        int int48 = checksumCalculatingInputStream38.read();
        byte[] byteArray49 = checksumCalculatingInputStream38.readAllBytes();
        int int52 = checksumCalculatingInputStream25.readNBytes(byteArray49, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = checksumCalculatingInputStream12.read(byteArray49, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        byte[] byteArray3 = inputStream2.readAllBytes();
        inputStream2.mark((int) 'a');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream6.close();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray6 = inputStream3.readAllBytes();
        byte[] byteArray7 = inputStream3.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream3);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream3);
        java.lang.Class<?> wildcardClass10 = inputStream3.getClass();
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        long long10 = checksumCalculatingInputStream6.skip((long) 'a');
        byte[] byteArray12 = checksumCalculatingInputStream6.readNBytes((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        long long16 = checksumCalculatingInputStream14.skip((long) (short) -1);
        java.util.zip.Checksum checksum17 = null;
        java.util.zip.Checksum checksum18 = null;
        java.util.zip.Checksum checksum19 = null;
        java.util.zip.Checksum checksum20 = null;
        java.io.InputStream inputStream21 = java.io.InputStream.nullInputStream();
        int int22 = inputStream21.available();
        boolean boolean23 = inputStream21.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream24 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum20, inputStream21);
        long long26 = checksumCalculatingInputStream24.skip(100L);
        long long28 = checksumCalculatingInputStream24.skip((long) 'a');
        checksumCalculatingInputStream24.close();
        int int30 = checksumCalculatingInputStream24.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream31 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum19, (java.io.InputStream) checksumCalculatingInputStream24);
        int int32 = checksumCalculatingInputStream24.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream33 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum18, (java.io.InputStream) checksumCalculatingInputStream24);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream34 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, (java.io.InputStream) checksumCalculatingInputStream24);
        byte[] byteArray36 = checksumCalculatingInputStream34.readNBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = checksumCalculatingInputStream14.read(byteArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream8.close();
        boolean boolean10 = checksumCalculatingInputStream8.markSupported();
        checksumCalculatingInputStream8.close();
        boolean boolean12 = checksumCalculatingInputStream8.markSupported();
        checksumCalculatingInputStream8.close();
        checksumCalculatingInputStream8.mark((int) 'a');
        int int16 = checksumCalculatingInputStream8.read();
        int int17 = checksumCalculatingInputStream8.read();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.available();
        int int7 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark(0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        checksumCalculatingInputStream5.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray9 = checksumCalculatingInputStream8.readAllBytes();
        byte[] byteArray11 = checksumCalculatingInputStream8.readNBytes((int) (byte) 100);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.close();
        byte[] byteArray9 = checksumCalculatingInputStream5.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray12 = checksumCalculatingInputStream5.readNBytes((int) (byte) 1);
        int int13 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.mark((int) 'a');
        int int16 = checksumCalculatingInputStream5.read();
        byte[] byteArray17 = checksumCalculatingInputStream5.readAllBytes();
        checksumCalculatingInputStream5.mark(10);
        int int20 = checksumCalculatingInputStream5.read();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        long long8 = checksumCalculatingInputStream4.skip((long) 'a');
        int int9 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        boolean boolean11 = checksumCalculatingInputStream4.markSupported();
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = checksumCalculatingInputStream4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.close();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        int int12 = checksumCalculatingInputStream5.read(byteArray11);
        byte[] byteArray14 = checksumCalculatingInputStream5.readNBytes((int) 'a');
        int int15 = checksumCalculatingInputStream5.available();
        byte[] byteArray16 = checksumCalculatingInputStream5.readAllBytes();
        long long18 = checksumCalculatingInputStream5.skip((long) (short) -1);
        int int19 = checksumCalculatingInputStream5.read();
        int int20 = checksumCalculatingInputStream5.read();
        int int21 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        long long24 = checksumCalculatingInputStream22.skip((long) (short) 0);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = checksumCalculatingInputStream22.transferTo(outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int9 = checksumCalculatingInputStream5.available();
        boolean boolean10 = checksumCalculatingInputStream5.markSupported();
        byte[] byteArray12 = checksumCalculatingInputStream5.readNBytes(1);
        int int13 = checksumCalculatingInputStream5.read();
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream5.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = java.io.InputStream.nullInputStream();
        int int6 = inputStream5.available();
        boolean boolean7 = inputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        byte[] byteArray9 = checksumCalculatingInputStream8.readAllBytes();
        int int10 = checksumCalculatingInputStream8.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream8);
        boolean boolean12 = checksumCalculatingInputStream8.markSupported();
        int int13 = checksumCalculatingInputStream8.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream8);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        long long18 = checksumCalculatingInputStream15.skip((long) (byte) -1);
        checksumCalculatingInputStream15.close();
        org.junit.Assert.assertNotNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int9 = checksumCalculatingInputStream5.available();
        boolean boolean10 = checksumCalculatingInputStream5.markSupported();
        long long12 = checksumCalculatingInputStream5.skip((long) '#');
        long long14 = checksumCalculatingInputStream5.skip((long) (byte) 0);
        byte[] byteArray15 = checksumCalculatingInputStream5.readAllBytes();
        int int16 = checksumCalculatingInputStream5.available();
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream5.transferTo(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray14 = checksumCalculatingInputStream5.readNBytes((int) (short) 10);
        checksumCalculatingInputStream5.mark(1);
        int int17 = checksumCalculatingInputStream5.available();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream5.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray7 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        int int9 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        long long12 = checksumCalculatingInputStream10.skip((long) (short) 10);
        long long14 = checksumCalculatingInputStream10.skip((long) 1);
        byte[] byteArray15 = checksumCalculatingInputStream10.readAllBytes();
        checksumCalculatingInputStream10.close();
        checksumCalculatingInputStream10.close();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = checksumCalculatingInputStream10.readNBytes((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        inputStream2.close();
        inputStream2.mark((int) (short) 1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream7);
        checksumCalculatingInputStream8.mark((int) (byte) -1);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream8.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        inputStream2.mark((int) ' ');
        byte[] byteArray6 = inputStream2.readNBytes((int) (byte) 100);
        inputStream2.mark((int) (byte) -1);
        inputStream2.mark((int) (short) -1);
        boolean boolean11 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        long long8 = checksumCalculatingInputStream6.skip(100L);
        long long10 = checksumCalculatingInputStream6.skip((long) 'a');
        checksumCalculatingInputStream6.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        long long15 = checksumCalculatingInputStream12.skip((long) (byte) 0);
        checksumCalculatingInputStream12.mark(1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.mark((int) (byte) 100);
        boolean boolean12 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray14 = checksumCalculatingInputStream5.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray7 = checksumCalculatingInputStream5.readAllBytes();
        int int8 = checksumCalculatingInputStream5.available();
        checksumCalculatingInputStream5.mark((-1));
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int13 = checksumCalculatingInputStream5.read();
        boolean boolean14 = checksumCalculatingInputStream5.markSupported();
        byte[] byteArray16 = checksumCalculatingInputStream5.readNBytes((int) 'a');
        byte[] byteArray17 = checksumCalculatingInputStream5.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        inputStream1.mark((int) ' ');
        byte[] byteArray5 = inputStream1.readNBytes((int) ' ');
        boolean boolean6 = inputStream1.markSupported();
        boolean boolean7 = inputStream1.markSupported();
        inputStream1.mark(0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int11 = checksumCalculatingInputStream10.available();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        long long8 = checksumCalculatingInputStream4.skip((long) 'a');
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        byte[] byteArray5 = inputStream1.readNBytes((int) (byte) 1);
        byte[] byteArray6 = inputStream1.readAllBytes();
        inputStream1.mark(1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int10 = checksumCalculatingInputStream9.available();
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream9.transferTo(outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int13 = checksumCalculatingInputStream5.available();
        byte[] byteArray15 = checksumCalculatingInputStream5.readNBytes((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = checksumCalculatingInputStream5.getClass();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        long long8 = checksumCalculatingInputStream4.skip((long) 'a');
        checksumCalculatingInputStream4.close();
        int int10 = checksumCalculatingInputStream4.read();
        long long12 = checksumCalculatingInputStream4.skip((long) (byte) 10);
        byte[] byteArray14 = checksumCalculatingInputStream4.readNBytes((int) (short) 10);
        checksumCalculatingInputStream4.mark(0);
        boolean boolean17 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (short) 100);
        int int20 = checksumCalculatingInputStream4.read();
        byte[] byteArray21 = checksumCalculatingInputStream4.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        byte[] byteArray4 = inputStream2.readNBytes(1);
        inputStream2.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long9 = checksumCalculatingInputStream7.skip(10L);
        checksumCalculatingInputStream7.mark(100);
        byte[] byteArray13 = checksumCalculatingInputStream7.readNBytes(100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream7);
        boolean boolean15 = checksumCalculatingInputStream7.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = checksumCalculatingInputStream7.readNBytes((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream11);
        byte[] byteArray13 = checksumCalculatingInputStream11.readAllBytes();
        long long15 = checksumCalculatingInputStream11.skip((long) '#');
        int int16 = checksumCalculatingInputStream11.read();
        boolean boolean17 = checksumCalculatingInputStream11.markSupported();
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        int int10 = checksumCalculatingInputStream4.available();
        byte[] byteArray11 = checksumCalculatingInputStream4.readAllBytes();
        checksumCalculatingInputStream4.mark(100);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream4.transferTo(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream9);
        byte[] byteArray12 = checksumCalculatingInputStream10.readNBytes((int) (short) 100);
        byte[] byteArray13 = checksumCalculatingInputStream10.readAllBytes();
        checksumCalculatingInputStream10.mark((int) (byte) 100);
        byte[] byteArray16 = checksumCalculatingInputStream10.readAllBytes();
        int int17 = checksumCalculatingInputStream10.available();
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream10.read(byteArray18, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark((int) ' ');
        byte[] byteArray4 = inputStream0.readNBytes((int) ' ');
        boolean boolean5 = inputStream0.markSupported();
        inputStream0.mark((int) (byte) 10);
        byte[] byteArray9 = inputStream0.readNBytes(100);
        // The following exception was thrown during execution in test generation
        try {
            inputStream0.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray11 = checksumCalculatingInputStream5.readNBytes(1);
        int int12 = checksumCalculatingInputStream5.available();
        checksumCalculatingInputStream5.mark((int) (byte) 100);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream5.transferTo(outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        int int10 = checksumCalculatingInputStream5.read();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int13 = checksumCalculatingInputStream5.available();
        long long15 = checksumCalculatingInputStream5.skip((long) (short) 10);
        checksumCalculatingInputStream5.mark(0);
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        inputStream18.mark((int) ' ');
        byte[] byteArray22 = inputStream18.readNBytes((int) (byte) 100);
        inputStream18.mark((int) (byte) -1);
        byte[] byteArray25 = inputStream18.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream5.read(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray9 = checksumCalculatingInputStream5.readAllBytes();
        int int10 = checksumCalculatingInputStream5.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int12 = checksumCalculatingInputStream5.read();
        byte[] byteArray14 = checksumCalculatingInputStream5.readNBytes((int) (short) 100);
        byte[] byteArray15 = checksumCalculatingInputStream5.readAllBytes();
        java.util.zip.Checksum checksum16 = null;
        java.util.zip.Checksum checksum17 = null;
        java.io.InputStream inputStream18 = java.io.InputStream.nullInputStream();
        int int19 = inputStream18.available();
        boolean boolean20 = inputStream18.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, inputStream18);
        byte[] byteArray22 = checksumCalculatingInputStream21.readAllBytes();
        int int23 = checksumCalculatingInputStream21.read();
        checksumCalculatingInputStream21.close();
        checksumCalculatingInputStream21.close();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        int int28 = checksumCalculatingInputStream21.read(byteArray27);
        long long30 = checksumCalculatingInputStream21.skip((-1L));
        checksumCalculatingInputStream21.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream32 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum16, (java.io.InputStream) checksumCalculatingInputStream21);
        byte[] byteArray33 = checksumCalculatingInputStream32.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = checksumCalculatingInputStream5.read(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        checksumCalculatingInputStream7.close();
        checksumCalculatingInputStream7.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream12);
        byte[] byteArray14 = checksumCalculatingInputStream12.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream12);
        long long17 = checksumCalculatingInputStream15.skip((long) (byte) 10);
        long long19 = checksumCalculatingInputStream15.skip(0L);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        boolean boolean10 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int12 = checksumCalculatingInputStream5.available();
        byte[] byteArray13 = checksumCalculatingInputStream5.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int12 = checksumCalculatingInputStream5.available();
        byte[] byteArray14 = checksumCalculatingInputStream5.readNBytes(100);
        byte[] byteArray15 = checksumCalculatingInputStream5.readAllBytes();
        long long17 = checksumCalculatingInputStream5.skip(0L);
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream9.close();
        long long12 = checksumCalculatingInputStream9.skip(10L);
        int int13 = checksumCalculatingInputStream9.read();
        checksumCalculatingInputStream9.mark((int) '#');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream9);
        boolean boolean17 = checksumCalculatingInputStream16.markSupported();
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream16.readNBytes(byteArray18, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        long long8 = checksumCalculatingInputStream4.skip((long) 'a');
        checksumCalculatingInputStream4.close();
        int int10 = checksumCalculatingInputStream4.read();
        long long12 = checksumCalculatingInputStream4.skip((long) (byte) 10);
        long long14 = checksumCalculatingInputStream4.skip((long) (byte) 100);
        int int15 = checksumCalculatingInputStream4.read();
        long long17 = checksumCalculatingInputStream4.skip((long) 100);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark(0);
        long long22 = checksumCalculatingInputStream4.skip(10L);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.util.zip.Checksum checksum5 = null;
        java.util.zip.Checksum checksum6 = null;
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        int int8 = inputStream7.available();
        boolean boolean9 = inputStream7.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum6, inputStream7);
        byte[] byteArray11 = checksumCalculatingInputStream10.readAllBytes();
        int int12 = checksumCalculatingInputStream10.read();
        checksumCalculatingInputStream10.close();
        checksumCalculatingInputStream10.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum5, (java.io.InputStream) checksumCalculatingInputStream10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, (java.io.InputStream) checksumCalculatingInputStream15);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream15);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream15);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream18);
        long long21 = checksumCalculatingInputStream19.skip((long) (byte) 1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream19);
        byte[] byteArray23 = checksumCalculatingInputStream19.readAllBytes();
        checksumCalculatingInputStream19.close();
        int int25 = checksumCalculatingInputStream19.available();
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        inputStream1.mark((int) ' ');
        byte[] byteArray5 = inputStream1.readNBytes((int) ' ');
        int int8 = inputStream0.readNBytes(byteArray5, 0, 0);
        inputStream0.mark((int) (short) 1);
        byte[] byteArray11 = inputStream0.readAllBytes();
        byte[] byteArray12 = inputStream0.readAllBytes();
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        byte[] byteArray7 = checksumCalculatingInputStream4.readAllBytes();
        int int8 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        int int10 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.mark((int) (byte) 1);
        long long14 = checksumCalculatingInputStream4.skip((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = checksumCalculatingInputStream4.readNBytes((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        byte[] byteArray7 = checksumCalculatingInputStream4.readAllBytes();
        long long9 = checksumCalculatingInputStream4.skip((long) (byte) -1);
        checksumCalculatingInputStream4.mark(0);
        long long13 = checksumCalculatingInputStream4.skip((long) ' ');
        long long15 = checksumCalculatingInputStream4.skip(10L);
        checksumCalculatingInputStream4.mark((int) (short) 10);
        java.util.zip.Checksum checksum18 = null;
        java.util.zip.Checksum checksum19 = null;
        java.util.zip.Checksum checksum20 = null;
        java.util.zip.Checksum checksum21 = null;
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        int int23 = inputStream22.available();
        boolean boolean24 = inputStream22.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream25 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum21, inputStream22);
        byte[] byteArray26 = checksumCalculatingInputStream25.readAllBytes();
        int int27 = checksumCalculatingInputStream25.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream28 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum20, (java.io.InputStream) checksumCalculatingInputStream25);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream29 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum19, (java.io.InputStream) checksumCalculatingInputStream28);
        checksumCalculatingInputStream29.mark((int) (byte) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream32 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum18, (java.io.InputStream) checksumCalculatingInputStream29);
        byte[] byteArray33 = checksumCalculatingInputStream32.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = checksumCalculatingInputStream4.read(byteArray33, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [97, 97 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        inputStream0.mark((int) ' ');
        byte[] byteArray4 = inputStream0.readNBytes((int) ' ');
        inputStream0.close();
        inputStream0.mark((int) (byte) 1);
        inputStream0.mark((int) (byte) 0);
        inputStream0.mark(0);
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        byte[] byteArray7 = checksumCalculatingInputStream4.readAllBytes();
        byte[] byteArray8 = checksumCalculatingInputStream4.readAllBytes();
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream4.read();
        byte[] byteArray12 = checksumCalculatingInputStream4.readAllBytes();
        boolean boolean13 = checksumCalculatingInputStream4.markSupported();
        boolean boolean14 = checksumCalculatingInputStream4.markSupported();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        inputStream1.mark((int) ' ');
        byte[] byteArray5 = inputStream1.readNBytes((int) (byte) 100);
        inputStream1.mark((int) (byte) -1);
        byte[] byteArray9 = inputStream1.readNBytes((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int11 = checksumCalculatingInputStream10.read();
        long long13 = checksumCalculatingInputStream10.skip(0L);
        byte[] byteArray14 = checksumCalculatingInputStream10.readAllBytes();
        byte[] byteArray15 = checksumCalculatingInputStream10.readAllBytes();
        checksumCalculatingInputStream10.mark((int) (byte) 1);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray9 = checksumCalculatingInputStream5.readAllBytes();
        checksumCalculatingInputStream5.mark((int) (short) -1);
        long long13 = checksumCalculatingInputStream5.skip((long) (byte) 10);
        long long15 = checksumCalculatingInputStream5.skip((long) (byte) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        boolean boolean17 = checksumCalculatingInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream16.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        int int9 = checksumCalculatingInputStream4.read();
        checksumCalculatingInputStream4.mark(0);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        int int9 = checksumCalculatingInputStream5.available();
        boolean boolean10 = checksumCalculatingInputStream5.markSupported();
        byte[] byteArray12 = checksumCalculatingInputStream5.readNBytes(1);
        java.util.zip.Checksum checksum13 = null;
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        int int15 = inputStream14.available();
        boolean boolean16 = inputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum13, inputStream14);
        byte[] byteArray18 = checksumCalculatingInputStream17.readAllBytes();
        int int19 = checksumCalculatingInputStream17.read();
        checksumCalculatingInputStream17.close();
        checksumCalculatingInputStream17.close();
        byte[] byteArray23 = new byte[] { (byte) 1 };
        int int24 = checksumCalculatingInputStream17.read(byteArray23);
        int int25 = checksumCalculatingInputStream5.read(byteArray23);
        byte[] byteArray26 = checksumCalculatingInputStream5.readAllBytes();
        int int27 = checksumCalculatingInputStream5.available();
        int int28 = checksumCalculatingInputStream5.available();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        byte[] byteArray9 = checksumCalculatingInputStream6.readAllBytes();
        java.util.zip.Checksum checksum10 = null;
        java.io.InputStream inputStream11 = java.io.InputStream.nullInputStream();
        int int12 = inputStream11.available();
        boolean boolean13 = inputStream11.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum10, inputStream11);
        long long16 = checksumCalculatingInputStream14.skip(100L);
        long long18 = checksumCalculatingInputStream14.skip((long) 'a');
        int int19 = checksumCalculatingInputStream14.read();
        checksumCalculatingInputStream14.close();
        java.util.zip.Checksum checksum21 = null;
        java.io.InputStream inputStream22 = java.io.InputStream.nullInputStream();
        int int23 = inputStream22.available();
        boolean boolean24 = inputStream22.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream25 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum21, inputStream22);
        byte[] byteArray26 = checksumCalculatingInputStream25.readAllBytes();
        int int27 = checksumCalculatingInputStream25.read();
        checksumCalculatingInputStream25.close();
        checksumCalculatingInputStream25.close();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        int int32 = checksumCalculatingInputStream25.read(byteArray31);
        int int33 = checksumCalculatingInputStream14.read(byteArray31);
        int int34 = checksumCalculatingInputStream6.read(byteArray31);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream35 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        checksumCalculatingInputStream6.mark((int) '#');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream38 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        byte[] byteArray40 = checksumCalculatingInputStream38.readNBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream38.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        byte[] byteArray8 = checksumCalculatingInputStream6.readAllBytes();
        int int9 = checksumCalculatingInputStream6.available();
        boolean boolean10 = checksumCalculatingInputStream6.markSupported();
        long long12 = checksumCalculatingInputStream6.skip((long) 10);
        byte[] byteArray13 = checksumCalculatingInputStream6.readAllBytes();
        long long15 = checksumCalculatingInputStream6.skip(10L);
        checksumCalculatingInputStream6.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream17);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        inputStream2.mark((int) ' ');
        byte[] byteArray6 = inputStream2.readNBytes((int) (byte) 100);
        inputStream2.mark((int) (byte) -1);
        byte[] byteArray10 = inputStream2.readNBytes((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray12 = checksumCalculatingInputStream11.readAllBytes();
        int int13 = checksumCalculatingInputStream11.read();
        int int14 = checksumCalculatingInputStream11.read();
        boolean boolean15 = checksumCalculatingInputStream11.markSupported();
        boolean boolean16 = checksumCalculatingInputStream11.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream11);
        boolean boolean18 = checksumCalculatingInputStream11.markSupported();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        long long9 = checksumCalculatingInputStream7.skip(100L);
        byte[] byteArray10 = checksumCalculatingInputStream7.readAllBytes();
        byte[] byteArray11 = checksumCalculatingInputStream7.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        byte[] byteArray13 = checksumCalculatingInputStream12.readAllBytes();
        checksumCalculatingInputStream12.mark(100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream12);
        checksumCalculatingInputStream16.close();
        checksumCalculatingInputStream16.close();
        checksumCalculatingInputStream16.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream16);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        byte[] byteArray6 = checksumCalculatingInputStream5.readAllBytes();
        int int7 = checksumCalculatingInputStream5.read();
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        int int9 = checksumCalculatingInputStream5.read();
        checksumCalculatingInputStream5.close();
        long long12 = checksumCalculatingInputStream5.skip((long) (byte) 100);
        long long14 = checksumCalculatingInputStream5.skip((long) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        byte[] byteArray16 = checksumCalculatingInputStream5.readAllBytes();
        java.util.zip.Checksum checksum17 = null;
        java.util.zip.Checksum checksum18 = null;
        java.io.InputStream inputStream19 = java.io.InputStream.nullInputStream();
        int int20 = inputStream19.available();
        boolean boolean21 = inputStream19.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum18, inputStream19);
        byte[] byteArray23 = checksumCalculatingInputStream22.readAllBytes();
        byte[] byteArray24 = checksumCalculatingInputStream22.readAllBytes();
        int int25 = checksumCalculatingInputStream22.available();
        checksumCalculatingInputStream22.mark((-1));
        byte[] byteArray28 = checksumCalculatingInputStream22.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream29 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum17, (java.io.InputStream) checksumCalculatingInputStream22);
        byte[] byteArray30 = checksumCalculatingInputStream22.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = checksumCalculatingInputStream5.readNBytes(byteArray30, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        int int4 = inputStream3.available();
        boolean boolean5 = inputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        byte[] byteArray7 = checksumCalculatingInputStream6.readAllBytes();
        int int8 = checksumCalculatingInputStream6.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream6);
        byte[] byteArray10 = checksumCalculatingInputStream6.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream6);
        boolean boolean12 = checksumCalculatingInputStream11.markSupported();
        long long14 = checksumCalculatingInputStream11.skip((long) (byte) 10);
        checksumCalculatingInputStream11.mark((int) (short) 1);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        byte[] byteArray8 = checksumCalculatingInputStream5.readAllBytes();
        byte[] byteArray9 = checksumCalculatingInputStream5.readAllBytes();
        checksumCalculatingInputStream5.mark((int) (short) -1);
        long long13 = checksumCalculatingInputStream5.skip((long) (byte) 10);
        long long15 = checksumCalculatingInputStream5.skip((long) (byte) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        boolean boolean17 = checksumCalculatingInputStream16.markSupported();
        byte[] byteArray18 = checksumCalculatingInputStream16.readAllBytes();
        long long20 = checksumCalculatingInputStream16.skip((long) (byte) 0);
        byte[] byteArray21 = checksumCalculatingInputStream16.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        int int6 = checksumCalculatingInputStream4.read();
        int int7 = checksumCalculatingInputStream4.available();
        long long9 = checksumCalculatingInputStream4.skip((long) (byte) 10);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        int int12 = checksumCalculatingInputStream4.read();
        byte[] byteArray13 = checksumCalculatingInputStream4.readAllBytes();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = checksumCalculatingInputStream4.readAllBytes();
        byte[] byteArray6 = checksumCalculatingInputStream4.readAllBytes();
        byte[] byteArray7 = checksumCalculatingInputStream4.readAllBytes();
        java.util.zip.Checksum checksum8 = null;
        java.io.InputStream inputStream9 = java.io.InputStream.nullInputStream();
        int int10 = inputStream9.available();
        boolean boolean11 = inputStream9.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum8, inputStream9);
        byte[] byteArray13 = checksumCalculatingInputStream12.readAllBytes();
        int int14 = checksumCalculatingInputStream12.read();
        long long16 = checksumCalculatingInputStream12.skip((long) 'a');
        byte[] byteArray18 = checksumCalculatingInputStream12.readNBytes((int) '4');
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        int int23 = checksumCalculatingInputStream12.read(byteArray22);
        int int26 = checksumCalculatingInputStream4.readNBytes(byteArray22, (int) (short) 1, 1);
        int int27 = checksumCalculatingInputStream4.read();
        int int28 = checksumCalculatingInputStream4.read();
        int int29 = checksumCalculatingInputStream4.read();
        byte[] byteArray30 = checksumCalculatingInputStream4.readAllBytes();
        boolean boolean31 = checksumCalculatingInputStream4.markSupported();
        long long33 = checksumCalculatingInputStream4.skip((long) (short) 0);
        checksumCalculatingInputStream4.mark((int) (byte) 100);
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        int int5 = inputStream4.available();
        boolean boolean6 = inputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        byte[] byteArray8 = checksumCalculatingInputStream7.readAllBytes();
        int int9 = checksumCalculatingInputStream7.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream7);
        byte[] byteArray11 = checksumCalculatingInputStream7.readAllBytes();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream7);
        int int14 = checksumCalculatingInputStream7.available();
        long long16 = checksumCalculatingInputStream7.skip((long) (short) -1);
        checksumCalculatingInputStream7.close();
        boolean boolean18 = checksumCalculatingInputStream7.markSupported();
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = checksumCalculatingInputStream7.transferTo(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = java.io.InputStream.nullInputStream();
        int int2 = inputStream1.available();
        boolean boolean3 = inputStream1.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        long long6 = checksumCalculatingInputStream4.skip(100L);
        long long8 = checksumCalculatingInputStream4.skip((long) 10);
        long long10 = checksumCalculatingInputStream4.skip((long) 100);
        long long12 = checksumCalculatingInputStream4.skip((long) (byte) 1);
        int int13 = checksumCalculatingInputStream4.read();
        org.junit.Assert.assertNotNull(inputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = java.io.InputStream.nullInputStream();
        int int3 = inputStream2.available();
        boolean boolean4 = inputStream2.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        long long7 = checksumCalculatingInputStream5.skip(100L);
        long long9 = checksumCalculatingInputStream5.skip((long) 'a');
        checksumCalculatingInputStream5.close();
        int int11 = checksumCalculatingInputStream5.read();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream5);
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertNotNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }
}

