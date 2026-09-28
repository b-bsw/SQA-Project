package org.apache.commons.compress.archivers.cpio;

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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int21 = cpioArchiveInputStream11.read(byteArray18, 4, (int) (byte) 0);
        long long22 = cpioArchiveInputStream11.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, (int) (short) 10);
        byte[] byteArray26 = cpioArchiveInputStream24.readNBytes((int) ' ');
        int int27 = cpioArchiveInputStream1.read(byteArray26);
        byte[] byteArray28 = cpioArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        int int7 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 512);
        int int10 = cpioArchiveInputStream9.read();
        boolean boolean11 = cpioArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        int int13 = cpioArchiveInputStream9.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream9.canReadEntryData(archiveEntry14);
        long long16 = cpioArchiveInputStream9.getBytesRead();
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int30 = cpioArchiveInputStream20.read(byteArray27, 4, (int) (byte) 0);
        int int31 = cpioArchiveInputStream18.read(byteArray27);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = cpioArchiveInputStream18.canReadEntryData(archiveEntry32);
        java.io.InputStream inputStream34 = java.io.InputStream.nullInputStream();
        byte[] byteArray35 = inputStream34.readAllBytes();
        int int36 = cpioArchiveInputStream18.read(byteArray35);
        byte[] byteArray37 = cpioArchiveInputStream18.readAllBytes();
        byte[] byteArray38 = cpioArchiveInputStream18.readAllBytes();
        int int39 = cpioArchiveInputStream9.read(byteArray38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        boolean boolean9 = cpioArchiveInputStream7.markSupported();
        int int10 = cpioArchiveInputStream7.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        byte[] byteArray12 = cpioArchiveInputStream7.readAllBytes();
        byte[] byteArray13 = cpioArchiveInputStream7.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        long long16 = cpioArchiveInputStream1.skip((long) (short) 10);
        int int17 = cpioArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (int) '#');
        boolean boolean5 = cpioArchiveInputStream4.markSupported();
        byte[] byteArray6 = cpioArchiveInputStream4.readAllBytes();
        byte[] byteArray8 = cpioArchiveInputStream4.readNBytes(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        int int12 = cpioArchiveInputStream11.available();
        int int13 = cpioArchiveInputStream11.read();
        long long14 = cpioArchiveInputStream11.getBytesRead();
        int int15 = cpioArchiveInputStream11.read();
        cpioArchiveInputStream11.mark(8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = cpioArchiveInputStream11.canReadEntryData(archiveEntry18);
        byte[] byteArray20 = cpioArchiveInputStream11.readAllBytes();
        int int21 = cpioArchiveInputStream4.read(byteArray20);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        long long24 = cpioArchiveInputStream23.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23);
        long long27 = cpioArchiveInputStream25.skip((long) (short) 100);
        long long28 = cpioArchiveInputStream25.getBytesRead();
        byte[] byteArray30 = cpioArchiveInputStream25.readNBytes(61440);
        byte[] byteArray31 = cpioArchiveInputStream25.readAllBytes();
        long long32 = cpioArchiveInputStream25.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = cpioArchiveInputStream25.canReadEntryData(archiveEntry33);
        byte[] byteArray35 = cpioArchiveInputStream25.readAllBytes();
        int int36 = cpioArchiveInputStream4.read(byteArray35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int13 = cpioArchiveInputStream3.read(byteArray10, 4, (int) (byte) 0);
        int int14 = cpioArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        int int17 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = cpioArchiveInputStream1.canReadEntryData(archiveEntry18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8192);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream21);
        int int23 = cpioArchiveInputStream22.getCount();
        java.lang.Class<?> wildcardClass24 = cpioArchiveInputStream22.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        int int4 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, (int) (byte) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, 2048);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = cpioArchiveInputStream8.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        cpioArchiveInputStream1.mark((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream13, 32768);
        boolean boolean16 = cpioArchiveInputStream13.markSupported();
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        long long19 = cpioArchiveInputStream18.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream18);
        byte[] byteArray21 = cpioArchiveInputStream18.readAllBytes();
        byte[] byteArray22 = cpioArchiveInputStream18.readAllBytes();
        byte[] byteArray23 = cpioArchiveInputStream18.readAllBytes();
        boolean boolean25 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray23, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = cpioArchiveInputStream13.read(byteArray23, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        boolean boolean9 = cpioArchiveInputStream7.markSupported();
        int int10 = cpioArchiveInputStream7.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        byte[] byteArray12 = cpioArchiveInputStream7.readAllBytes();
        byte[] byteArray13 = cpioArchiveInputStream7.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream18);
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream20);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int31 = cpioArchiveInputStream21.read(byteArray28, 4, (int) (byte) 0);
        int int32 = cpioArchiveInputStream19.read(byteArray28);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = cpioArchiveInputStream19.canReadEntryData(archiveEntry33);
        int int35 = cpioArchiveInputStream19.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = cpioArchiveInputStream19.canReadEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream19, 49152);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream40);
        boolean boolean42 = cpioArchiveInputStream41.markSupported();
        boolean boolean43 = cpioArchiveInputStream41.markSupported();
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream44);
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int55 = cpioArchiveInputStream45.read(byteArray52, 4, (int) (byte) 0);
        java.io.InputStream inputStream56 = java.io.InputStream.nullInputStream();
        byte[] byteArray57 = inputStream56.readAllBytes();
        int int58 = cpioArchiveInputStream45.read(byteArray57);
        int int59 = cpioArchiveInputStream41.read(byteArray57);
        int int60 = cpioArchiveInputStream39.read(byteArray57);
        boolean boolean62 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray57, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = cpioArchiveInputStream1.read(byteArray57, (int) (byte) 1, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int18 = cpioArchiveInputStream8.read(byteArray15, 4, (int) (byte) 0);
        long long19 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, (int) (short) 10);
        boolean boolean22 = cpioArchiveInputStream21.markSupported();
        byte[] byteArray24 = cpioArchiveInputStream21.readNBytes((int) '4');
        boolean boolean26 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray24, 0);
        int int27 = cpioArchiveInputStream1.read(byteArray24);
        cpioArchiveInputStream1.mark(32768);
        cpioArchiveInputStream1.mark(8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        int int13 = cpioArchiveInputStream12.getCount();
        int int14 = cpioArchiveInputStream12.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        int int18 = cpioArchiveInputStream12.getCount();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long21 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        byte[] byteArray23 = cpioArchiveInputStream20.readAllBytes();
        long long25 = cpioArchiveInputStream20.skip((long) 16);
        long long27 = cpioArchiveInputStream20.skip((long) '#');
        byte[] byteArray28 = cpioArchiveInputStream20.readAllBytes();
        int int29 = cpioArchiveInputStream12.read(byteArray28);
        int int30 = cpioArchiveInputStream12.available();
        long long31 = cpioArchiveInputStream12.getBytesRead();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        long long34 = cpioArchiveInputStream33.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream33);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream33, 8);
        boolean boolean38 = cpioArchiveInputStream33.markSupported();
        long long39 = cpioArchiveInputStream33.getBytesRead();
        boolean boolean40 = cpioArchiveInputStream33.markSupported();
        byte[] byteArray42 = cpioArchiveInputStream33.readNBytes((int) (short) 8);
        byte[] byteArray43 = cpioArchiveInputStream33.readAllBytes();
        int int44 = cpioArchiveInputStream12.read(byteArray43);
        int int45 = cpioArchiveInputStream12.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int20 = cpioArchiveInputStream10.read(byteArray17, 4, (int) (byte) 0);
        int int21 = cpioArchiveInputStream8.read(byteArray17);
        int int22 = cpioArchiveInputStream1.read(byteArray17);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream23);
        int int25 = cpioArchiveInputStream24.read();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        byte[] byteArray28 = inputStream26.readNBytes((int) (byte) 1);
        int int29 = cpioArchiveInputStream24.read(byteArray28);
        int int30 = cpioArchiveInputStream1.read(byteArray28);
        int int31 = cpioArchiveInputStream1.available();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int43 = cpioArchiveInputStream33.read(byteArray40, 4, (int) (byte) 0);
        int int46 = cpioArchiveInputStream1.readNBytes(byteArray40, (int) (byte) 0, 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry47 = null;
        boolean boolean48 = cpioArchiveInputStream1.canReadEntryData(archiveEntry47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        int int15 = cpioArchiveInputStream1.available();
        long long16 = cpioArchiveInputStream1.getBytesRead();
        cpioArchiveInputStream1.mark((int) '#');
        byte[] byteArray19 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray21 = cpioArchiveInputStream1.readNBytes(1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 29127);
        int int6 = cpioArchiveInputStream5.available();
        cpioArchiveInputStream5.close();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream14.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int30 = cpioArchiveInputStream20.read(byteArray27, 4, (int) (byte) 0);
        int int31 = cpioArchiveInputStream18.read(byteArray27);
        long long33 = cpioArchiveInputStream18.skip((long) 36864);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int45 = cpioArchiveInputStream35.read(byteArray42, 4, (int) (byte) 0);
        java.io.InputStream inputStream46 = java.io.InputStream.nullInputStream();
        byte[] byteArray47 = inputStream46.readAllBytes();
        int int48 = cpioArchiveInputStream35.read(byteArray47);
        byte[] byteArray49 = cpioArchiveInputStream35.readAllBytes();
        int int50 = cpioArchiveInputStream18.read(byteArray49);
        int int51 = cpioArchiveInputStream14.read(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry52 = cpioArchiveInputStream14.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int6 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 8);
        int int9 = cpioArchiveInputStream8.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream8.canReadEntryData(archiveEntry10);
        boolean boolean12 = cpioArchiveInputStream8.markSupported();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        boolean boolean15 = cpioArchiveInputStream14.markSupported();
        boolean boolean16 = cpioArchiveInputStream14.markSupported();
        int int17 = cpioArchiveInputStream14.getCount();
        cpioArchiveInputStream14.mark((int) 'a');
        byte[] byteArray21 = cpioArchiveInputStream14.readNBytes((int) (short) 3);
        byte[] byteArray23 = cpioArchiveInputStream14.readNBytes(4096);
        int int24 = cpioArchiveInputStream8.read(byteArray23);
        int int25 = cpioArchiveInputStream8.getCount();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream26);
        long long28 = cpioArchiveInputStream27.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream31, (-1));
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        boolean boolean36 = cpioArchiveInputStream35.markSupported();
        boolean boolean37 = cpioArchiveInputStream35.markSupported();
        int int38 = cpioArchiveInputStream35.getCount();
        cpioArchiveInputStream35.mark((int) 'a');
        java.io.InputStream inputStream41 = java.io.InputStream.nullInputStream();
        byte[] byteArray43 = inputStream41.readNBytes((int) (byte) 1);
        int int44 = cpioArchiveInputStream35.read(byteArray43);
        byte[] byteArray45 = cpioArchiveInputStream35.readAllBytes();
        int int46 = cpioArchiveInputStream33.read(byteArray45);
        int int47 = cpioArchiveInputStream33.read();
        java.io.InputStream inputStream48 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream48);
        long long50 = cpioArchiveInputStream49.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream49);
        byte[] byteArray52 = cpioArchiveInputStream49.readAllBytes();
        int int53 = cpioArchiveInputStream49.available();
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream54);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream55, (int) '4');
        byte[] byteArray59 = cpioArchiveInputStream55.readNBytes((int) (short) 1);
        int int60 = cpioArchiveInputStream49.read(byteArray59);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream49, (int) (short) 8);
        int int63 = cpioArchiveInputStream49.getCount();
        byte[] byteArray65 = cpioArchiveInputStream49.readNBytes(4096);
        int int66 = cpioArchiveInputStream33.read(byteArray65);
        int int67 = cpioArchiveInputStream8.read(byteArray65);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray65, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream7.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 29127);
        long long14 = cpioArchiveInputStream11.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        boolean boolean15 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray17 = cpioArchiveInputStream1.readNBytes((int) '4');
        byte[] byteArray18 = cpioArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int6 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 8);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        long long14 = cpioArchiveInputStream11.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 0);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = cpioArchiveInputStream19.canReadEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray25 = inputStream24.readAllBytes();
        int int26 = cpioArchiveInputStream19.read(byteArray25);
        int int27 = cpioArchiveInputStream11.read(byteArray25);
        int int28 = cpioArchiveInputStream8.read(byteArray25);
        byte[] byteArray30 = cpioArchiveInputStream8.readNBytes((int) (short) 12);
        long long32 = cpioArchiveInputStream8.skip((long) (short) 4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry33 = null;
        boolean boolean34 = cpioArchiveInputStream8.canReadEntryData(archiveEntry33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        int int13 = cpioArchiveInputStream12.read();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int25 = cpioArchiveInputStream15.read(byteArray22, 4, (int) (byte) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, (int) (short) 2);
        long long31 = cpioArchiveInputStream15.skip((long) (short) 1);
        boolean boolean32 = cpioArchiveInputStream15.markSupported();
        boolean boolean33 = cpioArchiveInputStream15.markSupported();
        byte[] byteArray35 = cpioArchiveInputStream15.readNBytes((int) (short) 8);
        int int36 = cpioArchiveInputStream12.read(byteArray35);
        int int37 = cpioArchiveInputStream12.available();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 100);
        int int9 = cpioArchiveInputStream8.getCount();
        boolean boolean10 = cpioArchiveInputStream8.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream25, 256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream25, 61440);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream29);
        int int31 = cpioArchiveInputStream30.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry32 = cpioArchiveInputStream30.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        byte[] byteArray11 = cpioArchiveInputStream8.readAllBytes();
        int int12 = cpioArchiveInputStream8.available();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, (int) '4');
        byte[] byteArray18 = cpioArchiveInputStream14.readNBytes((int) (short) 1);
        int int19 = cpioArchiveInputStream8.read(byteArray18);
        int int20 = cpioArchiveInputStream1.read(byteArray18);
        java.lang.Class<?> wildcardClass21 = byteArray18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        int int7 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, (int) (short) 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, (int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream13, (int) (byte) 100);
        cpioArchiveInputStream15.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        int int11 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8192);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = cpioArchiveInputStream13.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        byte[] byteArray8 = cpioArchiveInputStream1.readNBytes((int) (short) 3);
        byte[] byteArray10 = cpioArchiveInputStream1.readNBytes(4096);
        byte[] byteArray12 = cpioArchiveInputStream1.readNBytes((int) '4');
        int int13 = cpioArchiveInputStream1.read();
        int int14 = cpioArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray4 = cpioArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5);
        boolean boolean7 = cpioArchiveInputStream6.markSupported();
        boolean boolean8 = cpioArchiveInputStream6.markSupported();
        int int9 = cpioArchiveInputStream6.getCount();
        cpioArchiveInputStream6.mark((int) 'a');
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray14 = inputStream12.readNBytes((int) (byte) 1);
        int int15 = cpioArchiveInputStream6.read(byteArray14);
        byte[] byteArray16 = cpioArchiveInputStream6.readAllBytes();
        int int17 = cpioArchiveInputStream1.read(byteArray16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24, (int) '#');
        byte[] byteArray30 = cpioArchiveInputStream28.readNBytes((int) (short) 0);
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, (int) (byte) -1);
        int int33 = cpioArchiveInputStream1.read(byteArray30);
        byte[] byteArray34 = cpioArchiveInputStream1.readAllBytes();
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream35);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int46 = cpioArchiveInputStream36.read(byteArray43, 4, (int) (byte) 0);
        long long47 = cpioArchiveInputStream36.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream36, (int) (short) 10);
        int int50 = cpioArchiveInputStream49.read();
        int int51 = cpioArchiveInputStream49.getCount();
        byte[] byteArray53 = cpioArchiveInputStream49.readNBytes(16);
        boolean boolean55 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray53, (int) (byte) 0);
        int int56 = cpioArchiveInputStream1.read(byteArray53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream2.canReadEntryData(archiveEntry6);
        long long9 = cpioArchiveInputStream2.skip((long) 32);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        boolean boolean13 = cpioArchiveInputStream11.markSupported();
        int int14 = cpioArchiveInputStream11.getCount();
        cpioArchiveInputStream11.mark((int) 'a');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray19 = inputStream17.readNBytes((int) (byte) 1);
        int int20 = cpioArchiveInputStream11.read(byteArray19);
        byte[] byteArray21 = cpioArchiveInputStream11.readAllBytes();
        int int22 = cpioArchiveInputStream2.read(byteArray21);
        byte[] byteArray24 = cpioArchiveInputStream2.readNBytes(61440);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, (int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 0);
        java.lang.Class<?> wildcardClass29 = cpioArchiveInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        int int13 = cpioArchiveInputStream12.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, (int) (short) 10);
        byte[] byteArray17 = cpioArchiveInputStream16.readAllBytes();
        boolean boolean18 = cpioArchiveInputStream16.markSupported();
        boolean boolean19 = cpioArchiveInputStream16.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        int int4 = cpioArchiveInputStream3.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 256);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 4);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long4 = cpioArchiveInputStream3.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, (int) (short) 1);
        int int8 = cpioArchiveInputStream3.read();
        int int9 = cpioArchiveInputStream3.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        cpioArchiveInputStream5.mark((int) (short) 2);
        byte[] byteArray8 = cpioArchiveInputStream5.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, 4096);
        byte[] byteArray18 = cpioArchiveInputStream17.readAllBytes();
        long long19 = cpioArchiveInputStream17.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23);
        int int25 = cpioArchiveInputStream24.read();
        byte[] byteArray26 = cpioArchiveInputStream24.readAllBytes();
        byte[] byteArray27 = cpioArchiveInputStream24.readAllBytes();
        cpioArchiveInputStream24.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream24.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream4.readAllBytes();
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        long long8 = cpioArchiveInputStream1.skip((long) 10);
        long long9 = cpioArchiveInputStream1.getBytesRead();
        int int10 = cpioArchiveInputStream1.available();
        int int11 = cpioArchiveInputStream1.available();
        int int12 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream1.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 61440);
        long long18 = cpioArchiveInputStream16.skip((long) 4096);
        int int19 = cpioArchiveInputStream16.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        long long8 = cpioArchiveInputStream5.getBytesRead();
        cpioArchiveInputStream5.mark(128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        long long13 = cpioArchiveInputStream5.skip(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 64);
        int int3 = cpioArchiveInputStream2.getCount();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long6 = cpioArchiveInputStream5.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 8);
        byte[] byteArray11 = cpioArchiveInputStream5.readNBytes(61440);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int23 = cpioArchiveInputStream13.read(byteArray20, 4, (int) (byte) 0);
        long long24 = cpioArchiveInputStream13.getBytesRead();
        boolean boolean25 = cpioArchiveInputStream13.markSupported();
        int int26 = cpioArchiveInputStream13.read();
        int int27 = cpioArchiveInputStream13.getCount();
        java.io.InputStream inputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream28);
        boolean boolean30 = cpioArchiveInputStream29.markSupported();
        boolean boolean31 = cpioArchiveInputStream29.markSupported();
        int int32 = cpioArchiveInputStream29.getCount();
        cpioArchiveInputStream29.mark((int) 'a');
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        byte[] byteArray37 = inputStream35.readNBytes((int) (byte) 1);
        int int38 = cpioArchiveInputStream29.read(byteArray37);
        int int39 = cpioArchiveInputStream13.read(byteArray37);
        byte[] byteArray40 = cpioArchiveInputStream13.readAllBytes();
        int int41 = cpioArchiveInputStream5.read(byteArray40);
        boolean boolean43 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray40, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = cpioArchiveInputStream2.readNBytes(byteArray40, 49152, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [49152, 49152 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        int int7 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 512);
        int int10 = cpioArchiveInputStream9.read();
        boolean boolean11 = cpioArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        int int13 = cpioArchiveInputStream9.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream9.canReadEntryData(archiveEntry14);
        boolean boolean16 = cpioArchiveInputStream9.markSupported();
        long long17 = cpioArchiveInputStream9.getBytesRead();
        long long18 = cpioArchiveInputStream9.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int6 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 8);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        long long14 = cpioArchiveInputStream11.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 0);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = cpioArchiveInputStream19.canReadEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray25 = inputStream24.readAllBytes();
        int int26 = cpioArchiveInputStream19.read(byteArray25);
        int int27 = cpioArchiveInputStream11.read(byteArray25);
        int int28 = cpioArchiveInputStream8.read(byteArray25);
        boolean boolean29 = cpioArchiveInputStream8.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream30);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry32 = null;
        boolean boolean33 = cpioArchiveInputStream31.canReadEntryData(archiveEntry32);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream31.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 256);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream4.canReadEntryData(archiveEntry5);
        int int7 = cpioArchiveInputStream4.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        int int13 = cpioArchiveInputStream12.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        long long15 = cpioArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 0);
        int int18 = cpioArchiveInputStream14.getCount();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream21);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int32 = cpioArchiveInputStream22.read(byteArray29, 4, (int) (byte) 0);
        int int33 = cpioArchiveInputStream20.read(byteArray29);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = cpioArchiveInputStream20.canReadEntryData(archiveEntry34);
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        byte[] byteArray37 = inputStream36.readAllBytes();
        int int38 = cpioArchiveInputStream20.read(byteArray37);
        long long40 = cpioArchiveInputStream20.skip((long) 49152);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        boolean boolean43 = cpioArchiveInputStream42.markSupported();
        boolean boolean44 = cpioArchiveInputStream42.markSupported();
        int int45 = cpioArchiveInputStream42.getCount();
        cpioArchiveInputStream42.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = cpioArchiveInputStream42.canReadEntryData(archiveEntry48);
        boolean boolean50 = cpioArchiveInputStream42.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream42, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = cpioArchiveInputStream42.canReadEntryData(archiveEntry53);
        int int55 = cpioArchiveInputStream42.available();
        byte[] byteArray61 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int62 = cpioArchiveInputStream42.read(byteArray61);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream42, (-1));
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream65);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream65, (int) '#');
        byte[] byteArray71 = cpioArchiveInputStream69.readNBytes((int) (short) 0);
        boolean boolean73 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray71, (int) (byte) -1);
        int int74 = cpioArchiveInputStream42.read(byteArray71);
        byte[] byteArray75 = cpioArchiveInputStream42.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream76 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream42);
        byte[] byteArray78 = cpioArchiveInputStream42.readNBytes((int) '#');
        int int79 = cpioArchiveInputStream20.read(byteArray78);
        int int80 = cpioArchiveInputStream14.read(byteArray78);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 100);
        boolean boolean9 = cpioArchiveInputStream8.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream1.canReadEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        boolean boolean25 = cpioArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry26 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = cpioArchiveInputStream2.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream2.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream2.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream2.markSupported();
        int int10 = cpioArchiveInputStream2.getCount();
        int int11 = cpioArchiveInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        int int6 = cpioArchiveInputStream2.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 32768);
        int int9 = cpioArchiveInputStream8.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        int int11 = cpioArchiveInputStream8.available();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int20 = cpioArchiveInputStream10.read(byteArray17, 4, (int) (byte) 0);
        int int21 = cpioArchiveInputStream8.read(byteArray17);
        int int22 = cpioArchiveInputStream1.read(byteArray17);
        byte[] byteArray23 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray25 = cpioArchiveInputStream1.readNBytes((int) (short) 100);
        int int26 = cpioArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes(100);
        byte[] byteArray7 = cpioArchiveInputStream1.readNBytes(2048);
        int int8 = cpioArchiveInputStream1.read();
        cpioArchiveInputStream1.mark(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int6 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 8);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        long long14 = cpioArchiveInputStream11.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 0);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = cpioArchiveInputStream19.canReadEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream19.canReadEntryData(archiveEntry22);
        java.io.InputStream inputStream24 = java.io.InputStream.nullInputStream();
        byte[] byteArray25 = inputStream24.readAllBytes();
        int int26 = cpioArchiveInputStream19.read(byteArray25);
        int int27 = cpioArchiveInputStream11.read(byteArray25);
        int int28 = cpioArchiveInputStream8.read(byteArray25);
        byte[] byteArray30 = cpioArchiveInputStream8.readNBytes((int) (short) 12);
        long long32 = cpioArchiveInputStream8.skip((long) (short) 4);
        long long34 = cpioArchiveInputStream8.skip((long) 128);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int13 = cpioArchiveInputStream3.read(byteArray10, 4, (int) (byte) 0);
        int int14 = cpioArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        int int17 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray20 = cpioArchiveInputStream1.readNBytes(4096);
        int int21 = cpioArchiveInputStream1.getCount();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        int int6 = cpioArchiveInputStream5.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        byte[] byteArray8 = cpioArchiveInputStream5.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        int int10 = cpioArchiveInputStream6.getCount();
        int int11 = cpioArchiveInputStream6.available();
        int int12 = cpioArchiveInputStream6.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int13 = cpioArchiveInputStream3.read(byteArray10, 4, (int) (byte) 0);
        int int14 = cpioArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        int int17 = cpioArchiveInputStream1.read();
        int int18 = cpioArchiveInputStream1.read();
        long long19 = cpioArchiveInputStream1.getBytesRead();
        long long20 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) -1);
        long long23 = cpioArchiveInputStream22.getBytesRead();
        byte[] byteArray25 = cpioArchiveInputStream22.readNBytes((int) (short) 10);
        boolean boolean26 = cpioArchiveInputStream22.markSupported();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        byte[] byteArray16 = cpioArchiveInputStream14.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 512);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long21 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        long long24 = cpioArchiveInputStream22.skip((long) (short) 100);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        int int27 = cpioArchiveInputStream26.read();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = inputStream28.readNBytes((int) (byte) 1);
        int int31 = cpioArchiveInputStream26.read(byteArray30);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int45 = cpioArchiveInputStream35.read(byteArray42, 4, (int) (byte) 0);
        int int46 = cpioArchiveInputStream33.read(byteArray42);
        int int47 = cpioArchiveInputStream26.read(byteArray42);
        int int48 = cpioArchiveInputStream22.read(byteArray42);
        boolean boolean49 = cpioArchiveInputStream22.markSupported();
        byte[] byteArray50 = cpioArchiveInputStream22.readAllBytes();
        byte[] byteArray51 = cpioArchiveInputStream22.readAllBytes();
        int int52 = cpioArchiveInputStream14.read(byteArray51);
        int int53 = cpioArchiveInputStream14.read();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        long long16 = cpioArchiveInputStream14.skip((long) (short) 3);
        byte[] byteArray17 = cpioArchiveInputStream14.readAllBytes();
        byte[] byteArray19 = cpioArchiveInputStream14.readNBytes(0);
        byte[] byteArray21 = cpioArchiveInputStream14.readNBytes(8);
        long long22 = cpioArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        int int9 = cpioArchiveInputStream3.getCount();
        int int10 = cpioArchiveInputStream3.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, (int) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = cpioArchiveInputStream7.transferTo(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = cpioArchiveInputStream5.canReadEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 4);
        long long12 = cpioArchiveInputStream5.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        byte[] byteArray6 = cpioArchiveInputStream1.readNBytes((int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        cpioArchiveInputStream7.mark(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes(100);
        byte[] byteArray7 = cpioArchiveInputStream1.readNBytes(2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 0);
        int int10 = cpioArchiveInputStream9.read();
        int int11 = cpioArchiveInputStream9.read();
        byte[] byteArray12 = cpioArchiveInputStream9.readAllBytes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        byte[] byteArray16 = cpioArchiveInputStream14.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 512);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long21 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        long long24 = cpioArchiveInputStream22.skip((long) (short) 100);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        int int27 = cpioArchiveInputStream26.read();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = inputStream28.readNBytes((int) (byte) 1);
        int int31 = cpioArchiveInputStream26.read(byteArray30);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int45 = cpioArchiveInputStream35.read(byteArray42, 4, (int) (byte) 0);
        int int46 = cpioArchiveInputStream33.read(byteArray42);
        int int47 = cpioArchiveInputStream26.read(byteArray42);
        int int48 = cpioArchiveInputStream22.read(byteArray42);
        boolean boolean49 = cpioArchiveInputStream22.markSupported();
        byte[] byteArray50 = cpioArchiveInputStream22.readAllBytes();
        byte[] byteArray51 = cpioArchiveInputStream22.readAllBytes();
        int int52 = cpioArchiveInputStream14.read(byteArray51);
        byte[] byteArray53 = cpioArchiveInputStream14.readAllBytes();
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        byte[] byteArray56 = inputStream54.readNBytes((int) (byte) 1);
        boolean boolean58 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray56, (int) (short) -1);
        int int59 = cpioArchiveInputStream14.read(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream61 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        int int13 = cpioArchiveInputStream12.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        int int15 = cpioArchiveInputStream14.getCount();
        boolean boolean16 = cpioArchiveInputStream14.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        byte[] byteArray3 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 2);
        byte[] byteArray7 = cpioArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, (int) '4');
        byte[] byteArray13 = cpioArchiveInputStream9.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, 64);
        boolean boolean16 = cpioArchiveInputStream9.markSupported();
        byte[] byteArray18 = cpioArchiveInputStream9.readNBytes((int) (short) 12);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        boolean boolean21 = cpioArchiveInputStream20.markSupported();
        long long23 = cpioArchiveInputStream20.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream25, (-1));
        byte[] byteArray29 = cpioArchiveInputStream27.readNBytes((int) (short) 0);
        int int30 = cpioArchiveInputStream9.read(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = cpioArchiveInputStream5.readNBytes(byteArray29, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [1, 1 + 100) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        byte[] byteArray17 = cpioArchiveInputStream1.readNBytes(128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        boolean boolean19 = cpioArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int20 = cpioArchiveInputStream10.read(byteArray17, 4, (int) (byte) 0);
        int int21 = cpioArchiveInputStream8.read(byteArray17);
        int int22 = cpioArchiveInputStream1.read(byteArray17);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream23);
        int int25 = cpioArchiveInputStream24.read();
        java.io.InputStream inputStream26 = java.io.InputStream.nullInputStream();
        byte[] byteArray28 = inputStream26.readNBytes((int) (byte) 1);
        int int29 = cpioArchiveInputStream24.read(byteArray28);
        int int30 = cpioArchiveInputStream1.read(byteArray28);
        int int31 = cpioArchiveInputStream1.available();
        byte[] byteArray32 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        int int8 = cpioArchiveInputStream1.read();
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes(100);
        byte[] byteArray7 = cpioArchiveInputStream1.readNBytes(2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 0);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        int int13 = cpioArchiveInputStream12.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream12.canReadEntryData(archiveEntry14);
        cpioArchiveInputStream12.mark((int) (byte) 100);
        byte[] byteArray19 = cpioArchiveInputStream12.readNBytes((int) (short) 4);
        byte[] byteArray21 = cpioArchiveInputStream12.readNBytes((int) 'a');
        int int22 = cpioArchiveInputStream9.read(byteArray21);
        byte[] byteArray24 = cpioArchiveInputStream9.readNBytes((int) (byte) 0);
        int int25 = cpioArchiveInputStream9.read();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray15 = cpioArchiveInputStream1.readAllBytes();
        int int16 = cpioArchiveInputStream1.available();
        byte[] byteArray17 = cpioArchiveInputStream1.readAllBytes();
        int int18 = cpioArchiveInputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        int int13 = cpioArchiveInputStream12.getCount();
        int int14 = cpioArchiveInputStream12.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = cpioArchiveInputStream12.canReadEntryData(archiveEntry17);
        cpioArchiveInputStream12.mark(29127);
        byte[] byteArray21 = cpioArchiveInputStream12.readAllBytes();
        int int22 = cpioArchiveInputStream12.available();
        byte[] byteArray23 = cpioArchiveInputStream12.readAllBytes();
        boolean boolean24 = cpioArchiveInputStream12.markSupported();
        int int25 = cpioArchiveInputStream12.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        long long14 = cpioArchiveInputStream1.skip((long) (byte) 1);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int28 = cpioArchiveInputStream18.read(byteArray25, 4, (int) (byte) 0);
        int int29 = cpioArchiveInputStream16.read(byteArray25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = cpioArchiveInputStream16.canReadEntryData(archiveEntry30);
        int int32 = cpioArchiveInputStream16.read();
        byte[] byteArray34 = cpioArchiveInputStream16.readNBytes((int) '#');
        int int35 = cpioArchiveInputStream1.read(byteArray34);
        boolean boolean36 = cpioArchiveInputStream1.markSupported();
        int int37 = cpioArchiveInputStream1.getCount();
        long long38 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean39 = cpioArchiveInputStream1.markSupported();
        long long40 = cpioArchiveInputStream1.getBytesRead();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        boolean boolean43 = cpioArchiveInputStream42.markSupported();
        boolean boolean44 = cpioArchiveInputStream42.markSupported();
        int int45 = cpioArchiveInputStream42.getCount();
        cpioArchiveInputStream42.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry48 = null;
        boolean boolean49 = cpioArchiveInputStream42.canReadEntryData(archiveEntry48);
        long long51 = cpioArchiveInputStream42.skip((long) 128);
        boolean boolean52 = cpioArchiveInputStream42.markSupported();
        byte[] byteArray54 = cpioArchiveInputStream42.readNBytes(40960);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream42, (int) '4');
        long long57 = cpioArchiveInputStream56.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry58 = null;
        boolean boolean59 = cpioArchiveInputStream56.canReadEntryData(archiveEntry58);
        int int60 = cpioArchiveInputStream56.available();
        byte[] byteArray61 = cpioArchiveInputStream56.readAllBytes();
        int int62 = cpioArchiveInputStream1.read(byteArray61);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int24 = cpioArchiveInputStream14.read(byteArray21, 4, (int) (byte) 0);
        long long25 = cpioArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, (int) (short) 10);
        byte[] byteArray29 = cpioArchiveInputStream27.readNBytes((int) ' ');
        long long31 = cpioArchiveInputStream27.skip((long) (byte) 100);
        byte[] byteArray32 = cpioArchiveInputStream27.readAllBytes();
        int int33 = cpioArchiveInputStream5.read(byteArray32);
        byte[] byteArray35 = cpioArchiveInputStream5.readNBytes(128);
        cpioArchiveInputStream5.mark((int) 'a');
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream38);
        boolean boolean40 = cpioArchiveInputStream39.markSupported();
        long long42 = cpioArchiveInputStream39.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream39);
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream45 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream44);
        long long46 = cpioArchiveInputStream45.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream45);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream45, 8);
        byte[] byteArray50 = cpioArchiveInputStream49.readAllBytes();
        int int51 = cpioArchiveInputStream43.read(byteArray50);
        int int52 = cpioArchiveInputStream5.read(byteArray50);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry53 = null;
        boolean boolean54 = cpioArchiveInputStream5.canReadEntryData(archiveEntry53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        long long5 = cpioArchiveInputStream1.skip((long) 4);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        long long10 = cpioArchiveInputStream7.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, 0);
        long long14 = cpioArchiveInputStream12.skip((long) ' ');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = cpioArchiveInputStream12.canReadEntryData(archiveEntry17);
        byte[] byteArray19 = cpioArchiveInputStream12.readAllBytes();
        int int20 = cpioArchiveInputStream1.read(byteArray19);
        int int21 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        int int15 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = cpioArchiveInputStream1.canReadEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        cpioArchiveInputStream18.mark((int) (short) 2);
        byte[] byteArray22 = cpioArchiveInputStream18.readNBytes(8192);
        int int23 = cpioArchiveInputStream18.getCount();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = cpioArchiveInputStream11.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        byte[] byteArray7 = cpioArchiveInputStream1.readAllBytes();
        boolean boolean8 = cpioArchiveInputStream1.markSupported();
        int int9 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        cpioArchiveInputStream2.mark((int) (byte) 100);
        int int8 = cpioArchiveInputStream2.getCount();
        byte[] byteArray10 = cpioArchiveInputStream2.readNBytes(4096);
        boolean boolean11 = cpioArchiveInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = cpioArchiveInputStream2.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream2.canReadEntryData(archiveEntry5);
        int int7 = cpioArchiveInputStream2.read();
        long long8 = cpioArchiveInputStream2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream2.canReadEntryData(archiveEntry6);
        long long9 = cpioArchiveInputStream2.skip((long) 32);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        boolean boolean13 = cpioArchiveInputStream11.markSupported();
        int int14 = cpioArchiveInputStream11.getCount();
        cpioArchiveInputStream11.mark((int) 'a');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray19 = inputStream17.readNBytes((int) (byte) 1);
        int int20 = cpioArchiveInputStream11.read(byteArray19);
        byte[] byteArray21 = cpioArchiveInputStream11.readAllBytes();
        int int22 = cpioArchiveInputStream2.read(byteArray21);
        byte[] byteArray24 = cpioArchiveInputStream2.readNBytes(61440);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, (int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 61440);
        int int29 = cpioArchiveInputStream28.read();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        int int33 = cpioArchiveInputStream32.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = cpioArchiveInputStream32.canReadEntryData(archiveEntry34);
        int int36 = cpioArchiveInputStream32.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream32, 32768);
        long long39 = cpioArchiveInputStream38.getBytesRead();
        int int40 = cpioArchiveInputStream38.getCount();
        byte[] byteArray42 = cpioArchiveInputStream38.readNBytes(32768);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = cpioArchiveInputStream28.readNBytes(byteArray42, 0, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 12) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        long long10 = cpioArchiveInputStream6.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, 49152);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = cpioArchiveInputStream6.transferTo(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray6 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray7 = cpioArchiveInputStream1.readAllBytes();
        long long9 = cpioArchiveInputStream1.skip((long) 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 16);
        byte[] byteArray13 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int6 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        cpioArchiveInputStream1.mark(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        int int9 = cpioArchiveInputStream6.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        long long12 = cpioArchiveInputStream11.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11);
        byte[] byteArray14 = cpioArchiveInputStream11.readAllBytes();
        int int15 = cpioArchiveInputStream11.available();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17, (int) '4');
        byte[] byteArray21 = cpioArchiveInputStream17.readNBytes((int) (short) 1);
        int int22 = cpioArchiveInputStream11.read(byteArray21);
        int int23 = cpioArchiveInputStream11.getCount();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24);
        boolean boolean26 = cpioArchiveInputStream25.markSupported();
        boolean boolean27 = cpioArchiveInputStream25.markSupported();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray29 = inputStream28.readAllBytes();
        int int30 = cpioArchiveInputStream25.read(byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, 2);
        int int33 = cpioArchiveInputStream11.read(byteArray29);
        int int34 = cpioArchiveInputStream6.read(byteArray29);
        long long36 = cpioArchiveInputStream6.skip((long) 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        byte[] byteArray38 = cpioArchiveInputStream6.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray38, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream4.readAllBytes();
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        long long8 = cpioArchiveInputStream1.skip((long) 10);
        long long10 = cpioArchiveInputStream1.skip((long) 1024);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream1.canReadEntryData(archiveEntry9);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        java.lang.Class<?> wildcardClass12 = cpioArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        long long14 = cpioArchiveInputStream1.skip((long) (byte) 1);
        cpioArchiveInputStream1.mark(36864);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry17 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        long long5 = cpioArchiveInputStream4.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 8);
        cpioArchiveInputStream8.mark((int) (short) 2);
        byte[] byteArray11 = cpioArchiveInputStream8.readAllBytes();
        int int12 = cpioArchiveInputStream1.read(byteArray11);
        boolean boolean13 = cpioArchiveInputStream1.markSupported();
        int int14 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        byte[] byteArray6 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray8 = cpioArchiveInputStream1.readNBytes((int) '4');
        byte[] byteArray9 = cpioArchiveInputStream1.readAllBytes();
        int int10 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        byte[] byteArray7 = cpioArchiveInputStream1.readNBytes((int) (byte) 1);
        long long8 = cpioArchiveInputStream1.getBytesRead();
        cpioArchiveInputStream1.mark(49152);
        java.lang.Class<?> wildcardClass11 = cpioArchiveInputStream1.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        int int6 = cpioArchiveInputStream2.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 0);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        boolean boolean11 = cpioArchiveInputStream10.markSupported();
        boolean boolean12 = cpioArchiveInputStream10.markSupported();
        int int13 = cpioArchiveInputStream10.getCount();
        cpioArchiveInputStream10.mark((int) 'a');
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int27 = cpioArchiveInputStream17.read(byteArray24, 4, (int) (byte) 0);
        long long28 = cpioArchiveInputStream17.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream17, (int) (short) 10);
        boolean boolean31 = cpioArchiveInputStream30.markSupported();
        byte[] byteArray33 = cpioArchiveInputStream30.readNBytes((int) '4');
        boolean boolean35 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray33, 0);
        int int36 = cpioArchiveInputStream10.read(byteArray33);
        int int37 = cpioArchiveInputStream2.read(byteArray33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray7 = cpioArchiveInputStream5.readNBytes(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        int int9 = cpioArchiveInputStream5.read();
        int int10 = cpioArchiveInputStream5.getCount();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int22 = cpioArchiveInputStream12.read(byteArray19, 4, (int) (byte) 0);
        long long23 = cpioArchiveInputStream12.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, (int) (short) 10);
        byte[] byteArray27 = cpioArchiveInputStream25.readNBytes((int) ' ');
        long long29 = cpioArchiveInputStream25.skip((long) (byte) 100);
        byte[] byteArray31 = cpioArchiveInputStream25.readNBytes(64);
        boolean boolean33 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray31, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = cpioArchiveInputStream5.read(byteArray31, 64, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        byte[] byteArray9 = cpioArchiveInputStream3.readAllBytes();
        byte[] byteArray11 = cpioArchiveInputStream3.readNBytes(49152);
        byte[] byteArray13 = cpioArchiveInputStream3.readNBytes(256);
        int int14 = cpioArchiveInputStream3.read();
        byte[] byteArray15 = cpioArchiveInputStream3.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes(100);
        byte[] byteArray7 = cpioArchiveInputStream1.readNBytes(2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 0);
        long long11 = cpioArchiveInputStream1.skip((long) 40960);
        boolean boolean12 = cpioArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        boolean boolean11 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray13 = cpioArchiveInputStream1.readNBytes(40960);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        long long16 = cpioArchiveInputStream15.getBytesRead();
        boolean boolean17 = cpioArchiveInputStream15.markSupported();
        boolean boolean18 = cpioArchiveInputStream15.markSupported();
        byte[] byteArray19 = cpioArchiveInputStream15.readAllBytes();
        java.lang.Class<?> wildcardClass20 = byteArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream2.canReadEntryData(archiveEntry6);
        long long9 = cpioArchiveInputStream2.skip((long) 32);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        boolean boolean13 = cpioArchiveInputStream11.markSupported();
        int int14 = cpioArchiveInputStream11.getCount();
        cpioArchiveInputStream11.mark((int) 'a');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray19 = inputStream17.readNBytes((int) (byte) 1);
        int int20 = cpioArchiveInputStream11.read(byteArray19);
        byte[] byteArray21 = cpioArchiveInputStream11.readAllBytes();
        int int22 = cpioArchiveInputStream2.read(byteArray21);
        byte[] byteArray24 = cpioArchiveInputStream2.readNBytes(61440);
        int int25 = cpioArchiveInputStream2.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        int int27 = cpioArchiveInputStream26.available();
        int int28 = cpioArchiveInputStream26.available();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream26.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream26);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int37 = cpioArchiveInputStream27.read(byteArray34, 4, (int) (byte) 0);
        int int38 = cpioArchiveInputStream25.read(byteArray34);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = null;
        boolean boolean40 = cpioArchiveInputStream25.canReadEntryData(archiveEntry39);
        long long41 = cpioArchiveInputStream25.getBytesRead();
        byte[] byteArray42 = cpioArchiveInputStream25.readAllBytes();
        int int43 = cpioArchiveInputStream23.read(byteArray42);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = cpioArchiveInputStream23.canReadEntryData(archiveEntry44);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23);
        boolean boolean47 = cpioArchiveInputStream23.markSupported();
        java.io.InputStream inputStream48 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream48);
        long long50 = cpioArchiveInputStream49.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream49);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream53 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream49, 8);
        boolean boolean54 = cpioArchiveInputStream49.markSupported();
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream55);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int66 = cpioArchiveInputStream56.read(byteArray63, 4, (int) (byte) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, (int) (short) 2);
        long long72 = cpioArchiveInputStream56.skip((long) (short) 1);
        boolean boolean73 = cpioArchiveInputStream56.markSupported();
        boolean boolean74 = cpioArchiveInputStream56.markSupported();
        byte[] byteArray75 = cpioArchiveInputStream56.readAllBytes();
        int int76 = cpioArchiveInputStream49.read(byteArray75);
        int int77 = cpioArchiveInputStream23.read(byteArray75);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean13 = cpioArchiveInputStream1.markSupported();
        int int14 = cpioArchiveInputStream1.read();
        int int15 = cpioArchiveInputStream1.getCount();
        boolean boolean16 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        boolean boolean19 = cpioArchiveInputStream18.markSupported();
        boolean boolean20 = cpioArchiveInputStream18.markSupported();
        int int21 = cpioArchiveInputStream18.getCount();
        cpioArchiveInputStream18.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = cpioArchiveInputStream18.canReadEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream18);
        byte[] byteArray27 = cpioArchiveInputStream18.readAllBytes();
        byte[] byteArray29 = cpioArchiveInputStream18.readNBytes((int) (short) 3);
        int int30 = cpioArchiveInputStream1.read(byteArray29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int42 = cpioArchiveInputStream32.read(byteArray39, 4, (int) (byte) 0);
        long long43 = cpioArchiveInputStream32.getBytesRead();
        long long45 = cpioArchiveInputStream32.skip((long) (byte) 1);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream46);
        java.io.InputStream inputStream48 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream48);
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int59 = cpioArchiveInputStream49.read(byteArray56, 4, (int) (byte) 0);
        int int60 = cpioArchiveInputStream47.read(byteArray56);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = null;
        boolean boolean62 = cpioArchiveInputStream47.canReadEntryData(archiveEntry61);
        int int63 = cpioArchiveInputStream47.read();
        byte[] byteArray65 = cpioArchiveInputStream47.readNBytes((int) '#');
        int int66 = cpioArchiveInputStream32.read(byteArray65);
        boolean boolean67 = cpioArchiveInputStream32.markSupported();
        int int68 = cpioArchiveInputStream32.getCount();
        byte[] byteArray70 = cpioArchiveInputStream32.readNBytes(32768);
        int int71 = cpioArchiveInputStream1.read(byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray70, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] {});
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int3 = cpioArchiveInputStream2.read();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        boolean boolean6 = cpioArchiveInputStream5.markSupported();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, 8);
        cpioArchiveInputStream12.mark((int) (short) 2);
        byte[] byteArray15 = cpioArchiveInputStream12.readAllBytes();
        int int16 = cpioArchiveInputStream5.read(byteArray15);
        int int17 = cpioArchiveInputStream2.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry18 = cpioArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        int int13 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream5.canReadEntryData(archiveEntry14);
        int int16 = cpioArchiveInputStream5.read();
        boolean boolean17 = cpioArchiveInputStream5.markSupported();
        boolean boolean18 = cpioArchiveInputStream5.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, 10);
        byte[] byteArray27 = cpioArchiveInputStream25.readNBytes((int) '4');
        cpioArchiveInputStream25.mark(8);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        int int33 = cpioArchiveInputStream32.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = cpioArchiveInputStream32.canReadEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = cpioArchiveInputStream32.canReadEntryData(archiveEntry36);
        long long39 = cpioArchiveInputStream32.skip((long) 32);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream40);
        boolean boolean42 = cpioArchiveInputStream41.markSupported();
        boolean boolean43 = cpioArchiveInputStream41.markSupported();
        int int44 = cpioArchiveInputStream41.getCount();
        cpioArchiveInputStream41.mark((int) 'a');
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        byte[] byteArray49 = inputStream47.readNBytes((int) (byte) 1);
        int int50 = cpioArchiveInputStream41.read(byteArray49);
        byte[] byteArray51 = cpioArchiveInputStream41.readAllBytes();
        int int52 = cpioArchiveInputStream32.read(byteArray51);
        byte[] byteArray54 = cpioArchiveInputStream32.readNBytes(61440);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, (int) '4');
        byte[] byteArray60 = cpioArchiveInputStream56.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, 64);
        boolean boolean63 = cpioArchiveInputStream56.markSupported();
        byte[] byteArray65 = cpioArchiveInputStream56.readNBytes((int) (short) 12);
        int int66 = cpioArchiveInputStream32.read(byteArray65);
        int int67 = cpioArchiveInputStream25.read(byteArray65);
        int int68 = cpioArchiveInputStream25.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int18 = cpioArchiveInputStream8.read(byteArray15, 4, (int) (byte) 0);
        long long19 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, (int) (short) 10);
        boolean boolean22 = cpioArchiveInputStream21.markSupported();
        byte[] byteArray24 = cpioArchiveInputStream21.readNBytes((int) '4');
        boolean boolean26 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray24, 0);
        int int27 = cpioArchiveInputStream1.read(byteArray24);
        cpioArchiveInputStream1.mark(32768);
        int int30 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (-1));
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5);
        int int7 = cpioArchiveInputStream6.available();
        int int8 = cpioArchiveInputStream6.read();
        long long9 = cpioArchiveInputStream6.getBytesRead();
        byte[] byteArray11 = cpioArchiveInputStream6.readNBytes((int) (short) 1);
        int int12 = inputStream0.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (int) ' ');
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = inputStream7.readNBytes((int) (byte) 1);
        int int10 = cpioArchiveInputStream1.read(byteArray9);
        byte[] byteArray11 = cpioArchiveInputStream1.readAllBytes();
        int int12 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long14 = cpioArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int13 = cpioArchiveInputStream3.read(byteArray10, 4, (int) (byte) 0);
        int int14 = cpioArchiveInputStream1.read(byteArray10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = inputStream17.readAllBytes();
        int int19 = cpioArchiveInputStream1.read(byteArray18);
        long long20 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 40960);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 64);
        boolean boolean8 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray10 = cpioArchiveInputStream1.readNBytes((int) (short) 12);
        boolean boolean12 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int6 = cpioArchiveInputStream5.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 8);
        int int9 = cpioArchiveInputStream8.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream8.canReadEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream8.canReadEntryData(archiveEntry12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        long long13 = cpioArchiveInputStream1.getBytesRead();
        int int14 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream1.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray12 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream1.canReadEntryData(archiveEntry13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        boolean boolean10 = cpioArchiveInputStream9.markSupported();
        boolean boolean11 = cpioArchiveInputStream9.markSupported();
        int int12 = cpioArchiveInputStream9.getCount();
        cpioArchiveInputStream9.mark((int) 'a');
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        byte[] byteArray17 = inputStream15.readNBytes((int) (byte) 1);
        int int18 = cpioArchiveInputStream9.read(byteArray17);
        byte[] byteArray19 = cpioArchiveInputStream9.readAllBytes();
        int int20 = cpioArchiveInputStream7.read(byteArray19);
        int int21 = cpioArchiveInputStream7.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry22 = cpioArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        byte[] byteArray17 = cpioArchiveInputStream1.readNBytes(128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray19 = cpioArchiveInputStream18.readAllBytes();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream20);
        long long22 = cpioArchiveInputStream21.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream21);
        byte[] byteArray24 = cpioArchiveInputStream21.readAllBytes();
        int int25 = cpioArchiveInputStream21.available();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream26);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27, (int) '4');
        byte[] byteArray31 = cpioArchiveInputStream27.readNBytes((int) (short) 1);
        int int32 = cpioArchiveInputStream21.read(byteArray31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream21, (int) (short) 8);
        int int35 = cpioArchiveInputStream21.getCount();
        byte[] byteArray37 = cpioArchiveInputStream21.readNBytes(4096);
        int int38 = cpioArchiveInputStream21.read();
        boolean boolean39 = cpioArchiveInputStream21.markSupported();
        byte[] byteArray40 = cpioArchiveInputStream21.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = cpioArchiveInputStream18.readNBytes(byteArray40, 24576, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [24576, 24576 + 0) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray4 = cpioArchiveInputStream1.readAllBytes();
        int int5 = cpioArchiveInputStream1.available();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, (int) '4');
        byte[] byteArray11 = cpioArchiveInputStream7.readNBytes((int) (short) 1);
        int int12 = cpioArchiveInputStream1.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 8);
        byte[] byteArray16 = cpioArchiveInputStream1.readNBytes(1);
        byte[] byteArray17 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray19 = cpioArchiveInputStream1.readNBytes((int) (byte) 100);
        int int20 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry23 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray4 = cpioArchiveInputStream1.readAllBytes();
        int int5 = cpioArchiveInputStream1.available();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, (int) '4');
        byte[] byteArray11 = cpioArchiveInputStream7.readNBytes((int) (short) 1);
        int int12 = cpioArchiveInputStream1.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 8);
        long long15 = cpioArchiveInputStream1.getBytesRead();
        long long17 = cpioArchiveInputStream1.skip((long) ' ');
        int int18 = cpioArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        long long4 = cpioArchiveInputStream1.skip((long) 36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        cpioArchiveInputStream6.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray13 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream1.canReadEntryData(archiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        int int9 = cpioArchiveInputStream3.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = cpioArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray6 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray7 = cpioArchiveInputStream1.readAllBytes();
        long long9 = cpioArchiveInputStream1.skip((long) 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11);
        cpioArchiveInputStream12.mark(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.getCount();
        long long15 = cpioArchiveInputStream1.getBytesRead();
        int int16 = cpioArchiveInputStream1.getCount();
        boolean boolean17 = cpioArchiveInputStream1.markSupported();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        boolean boolean11 = cpioArchiveInputStream10.markSupported();
        boolean boolean12 = cpioArchiveInputStream10.markSupported();
        int int13 = cpioArchiveInputStream10.getCount();
        cpioArchiveInputStream10.mark((int) 'a');
        long long16 = cpioArchiveInputStream10.getBytesRead();
        long long18 = cpioArchiveInputStream10.skip((long) 2048);
        byte[] byteArray20 = cpioArchiveInputStream10.readNBytes((int) (short) 12);
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream22.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream9.canReadEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream9.canReadEntryData(archiveEntry12);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = inputStream14.readAllBytes();
        int int16 = cpioArchiveInputStream9.read(byteArray15);
        int int17 = cpioArchiveInputStream1.read(byteArray15);
        long long19 = cpioArchiveInputStream1.skip((long) '4');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream21, 0);
        byte[] byteArray25 = cpioArchiveInputStream21.readNBytes(256);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = cpioArchiveInputStream1.readNBytes((int) (short) 4);
        long long18 = cpioArchiveInputStream1.skip(1L);
        int int19 = cpioArchiveInputStream1.getCount();
        byte[] byteArray20 = cpioArchiveInputStream1.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray20, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        byte[] byteArray7 = cpioArchiveInputStream6.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        byte[] byteArray10 = cpioArchiveInputStream8.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        byte[] byteArray9 = cpioArchiveInputStream3.readAllBytes();
        byte[] byteArray11 = cpioArchiveInputStream3.readNBytes(49152);
        int int12 = cpioArchiveInputStream3.available();
        int int13 = cpioArchiveInputStream3.getCount();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        int int10 = cpioArchiveInputStream6.read();
        int int11 = cpioArchiveInputStream6.getCount();
        int int12 = cpioArchiveInputStream6.available();
        long long14 = cpioArchiveInputStream6.skip((long) (short) 4);
        int int15 = cpioArchiveInputStream6.read();
        boolean boolean16 = cpioArchiveInputStream6.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        boolean boolean5 = cpioArchiveInputStream4.markSupported();
        long long7 = cpioArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 0);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream12.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = inputStream17.readAllBytes();
        int int19 = cpioArchiveInputStream12.read(byteArray18);
        int int20 = cpioArchiveInputStream4.read(byteArray18);
        int int21 = cpioArchiveInputStream1.read(byteArray18);
        byte[] byteArray23 = cpioArchiveInputStream1.readNBytes((int) (short) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = cpioArchiveInputStream1.canReadEntryData(archiveEntry24);
        byte[] byteArray27 = cpioArchiveInputStream1.readNBytes(61440);
        cpioArchiveInputStream1.mark((int) (short) 12);
        int int30 = cpioArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean13 = cpioArchiveInputStream1.markSupported();
        int int14 = cpioArchiveInputStream1.read();
        int int15 = cpioArchiveInputStream1.getCount();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        boolean boolean18 = cpioArchiveInputStream17.markSupported();
        boolean boolean19 = cpioArchiveInputStream17.markSupported();
        int int20 = cpioArchiveInputStream17.getCount();
        cpioArchiveInputStream17.mark((int) 'a');
        java.io.InputStream inputStream23 = java.io.InputStream.nullInputStream();
        byte[] byteArray25 = inputStream23.readNBytes((int) (byte) 1);
        int int26 = cpioArchiveInputStream17.read(byteArray25);
        int int27 = cpioArchiveInputStream1.read(byteArray25);
        byte[] byteArray28 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray30 = cpioArchiveInputStream1.readNBytes(10);
        long long32 = cpioArchiveInputStream1.skip((long) (byte) 0);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream33);
        int int35 = cpioArchiveInputStream34.read();
        java.io.InputStream inputStream36 = java.io.InputStream.nullInputStream();
        byte[] byteArray38 = inputStream36.readNBytes((int) (byte) 1);
        int int39 = cpioArchiveInputStream34.read(byteArray38);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream40);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream42);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int53 = cpioArchiveInputStream43.read(byteArray50, 4, (int) (byte) 0);
        int int54 = cpioArchiveInputStream41.read(byteArray50);
        int int55 = cpioArchiveInputStream34.read(byteArray50);
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream56);
        int int58 = cpioArchiveInputStream57.read();
        java.io.InputStream inputStream59 = java.io.InputStream.nullInputStream();
        byte[] byteArray61 = inputStream59.readNBytes((int) (byte) 1);
        int int62 = cpioArchiveInputStream57.read(byteArray61);
        int int63 = cpioArchiveInputStream34.read(byteArray61);
        int int64 = cpioArchiveInputStream34.available();
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream66 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream65);
        byte[] byteArray73 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int76 = cpioArchiveInputStream66.read(byteArray73, 4, (int) (byte) 0);
        int int79 = cpioArchiveInputStream34.readNBytes(byteArray73, (int) (byte) 0, 1);
        cpioArchiveInputStream34.mark(32768);
        int int82 = cpioArchiveInputStream34.getCount();
        byte[] byteArray84 = cpioArchiveInputStream34.readNBytes((int) (byte) 10);
        int int85 = cpioArchiveInputStream1.read(byteArray84);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(inputStream36);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(inputStream59);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] {});
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        cpioArchiveInputStream1.mark(16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.lang.Class<?> wildcardClass18 = cpioArchiveInputStream1.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        boolean boolean23 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray20, (int) 'a');
        boolean boolean25 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray20, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream9.canReadEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream9.canReadEntryData(archiveEntry12);
        java.io.InputStream inputStream14 = java.io.InputStream.nullInputStream();
        byte[] byteArray15 = inputStream14.readAllBytes();
        int int16 = cpioArchiveInputStream9.read(byteArray15);
        int int17 = cpioArchiveInputStream1.read(byteArray15);
        long long19 = cpioArchiveInputStream1.skip((long) '4');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        int int22 = cpioArchiveInputStream21.available();
        cpioArchiveInputStream21.mark(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        cpioArchiveInputStream12.mark(128);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        cpioArchiveInputStream5.mark((int) (short) 2);
        long long9 = cpioArchiveInputStream5.skip((long) 64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream5.canReadEntryData(archiveEntry10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = cpioArchiveInputStream5.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = cpioArchiveInputStream1.canReadEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = cpioArchiveInputStream1.canReadEntryData(archiveEntry26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 64);
        int int8 = cpioArchiveInputStream7.getCount();
        int int9 = cpioArchiveInputStream7.available();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray7 = cpioArchiveInputStream1.readAllBytes();
        boolean boolean8 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray6 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray7 = cpioArchiveInputStream1.readAllBytes();
        long long9 = cpioArchiveInputStream1.skip((long) 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 16);
        byte[] byteArray13 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        long long17 = cpioArchiveInputStream1.skip((long) 24576);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 29127);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        int int9 = cpioArchiveInputStream3.getCount();
        cpioArchiveInputStream3.mark((int) (short) 100);
        long long12 = cpioArchiveInputStream3.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, (int) (short) 2);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        boolean boolean17 = cpioArchiveInputStream16.markSupported();
        boolean boolean18 = cpioArchiveInputStream16.markSupported();
        int int19 = cpioArchiveInputStream16.getCount();
        cpioArchiveInputStream16.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream16.canReadEntryData(archiveEntry22);
        long long25 = cpioArchiveInputStream16.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16, (int) (short) 1);
        int int28 = cpioArchiveInputStream27.getCount();
        int int29 = cpioArchiveInputStream27.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = cpioArchiveInputStream27.canReadEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27);
        long long33 = cpioArchiveInputStream32.getBytesRead();
        byte[] byteArray34 = cpioArchiveInputStream32.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = cpioArchiveInputStream14.readNBytes(byteArray34, 0, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [0, 0 + 4096) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        boolean boolean9 = cpioArchiveInputStream7.markSupported();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        byte[] byteArray11 = inputStream10.readAllBytes();
        int int12 = cpioArchiveInputStream7.read(byteArray11);
        int int13 = cpioArchiveInputStream5.read(byteArray11);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int25 = cpioArchiveInputStream15.read(byteArray22, 4, (int) (byte) 0);
        long long26 = cpioArchiveInputStream15.getBytesRead();
        long long28 = cpioArchiveInputStream15.skip((long) (byte) 1);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream31);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int42 = cpioArchiveInputStream32.read(byteArray39, 4, (int) (byte) 0);
        int int43 = cpioArchiveInputStream30.read(byteArray39);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry44 = null;
        boolean boolean45 = cpioArchiveInputStream30.canReadEntryData(archiveEntry44);
        int int46 = cpioArchiveInputStream30.read();
        byte[] byteArray48 = cpioArchiveInputStream30.readNBytes((int) '#');
        int int49 = cpioArchiveInputStream15.read(byteArray48);
        int int50 = cpioArchiveInputStream5.read(byteArray48);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry51 = null;
        boolean boolean52 = cpioArchiveInputStream5.canReadEntryData(archiveEntry51);
        java.io.InputStream inputStream53 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream53);
        boolean boolean55 = cpioArchiveInputStream54.markSupported();
        boolean boolean56 = cpioArchiveInputStream54.markSupported();
        int int57 = cpioArchiveInputStream54.getCount();
        cpioArchiveInputStream54.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry60 = null;
        boolean boolean61 = cpioArchiveInputStream54.canReadEntryData(archiveEntry60);
        boolean boolean62 = cpioArchiveInputStream54.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream54, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry65 = null;
        boolean boolean66 = cpioArchiveInputStream54.canReadEntryData(archiveEntry65);
        int int67 = cpioArchiveInputStream54.available();
        byte[] byteArray73 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int74 = cpioArchiveInputStream54.read(byteArray73);
        byte[] byteArray75 = cpioArchiveInputStream54.readAllBytes();
        int int76 = cpioArchiveInputStream5.read(byteArray75);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream78 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        cpioArchiveInputStream1.mark(512);
        byte[] byteArray6 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int8 = cpioArchiveInputStream1.available();
        long long9 = cpioArchiveInputStream1.getBytesRead();
        int int10 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        long long9 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        byte[] byteArray11 = cpioArchiveInputStream8.readAllBytes();
        int int12 = cpioArchiveInputStream8.available();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, (int) '4');
        byte[] byteArray18 = cpioArchiveInputStream14.readNBytes((int) (short) 1);
        int int19 = cpioArchiveInputStream8.read(byteArray18);
        int int20 = cpioArchiveInputStream1.read(byteArray18);
        long long21 = cpioArchiveInputStream1.getBytesRead();
        cpioArchiveInputStream1.mark(64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = cpioArchiveInputStream1.canReadEntryData(archiveEntry24);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray15 = cpioArchiveInputStream1.readAllBytes();
        long long17 = cpioArchiveInputStream1.skip((long) 32768);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream18);
        long long21 = cpioArchiveInputStream19.skip((long) (short) 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        int int12 = cpioArchiveInputStream1.read();
        int int13 = cpioArchiveInputStream1.getCount();
        int int14 = cpioArchiveInputStream1.getCount();
        long long16 = cpioArchiveInputStream1.skip((long) (short) 3);
        cpioArchiveInputStream1.mark(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '4');
        byte[] byteArray5 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = cpioArchiveInputStream1.readNBytes((int) (short) 4);
        long long18 = cpioArchiveInputStream1.skip(1L);
        cpioArchiveInputStream1.mark((int) (byte) 0);
        int int21 = cpioArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry22 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12);
        long long14 = cpioArchiveInputStream13.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream13);
        byte[] byteArray16 = cpioArchiveInputStream13.readAllBytes();
        int int17 = cpioArchiveInputStream13.available();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream19, (int) '4');
        byte[] byteArray23 = cpioArchiveInputStream19.readNBytes((int) (short) 1);
        int int24 = cpioArchiveInputStream13.read(byteArray23);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream13, (int) (short) 8);
        byte[] byteArray28 = cpioArchiveInputStream13.readNBytes(16);
        int int29 = cpioArchiveInputStream11.read(byteArray28);
        cpioArchiveInputStream11.mark((int) 'a');
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        int int34 = cpioArchiveInputStream33.read();
        java.io.InputStream inputStream35 = java.io.InputStream.nullInputStream();
        byte[] byteArray37 = inputStream35.readNBytes((int) (byte) 1);
        int int38 = cpioArchiveInputStream33.read(byteArray37);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream39);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int52 = cpioArchiveInputStream42.read(byteArray49, 4, (int) (byte) 0);
        int int53 = cpioArchiveInputStream40.read(byteArray49);
        int int54 = cpioArchiveInputStream33.read(byteArray49);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream55);
        int int57 = cpioArchiveInputStream56.read();
        java.io.InputStream inputStream58 = java.io.InputStream.nullInputStream();
        byte[] byteArray60 = inputStream58.readNBytes((int) (byte) 1);
        int int61 = cpioArchiveInputStream56.read(byteArray60);
        int int62 = cpioArchiveInputStream33.read(byteArray60);
        int int63 = cpioArchiveInputStream33.available();
        java.io.InputStream inputStream64 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream65 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream64);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int75 = cpioArchiveInputStream65.read(byteArray72, 4, (int) (byte) 0);
        int int78 = cpioArchiveInputStream33.readNBytes(byteArray72, (int) (byte) 0, 1);
        boolean boolean80 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray72, (int) (byte) -1);
        int int81 = cpioArchiveInputStream11.read(byteArray72);
        boolean boolean83 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray72, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(inputStream58);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream4 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream4.readAllBytes();
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        long long8 = cpioArchiveInputStream1.skip((long) 10);
        int int9 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 3);
        long long13 = cpioArchiveInputStream11.skip((long) 40960);
        int int14 = cpioArchiveInputStream11.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 32);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream17);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int28 = cpioArchiveInputStream18.read(byteArray25, 4, (int) (byte) 0);
        long long29 = cpioArchiveInputStream18.getBytesRead();
        boolean boolean30 = cpioArchiveInputStream18.markSupported();
        int int31 = cpioArchiveInputStream18.read();
        int int32 = cpioArchiveInputStream18.getCount();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream33);
        boolean boolean35 = cpioArchiveInputStream34.markSupported();
        boolean boolean36 = cpioArchiveInputStream34.markSupported();
        int int37 = cpioArchiveInputStream34.getCount();
        cpioArchiveInputStream34.mark((int) 'a');
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        byte[] byteArray42 = inputStream40.readNBytes((int) (byte) 1);
        int int43 = cpioArchiveInputStream34.read(byteArray42);
        int int44 = cpioArchiveInputStream18.read(byteArray42);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream46 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream45);
        boolean boolean47 = cpioArchiveInputStream46.markSupported();
        long long49 = cpioArchiveInputStream46.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream51 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream46, 0);
        java.io.InputStream inputStream52 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream54 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream52, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry55 = null;
        boolean boolean56 = cpioArchiveInputStream54.canReadEntryData(archiveEntry55);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry57 = null;
        boolean boolean58 = cpioArchiveInputStream54.canReadEntryData(archiveEntry57);
        java.io.InputStream inputStream59 = java.io.InputStream.nullInputStream();
        byte[] byteArray60 = inputStream59.readAllBytes();
        int int61 = cpioArchiveInputStream54.read(byteArray60);
        int int62 = cpioArchiveInputStream46.read(byteArray60);
        int int63 = cpioArchiveInputStream18.read(byteArray60);
        int int64 = cpioArchiveInputStream16.read(byteArray60);
        cpioArchiveInputStream16.mark(36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream67 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputStream4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(inputStream59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray2 = inputStream0.readNBytes((int) (byte) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (-1));
        long long6 = cpioArchiveInputStream4.skip(0L);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream4.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream4.skip((long) (short) 12);
        byte[] byteArray11 = cpioArchiveInputStream4.readAllBytes();
        boolean boolean12 = cpioArchiveInputStream4.markSupported();
        int int13 = cpioArchiveInputStream4.available();
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        cpioArchiveInputStream1.mark((int) (byte) 10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '#');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        boolean boolean11 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 4096);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        boolean boolean16 = cpioArchiveInputStream15.markSupported();
        boolean boolean17 = cpioArchiveInputStream15.markSupported();
        int int18 = cpioArchiveInputStream15.getCount();
        cpioArchiveInputStream15.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        boolean boolean22 = cpioArchiveInputStream15.canReadEntryData(archiveEntry21);
        boolean boolean23 = cpioArchiveInputStream15.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = null;
        boolean boolean27 = cpioArchiveInputStream15.canReadEntryData(archiveEntry26);
        int int28 = cpioArchiveInputStream15.available();
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int35 = cpioArchiveInputStream15.read(byteArray34);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream37);
        int int39 = cpioArchiveInputStream38.read();
        byte[] byteArray40 = cpioArchiveInputStream38.readAllBytes();
        byte[] byteArray41 = cpioArchiveInputStream38.readAllBytes();
        int int42 = cpioArchiveInputStream13.read(byteArray41);
        byte[] byteArray44 = cpioArchiveInputStream13.readNBytes(16384);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        boolean boolean13 = cpioArchiveInputStream12.markSupported();
        cpioArchiveInputStream12.mark(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = cpioArchiveInputStream1.canReadEntryData(archiveEntry10);
        cpioArchiveInputStream1.mark(8);
        int int14 = cpioArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        boolean boolean9 = cpioArchiveInputStream7.markSupported();
        java.io.InputStream inputStream10 = java.io.InputStream.nullInputStream();
        byte[] byteArray11 = inputStream10.readAllBytes();
        int int12 = cpioArchiveInputStream7.read(byteArray11);
        int int13 = cpioArchiveInputStream5.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        int int15 = cpioArchiveInputStream5.read();
        boolean boolean16 = cpioArchiveInputStream5.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, 10);
        int int26 = cpioArchiveInputStream23.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, (int) (short) 4);
        int int29 = cpioArchiveInputStream28.getCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, (int) '#');
        boolean boolean5 = cpioArchiveInputStream4.markSupported();
        byte[] byteArray6 = cpioArchiveInputStream4.readAllBytes();
        byte[] byteArray8 = cpioArchiveInputStream4.readNBytes(32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        byte[] byteArray11 = cpioArchiveInputStream4.readNBytes(4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        int int3 = cpioArchiveInputStream1.read();
        long long4 = cpioArchiveInputStream1.getBytesRead();
        byte[] byteArray6 = cpioArchiveInputStream1.readNBytes((int) (short) 1);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int18 = cpioArchiveInputStream8.read(byteArray15, 4, (int) (byte) 0);
        long long19 = cpioArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, (int) (short) 10);
        byte[] byteArray23 = cpioArchiveInputStream21.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream21, 512);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream26);
        long long28 = cpioArchiveInputStream27.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27);
        byte[] byteArray30 = cpioArchiveInputStream27.readAllBytes();
        long long32 = cpioArchiveInputStream27.skip((long) 16);
        int int33 = cpioArchiveInputStream27.getCount();
        byte[] byteArray34 = cpioArchiveInputStream27.readAllBytes();
        int int35 = cpioArchiveInputStream25.read(byteArray34);
        int int36 = cpioArchiveInputStream1.read(byteArray34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 100);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        boolean boolean11 = cpioArchiveInputStream10.markSupported();
        boolean boolean12 = cpioArchiveInputStream10.markSupported();
        int int13 = cpioArchiveInputStream10.getCount();
        cpioArchiveInputStream10.mark((int) 'a');
        long long16 = cpioArchiveInputStream10.getBytesRead();
        long long18 = cpioArchiveInputStream10.skip((long) 2048);
        byte[] byteArray20 = cpioArchiveInputStream10.readNBytes((int) (short) 12);
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 100);
        long long24 = cpioArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream1.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 0);
        boolean boolean11 = cpioArchiveInputStream10.markSupported();
        int int12 = cpioArchiveInputStream10.read();
        long long14 = cpioArchiveInputStream10.skip(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray12 = cpioArchiveInputStream1.readNBytes(256);
        byte[] byteArray13 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 40960);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, 64);
        long long18 = cpioArchiveInputStream17.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int24 = cpioArchiveInputStream14.read(byteArray21, 4, (int) (byte) 0);
        long long25 = cpioArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, (int) (short) 10);
        byte[] byteArray29 = cpioArchiveInputStream27.readNBytes((int) ' ');
        long long31 = cpioArchiveInputStream27.skip((long) (byte) 100);
        byte[] byteArray32 = cpioArchiveInputStream27.readAllBytes();
        int int33 = cpioArchiveInputStream5.read(byteArray32);
        byte[] byteArray35 = cpioArchiveInputStream5.readNBytes(128);
        long long37 = cpioArchiveInputStream5.skip((long) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray39 = cpioArchiveInputStream5.readNBytes((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: len < 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        boolean boolean12 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = cpioArchiveInputStream1.canReadEntryData(archiveEntry17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry19 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        boolean boolean5 = cpioArchiveInputStream4.markSupported();
        long long7 = cpioArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 0);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream12.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = inputStream17.readAllBytes();
        int int19 = cpioArchiveInputStream12.read(byteArray18);
        int int20 = cpioArchiveInputStream4.read(byteArray18);
        int int21 = cpioArchiveInputStream1.read(byteArray18);
        long long22 = cpioArchiveInputStream1.getBytesRead();
        long long24 = cpioArchiveInputStream1.skip((long) 10);
        int int25 = cpioArchiveInputStream1.available();
        byte[] byteArray26 = cpioArchiveInputStream1.readAllBytes();
        byte[] byteArray28 = cpioArchiveInputStream1.readNBytes((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        byte[] byteArray16 = cpioArchiveInputStream14.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 512);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long21 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        long long24 = cpioArchiveInputStream22.skip((long) (short) 100);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        int int27 = cpioArchiveInputStream26.read();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = inputStream28.readNBytes((int) (byte) 1);
        int int31 = cpioArchiveInputStream26.read(byteArray30);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int45 = cpioArchiveInputStream35.read(byteArray42, 4, (int) (byte) 0);
        int int46 = cpioArchiveInputStream33.read(byteArray42);
        int int47 = cpioArchiveInputStream26.read(byteArray42);
        int int48 = cpioArchiveInputStream22.read(byteArray42);
        boolean boolean49 = cpioArchiveInputStream22.markSupported();
        byte[] byteArray50 = cpioArchiveInputStream22.readAllBytes();
        byte[] byteArray51 = cpioArchiveInputStream22.readAllBytes();
        int int52 = cpioArchiveInputStream14.read(byteArray51);
        byte[] byteArray53 = cpioArchiveInputStream14.readAllBytes();
        java.io.InputStream inputStream54 = java.io.InputStream.nullInputStream();
        byte[] byteArray56 = inputStream54.readNBytes((int) (byte) 1);
        boolean boolean58 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray56, (int) (short) -1);
        int int59 = cpioArchiveInputStream14.read(byteArray56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream60 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14);
        cpioArchiveInputStream60.mark((int) (short) 12);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        int int10 = cpioArchiveInputStream6.read();
        cpioArchiveInputStream6.mark(61440);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int24 = cpioArchiveInputStream14.read(byteArray21, 4, (int) (byte) 0);
        java.io.InputStream inputStream25 = java.io.InputStream.nullInputStream();
        byte[] byteArray26 = inputStream25.readAllBytes();
        int int27 = cpioArchiveInputStream14.read(byteArray26);
        int int28 = cpioArchiveInputStream6.read(byteArray26);
        byte[] byteArray29 = cpioArchiveInputStream6.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray29, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        int int10 = cpioArchiveInputStream6.read();
        cpioArchiveInputStream6.mark(61440);
        long long14 = cpioArchiveInputStream6.skip((long) 32);
        int int15 = cpioArchiveInputStream6.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, 1024);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = cpioArchiveInputStream17.transferTo(outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int10 = cpioArchiveInputStream1.getCount();
        int int11 = cpioArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        int int15 = cpioArchiveInputStream14.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry16 = cpioArchiveInputStream14.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        int int6 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 256);
        byte[] byteArray10 = cpioArchiveInputStream1.readNBytes(16384);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 4);
        long long16 = cpioArchiveInputStream15.getBytesRead();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        boolean boolean8 = cpioArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream5.canReadEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 24576);
        boolean boolean13 = cpioArchiveInputStream5.markSupported();
        byte[] byteArray15 = cpioArchiveInputStream5.readNBytes(0);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        int int19 = cpioArchiveInputStream18.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = null;
        boolean boolean21 = cpioArchiveInputStream18.canReadEntryData(archiveEntry20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream18.canReadEntryData(archiveEntry22);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = cpioArchiveInputStream18.canReadEntryData(archiveEntry24);
        boolean boolean26 = cpioArchiveInputStream18.markSupported();
        byte[] byteArray28 = cpioArchiveInputStream18.readNBytes((int) (byte) 0);
        int int29 = cpioArchiveInputStream5.read(byteArray28);
        boolean boolean30 = cpioArchiveInputStream5.markSupported();
        long long32 = cpioArchiveInputStream5.skip((long) 61440);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long4 = cpioArchiveInputStream3.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        int int7 = cpioArchiveInputStream3.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray7 = cpioArchiveInputStream5.readNBytes(100);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        long long10 = cpioArchiveInputStream5.skip((long) (short) 12);
        byte[] byteArray11 = cpioArchiveInputStream5.readAllBytes();
        int int12 = cpioArchiveInputStream5.read();
        int int13 = cpioArchiveInputStream5.read();
        int int14 = cpioArchiveInputStream5.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 128);
        long long16 = cpioArchiveInputStream15.getBytesRead();
        int int17 = cpioArchiveInputStream15.available();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        byte[] byteArray7 = cpioArchiveInputStream6.readAllBytes();
        boolean boolean8 = cpioArchiveInputStream6.markSupported();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        byte[] byteArray6 = cpioArchiveInputStream5.readAllBytes();
        long long8 = cpioArchiveInputStream5.skip((long) 36864);
        java.lang.Class<?> wildcardClass9 = cpioArchiveInputStream5.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = cpioArchiveInputStream1.readNBytes((int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = cpioArchiveInputStream17.canReadEntryData(archiveEntry18);
        boolean boolean20 = cpioArchiveInputStream17.markSupported();
        long long21 = cpioArchiveInputStream17.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        int int13 = cpioArchiveInputStream1.available();
        byte[] byteArray14 = cpioArchiveInputStream1.readAllBytes();
        int int15 = cpioArchiveInputStream1.getCount();
        java.lang.Class<?> wildcardClass16 = cpioArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray9 = cpioArchiveInputStream8.readAllBytes();
        long long10 = cpioArchiveInputStream8.getBytesRead();
        int int11 = cpioArchiveInputStream8.available();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12);
        int int15 = cpioArchiveInputStream14.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = null;
        boolean boolean17 = cpioArchiveInputStream14.canReadEntryData(archiveEntry16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = null;
        boolean boolean19 = cpioArchiveInputStream14.canReadEntryData(archiveEntry18);
        long long21 = cpioArchiveInputStream14.skip((long) 32);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        boolean boolean24 = cpioArchiveInputStream23.markSupported();
        boolean boolean25 = cpioArchiveInputStream23.markSupported();
        int int26 = cpioArchiveInputStream23.getCount();
        cpioArchiveInputStream23.mark((int) 'a');
        java.io.InputStream inputStream29 = java.io.InputStream.nullInputStream();
        byte[] byteArray31 = inputStream29.readNBytes((int) (byte) 1);
        int int32 = cpioArchiveInputStream23.read(byteArray31);
        byte[] byteArray33 = cpioArchiveInputStream23.readAllBytes();
        int int34 = cpioArchiveInputStream14.read(byteArray33);
        byte[] byteArray36 = cpioArchiveInputStream14.readNBytes(61440);
        int int37 = cpioArchiveInputStream14.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14);
        long long39 = cpioArchiveInputStream14.getBytesRead();
        byte[] byteArray40 = cpioArchiveInputStream14.readAllBytes();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream43);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int54 = cpioArchiveInputStream44.read(byteArray51, 4, (int) (byte) 0);
        int int55 = cpioArchiveInputStream42.read(byteArray51);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry56 = null;
        boolean boolean57 = cpioArchiveInputStream42.canReadEntryData(archiveEntry56);
        int int58 = cpioArchiveInputStream42.read();
        byte[] byteArray60 = cpioArchiveInputStream42.readNBytes((int) '#');
        int int61 = cpioArchiveInputStream14.read(byteArray60);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, (int) (byte) 10);
        byte[] byteArray64 = cpioArchiveInputStream14.readAllBytes();
        boolean boolean66 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray64, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int69 = cpioArchiveInputStream8.readNBytes(byteArray64, 100, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [100, 100 + 4096) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream12.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = inputStream17.readAllBytes();
        int int19 = cpioArchiveInputStream12.read(byteArray18);
        long long21 = cpioArchiveInputStream12.skip((long) 256);
        byte[] byteArray23 = cpioArchiveInputStream12.readNBytes(1);
        int int24 = cpioArchiveInputStream1.read(byteArray23);
        long long25 = cpioArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        long long4 = cpioArchiveInputStream1.skip((long) 36864);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        long long7 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        int int10 = cpioArchiveInputStream9.read();
        long long12 = cpioArchiveInputStream9.skip(0L);
        byte[] byteArray13 = cpioArchiveInputStream9.readAllBytes();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream9.canReadEntryData(archiveEntry14);
        int int16 = cpioArchiveInputStream9.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long4 = cpioArchiveInputStream3.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        byte[] byteArray7 = cpioArchiveInputStream3.readNBytes(0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, (-1));
        int int9 = cpioArchiveInputStream6.available();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long5 = cpioArchiveInputStream3.skip((long) (short) 100);
        long long6 = cpioArchiveInputStream3.getBytesRead();
        byte[] byteArray8 = cpioArchiveInputStream3.readNBytes(61440);
        int int9 = cpioArchiveInputStream3.getCount();
        cpioArchiveInputStream3.mark((int) (short) 100);
        cpioArchiveInputStream3.mark((int) (byte) 100);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14);
        long long16 = cpioArchiveInputStream15.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream19, (-1));
        boolean boolean22 = cpioArchiveInputStream19.markSupported();
        byte[] byteArray24 = cpioArchiveInputStream19.readNBytes((int) (short) 0);
        int int25 = cpioArchiveInputStream3.read(byteArray24);
        boolean boolean26 = cpioArchiveInputStream3.markSupported();
        byte[] byteArray27 = cpioArchiveInputStream3.readAllBytes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) (byte) 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream14.canReadEntryData(archiveEntry15);
        int int17 = cpioArchiveInputStream14.read();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        boolean boolean5 = cpioArchiveInputStream4.markSupported();
        long long7 = cpioArchiveInputStream4.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 0);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream12.canReadEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream12.canReadEntryData(archiveEntry15);
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray18 = inputStream17.readAllBytes();
        int int19 = cpioArchiveInputStream12.read(byteArray18);
        int int20 = cpioArchiveInputStream4.read(byteArray18);
        int int21 = cpioArchiveInputStream1.read(byteArray18);
        byte[] byteArray23 = cpioArchiveInputStream1.readNBytes((int) (short) 0);
        byte[] byteArray24 = cpioArchiveInputStream1.readAllBytes();
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = cpioArchiveInputStream1.transferTo(outputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        int int6 = cpioArchiveInputStream5.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        long long9 = cpioArchiveInputStream5.skip((long) (short) 2);
        long long11 = cpioArchiveInputStream5.skip((long) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 4096);
        int int14 = cpioArchiveInputStream13.read();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream2.canReadEntryData(archiveEntry6);
        long long9 = cpioArchiveInputStream2.skip((long) 32);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        boolean boolean12 = cpioArchiveInputStream11.markSupported();
        boolean boolean13 = cpioArchiveInputStream11.markSupported();
        int int14 = cpioArchiveInputStream11.getCount();
        cpioArchiveInputStream11.mark((int) 'a');
        java.io.InputStream inputStream17 = java.io.InputStream.nullInputStream();
        byte[] byteArray19 = inputStream17.readNBytes((int) (byte) 1);
        int int20 = cpioArchiveInputStream11.read(byteArray19);
        byte[] byteArray21 = cpioArchiveInputStream11.readAllBytes();
        int int22 = cpioArchiveInputStream2.read(byteArray21);
        byte[] byteArray24 = cpioArchiveInputStream2.readNBytes(61440);
        int int25 = cpioArchiveInputStream2.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        int int27 = cpioArchiveInputStream26.available();
        boolean boolean28 = cpioArchiveInputStream26.markSupported();
        int int29 = cpioArchiveInputStream26.read();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(inputStream17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        byte[] byteArray16 = cpioArchiveInputStream14.readNBytes((int) ' ');
        long long18 = cpioArchiveInputStream14.skip((long) (byte) 100);
        boolean boolean19 = cpioArchiveInputStream14.markSupported();
        cpioArchiveInputStream14.mark((int) 'a');
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        boolean boolean10 = cpioArchiveInputStream9.markSupported();
        boolean boolean11 = cpioArchiveInputStream9.markSupported();
        int int12 = cpioArchiveInputStream9.getCount();
        cpioArchiveInputStream9.mark((int) 'a');
        java.io.InputStream inputStream15 = java.io.InputStream.nullInputStream();
        byte[] byteArray17 = inputStream15.readNBytes((int) (byte) 1);
        int int18 = cpioArchiveInputStream9.read(byteArray17);
        byte[] byteArray19 = cpioArchiveInputStream9.readAllBytes();
        int int20 = cpioArchiveInputStream7.read(byteArray19);
        int int21 = cpioArchiveInputStream7.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        byte[] byteArray25 = cpioArchiveInputStream7.readNBytes(64);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(inputStream15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        boolean boolean12 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = cpioArchiveInputStream1.canReadEntryData(archiveEntry15);
        int int17 = cpioArchiveInputStream1.getCount();
        int int18 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = null;
        boolean boolean20 = cpioArchiveInputStream1.canReadEntryData(archiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
        long long8 = cpioArchiveInputStream6.skip((long) ' ');
        int int9 = cpioArchiveInputStream6.read();
        int int10 = cpioArchiveInputStream6.read();
        int int11 = cpioArchiveInputStream6.getCount();
        int int12 = cpioArchiveInputStream6.available();
        long long14 = cpioArchiveInputStream6.skip((long) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        java.lang.Class<?> wildcardClass16 = cpioArchiveInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        byte[] byteArray1 = inputStream0.readAllBytes();
        inputStream0.mark((int) (short) -1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 29127);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        boolean boolean8 = cpioArchiveInputStream7.markSupported();
        boolean boolean9 = cpioArchiveInputStream7.markSupported();
        int int10 = cpioArchiveInputStream7.getCount();
        cpioArchiveInputStream7.mark((int) 'a');
        int int13 = cpioArchiveInputStream7.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, 512);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream15);
        byte[] byteArray17 = cpioArchiveInputStream15.readAllBytes();
        int int18 = cpioArchiveInputStream5.read(byteArray17);
        byte[] byteArray20 = cpioArchiveInputStream5.readNBytes((int) ' ');
        boolean boolean21 = cpioArchiveInputStream5.markSupported();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        boolean boolean24 = cpioArchiveInputStream23.markSupported();
        boolean boolean25 = cpioArchiveInputStream23.markSupported();
        int int26 = cpioArchiveInputStream23.getCount();
        cpioArchiveInputStream23.mark((int) 'a');
        long long29 = cpioArchiveInputStream23.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, (int) (byte) 100);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        long long34 = cpioArchiveInputStream33.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream33);
        byte[] byteArray36 = cpioArchiveInputStream33.readAllBytes();
        int int37 = cpioArchiveInputStream31.read(byteArray36);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream38);
        long long40 = cpioArchiveInputStream39.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream39);
        long long43 = cpioArchiveInputStream41.skip((long) (short) 100);
        long long44 = cpioArchiveInputStream41.getBytesRead();
        byte[] byteArray46 = cpioArchiveInputStream41.readNBytes(61440);
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream48 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream47);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream48);
        int int50 = cpioArchiveInputStream49.read();
        java.io.InputStream inputStream51 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream52 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream51);
        boolean boolean53 = cpioArchiveInputStream52.markSupported();
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream54);
        long long56 = cpioArchiveInputStream55.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream59 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream55, 8);
        cpioArchiveInputStream59.mark((int) (short) 2);
        byte[] byteArray62 = cpioArchiveInputStream59.readAllBytes();
        int int63 = cpioArchiveInputStream52.read(byteArray62);
        int int64 = cpioArchiveInputStream49.read(byteArray62);
        int int65 = cpioArchiveInputStream41.read(byteArray62);
        int int66 = cpioArchiveInputStream31.read(byteArray62);
        java.io.InputStream inputStream67 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream68 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream67);
        long long69 = cpioArchiveInputStream68.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream70 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream68);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream72 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream68, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream74 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream72, (-1));
        boolean boolean75 = cpioArchiveInputStream72.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry76 = null;
        boolean boolean77 = cpioArchiveInputStream72.canReadEntryData(archiveEntry76);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream79 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream72, 24576);
        int int80 = cpioArchiveInputStream79.available();
        java.io.InputStream inputStream81 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream82 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream81);
        boolean boolean83 = cpioArchiveInputStream82.markSupported();
        boolean boolean84 = cpioArchiveInputStream82.markSupported();
        int int85 = cpioArchiveInputStream82.getCount();
        cpioArchiveInputStream82.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry88 = null;
        boolean boolean89 = cpioArchiveInputStream82.canReadEntryData(archiveEntry88);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream90 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream82);
        byte[] byteArray91 = cpioArchiveInputStream82.readAllBytes();
        int int92 = cpioArchiveInputStream79.read(byteArray91);
        int int95 = cpioArchiveInputStream31.read(byteArray91, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = cpioArchiveInputStream5.read(byteArray91, (int) (short) 4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inputStream0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] {});
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        int int3 = cpioArchiveInputStream1.read();
        boolean boolean4 = cpioArchiveInputStream1.markSupported();
        int int5 = cpioArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        cpioArchiveInputStream1.mark(16);
        int int17 = cpioArchiveInputStream1.read();
        long long18 = cpioArchiveInputStream1.getBytesRead();
        int int19 = cpioArchiveInputStream1.read();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        long long12 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 10);
        byte[] byteArray16 = cpioArchiveInputStream14.readNBytes((int) ' ');
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 512);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long21 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        long long24 = cpioArchiveInputStream22.skip((long) (short) 100);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        int int27 = cpioArchiveInputStream26.read();
        java.io.InputStream inputStream28 = java.io.InputStream.nullInputStream();
        byte[] byteArray30 = inputStream28.readNBytes((int) (byte) 1);
        int int31 = cpioArchiveInputStream26.read(byteArray30);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream32);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream34);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int45 = cpioArchiveInputStream35.read(byteArray42, 4, (int) (byte) 0);
        int int46 = cpioArchiveInputStream33.read(byteArray42);
        int int47 = cpioArchiveInputStream26.read(byteArray42);
        int int48 = cpioArchiveInputStream22.read(byteArray42);
        boolean boolean49 = cpioArchiveInputStream22.markSupported();
        byte[] byteArray50 = cpioArchiveInputStream22.readAllBytes();
        byte[] byteArray51 = cpioArchiveInputStream22.readAllBytes();
        int int52 = cpioArchiveInputStream14.read(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        long long7 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean8 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray10 = cpioArchiveInputStream1.readNBytes((int) (short) 8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = cpioArchiveInputStream1.canReadEntryData(archiveEntry11);
        cpioArchiveInputStream1.mark(8);
        boolean boolean15 = cpioArchiveInputStream1.markSupported();
        byte[] byteArray16 = cpioArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        long long15 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean16 = cpioArchiveInputStream1.markSupported();
        java.lang.Class<?> wildcardClass17 = cpioArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int21 = cpioArchiveInputStream11.read(byteArray18, 4, (int) (byte) 0);
        long long22 = cpioArchiveInputStream11.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, (int) (short) 10);
        byte[] byteArray26 = cpioArchiveInputStream24.readNBytes((int) ' ');
        int int27 = cpioArchiveInputStream1.read(byteArray26);
        int int28 = cpioArchiveInputStream1.read();
        long long30 = cpioArchiveInputStream1.skip(10L);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        int int12 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) (byte) 0);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        boolean boolean17 = cpioArchiveInputStream16.markSupported();
        boolean boolean18 = cpioArchiveInputStream16.markSupported();
        int int19 = cpioArchiveInputStream16.getCount();
        cpioArchiveInputStream16.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = null;
        boolean boolean23 = cpioArchiveInputStream16.canReadEntryData(archiveEntry22);
        boolean boolean24 = cpioArchiveInputStream16.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16, (int) (short) 12);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream27);
        boolean boolean29 = cpioArchiveInputStream28.markSupported();
        boolean boolean30 = cpioArchiveInputStream28.markSupported();
        int int31 = cpioArchiveInputStream28.getCount();
        cpioArchiveInputStream28.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = cpioArchiveInputStream28.canReadEntryData(archiveEntry34);
        long long37 = cpioArchiveInputStream28.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream39 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream28, (int) (short) 1);
        int int40 = cpioArchiveInputStream39.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream39);
        byte[] byteArray42 = cpioArchiveInputStream39.readAllBytes();
        int int43 = cpioArchiveInputStream26.read(byteArray42);
        int int44 = cpioArchiveInputStream1.read(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream3 = java.io.InputStream.nullInputStream();
        byte[] byteArray5 = inputStream3.readNBytes((int) (byte) 1);
        int int6 = cpioArchiveInputStream1.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int20 = cpioArchiveInputStream10.read(byteArray17, 4, (int) (byte) 0);
        int int21 = cpioArchiveInputStream8.read(byteArray17);
        int int22 = cpioArchiveInputStream1.read(byteArray17);
        byte[] byteArray23 = cpioArchiveInputStream1.readAllBytes();
        int int24 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        long long4 = cpioArchiveInputStream1.skip((long) 64);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 100);
        int int9 = cpioArchiveInputStream8.getCount();
        long long10 = cpioArchiveInputStream8.getBytesRead();
        byte[] byteArray11 = cpioArchiveInputStream8.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = cpioArchiveInputStream8.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        int int15 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 32768);
        byte[] byteArray18 = cpioArchiveInputStream17.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int11 = cpioArchiveInputStream1.read(byteArray8, 4, (int) (byte) 0);
        java.io.InputStream inputStream12 = java.io.InputStream.nullInputStream();
        byte[] byteArray13 = inputStream12.readAllBytes();
        int int14 = cpioArchiveInputStream1.read(byteArray13);
        byte[] byteArray16 = cpioArchiveInputStream1.readNBytes((int) (short) 4);
        long long18 = cpioArchiveInputStream1.skip(1L);
        cpioArchiveInputStream1.mark((int) (byte) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 1);
        int int23 = cpioArchiveInputStream1.read();
        long long24 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = cpioArchiveInputStream1.canReadEntryData(archiveEntry25);
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = cpioArchiveInputStream1.transferTo(outputStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int11 = cpioArchiveInputStream1.read();
        boolean boolean12 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = cpioArchiveInputStream1.canReadEntryData(archiveEntry13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 10);
        cpioArchiveInputStream23.mark(24576);
        byte[] byteArray27 = cpioArchiveInputStream23.readNBytes((int) (short) 10);
        long long29 = cpioArchiveInputStream23.skip((long) (short) 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        long long5 = cpioArchiveInputStream4.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 8);
        cpioArchiveInputStream8.mark((int) (short) 2);
        byte[] byteArray11 = cpioArchiveInputStream8.readAllBytes();
        int int12 = cpioArchiveInputStream1.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        java.io.InputStream inputStream7 = java.io.InputStream.nullInputStream();
        byte[] byteArray9 = inputStream7.readNBytes((int) (byte) 1);
        int int10 = cpioArchiveInputStream1.read(byteArray9);
        byte[] byteArray11 = cpioArchiveInputStream1.readAllBytes();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        boolean boolean13 = cpioArchiveInputStream12.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(inputStream7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream1.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = cpioArchiveInputStream8.canReadEntryData(archiveEntry9);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream11);
        long long13 = cpioArchiveInputStream12.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16, (-1));
        boolean boolean19 = cpioArchiveInputStream16.markSupported();
        byte[] byteArray21 = cpioArchiveInputStream16.readNBytes((int) (short) 0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream23);
        boolean boolean25 = cpioArchiveInputStream24.markSupported();
        boolean boolean26 = cpioArchiveInputStream24.markSupported();
        int int27 = cpioArchiveInputStream24.getCount();
        cpioArchiveInputStream24.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = null;
        boolean boolean31 = cpioArchiveInputStream24.canReadEntryData(archiveEntry30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream24);
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream33, (int) (short) 3);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = cpioArchiveInputStream35.canReadEntryData(archiveEntry36);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = null;
        boolean boolean39 = cpioArchiveInputStream35.canReadEntryData(archiveEntry38);
        java.io.InputStream inputStream40 = java.io.InputStream.nullInputStream();
        byte[] byteArray41 = inputStream40.readAllBytes();
        int int42 = cpioArchiveInputStream35.read(byteArray41);
        int int43 = cpioArchiveInputStream24.read(byteArray41);
        byte[] byteArray45 = cpioArchiveInputStream24.readNBytes(100);
        int int46 = cpioArchiveInputStream16.read(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = cpioArchiveInputStream8.readNBytes(byteArray45, 40960, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [40960, 40960 + -1) out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.available();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = cpioArchiveInputStream1.canReadEntryData(archiveEntry5);
        int int7 = cpioArchiveInputStream1.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream8);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int19 = cpioArchiveInputStream9.read(byteArray16, 4, (int) (byte) 0);
        long long20 = cpioArchiveInputStream9.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, (int) (short) 10);
        long long24 = cpioArchiveInputStream22.skip((long) (short) 3);
        byte[] byteArray25 = cpioArchiveInputStream22.readAllBytes();
        byte[] byteArray27 = cpioArchiveInputStream22.readNBytes(0);
        byte[] byteArray29 = cpioArchiveInputStream22.readNBytes(8);
        int int30 = cpioArchiveInputStream1.read(byteArray29);
        boolean boolean31 = cpioArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream1.canReadEntryData(archiveEntry4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = cpioArchiveInputStream1.canReadEntryData(archiveEntry6);
        int int8 = cpioArchiveInputStream1.read();
        byte[] byteArray9 = cpioArchiveInputStream1.readAllBytes();
        int int10 = cpioArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        cpioArchiveInputStream5.mark((int) (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, (-1));
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream11.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, 0);
        byte[] byteArray16 = cpioArchiveInputStream15.readAllBytes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        long long10 = cpioArchiveInputStream1.skip((long) 128);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 1);
        int int13 = cpioArchiveInputStream12.available();
        byte[] byteArray14 = cpioArchiveInputStream12.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int3 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        boolean boolean5 = cpioArchiveInputStream2.canReadEntryData(archiveEntry4);
        int int6 = cpioArchiveInputStream2.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 32768);
        int int9 = cpioArchiveInputStream8.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8);
        byte[] byteArray12 = cpioArchiveInputStream10.readNBytes(100);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int26 = cpioArchiveInputStream16.read(byteArray23, 4, (int) (byte) 0);
        int int27 = cpioArchiveInputStream14.read(byteArray23);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = null;
        boolean boolean29 = cpioArchiveInputStream14.canReadEntryData(archiveEntry28);
        int int30 = cpioArchiveInputStream14.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry31 = null;
        boolean boolean32 = cpioArchiveInputStream14.canReadEntryData(archiveEntry31);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, 49152);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream35);
        boolean boolean37 = cpioArchiveInputStream36.markSupported();
        boolean boolean38 = cpioArchiveInputStream36.markSupported();
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream39);
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int50 = cpioArchiveInputStream40.read(byteArray47, 4, (int) (byte) 0);
        java.io.InputStream inputStream51 = java.io.InputStream.nullInputStream();
        byte[] byteArray52 = inputStream51.readAllBytes();
        int int53 = cpioArchiveInputStream40.read(byteArray52);
        int int54 = cpioArchiveInputStream36.read(byteArray52);
        int int55 = cpioArchiveInputStream34.read(byteArray52);
        int int56 = cpioArchiveInputStream10.read(byteArray52);
        byte[] byteArray57 = cpioArchiveInputStream10.readAllBytes();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = cpioArchiveInputStream1.canReadEntryData(archiveEntry7);
        boolean boolean9 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (short) 12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        int int14 = cpioArchiveInputStream1.available();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        int int21 = cpioArchiveInputStream1.read(byteArray20);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream23, 10);
        byte[] byteArray27 = cpioArchiveInputStream25.readNBytes((int) '4');
        cpioArchiveInputStream25.mark(8);
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream31 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream30);
        int int33 = cpioArchiveInputStream32.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry34 = null;
        boolean boolean35 = cpioArchiveInputStream32.canReadEntryData(archiveEntry34);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry36 = null;
        boolean boolean37 = cpioArchiveInputStream32.canReadEntryData(archiveEntry36);
        long long39 = cpioArchiveInputStream32.skip((long) 32);
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream40);
        boolean boolean42 = cpioArchiveInputStream41.markSupported();
        boolean boolean43 = cpioArchiveInputStream41.markSupported();
        int int44 = cpioArchiveInputStream41.getCount();
        cpioArchiveInputStream41.mark((int) 'a');
        java.io.InputStream inputStream47 = java.io.InputStream.nullInputStream();
        byte[] byteArray49 = inputStream47.readNBytes((int) (byte) 1);
        int int50 = cpioArchiveInputStream41.read(byteArray49);
        byte[] byteArray51 = cpioArchiveInputStream41.readAllBytes();
        int int52 = cpioArchiveInputStream32.read(byteArray51);
        byte[] byteArray54 = cpioArchiveInputStream32.readNBytes(61440);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream56 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream55);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream58 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, (int) '4');
        byte[] byteArray60 = cpioArchiveInputStream56.readNBytes((int) (short) 1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream62 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream56, 64);
        boolean boolean63 = cpioArchiveInputStream56.markSupported();
        byte[] byteArray65 = cpioArchiveInputStream56.readNBytes((int) (short) 12);
        int int66 = cpioArchiveInputStream32.read(byteArray65);
        int int67 = cpioArchiveInputStream25.read(byteArray65);
        java.io.InputStream inputStream68 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream69 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream68);
        long long70 = cpioArchiveInputStream69.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream69);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream73 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream69, 8);
        cpioArchiveInputStream73.mark((int) (short) 2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream77 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream73, (int) (short) 4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream79 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream77, (-1));
        java.io.InputStream inputStream80 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream81 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream80);
        byte[] byteArray88 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        int int91 = cpioArchiveInputStream81.read(byteArray88, 4, (int) (byte) 0);
        long long92 = cpioArchiveInputStream81.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream94 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream81, (int) (short) 10);
        boolean boolean95 = cpioArchiveInputStream94.markSupported();
        byte[] byteArray97 = cpioArchiveInputStream94.readNBytes(4);
        int int98 = cpioArchiveInputStream79.read(byteArray97);
        int int99 = cpioArchiveInputStream25.read(byteArray97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(inputStream47);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 0L + "'", long92 == 0L);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertArrayEquals(byteArray97, new byte[] {});
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        int int2 = cpioArchiveInputStream1.available();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 1024);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        byte[] byteArray9 = cpioArchiveInputStream1.readNBytes(512);
        long long11 = cpioArchiveInputStream1.skip((long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        boolean boolean2 = cpioArchiveInputStream1.markSupported();
        boolean boolean3 = cpioArchiveInputStream1.markSupported();
        int int4 = cpioArchiveInputStream1.getCount();
        cpioArchiveInputStream1.mark((int) 'a');
        long long7 = cpioArchiveInputStream1.getBytesRead();
        long long9 = cpioArchiveInputStream1.skip((long) 2048);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long11 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = cpioArchiveInputStream1.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        boolean boolean15 = cpioArchiveInputStream1.canReadEntryData(archiveEntry14);
        int int16 = cpioArchiveInputStream1.available();
        byte[] byteArray17 = cpioArchiveInputStream1.readAllBytes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long2 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, (-1));
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        long long9 = cpioArchiveInputStream7.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, 24576);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = cpioArchiveInputStream7.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }
}

